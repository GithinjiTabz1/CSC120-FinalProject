
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class that runs the Candy Land game.
 * Guides the player through spinning, moving, and entering special locations.
 */
public class main {

    public static void main(String[] args) {
      //scanner
        Scanner scanner = new Scanner(System.in);
        
        //making the spinner
        FullSpinner spinner = new FullSpinner(); 
        spinner.addParts();
        spinner.spin();

        //making the map
        ArrayList<Map> map = new ArrayList<>();
        String[] colors = {"Red", "Purple", "Yellow", "Blue", "Orange", "Green"};


        for (int i = 0; i < 60; i++){
            String color = colors[i % colors.length];
            String location = "None"; 
           
           //setting locations so that we can assign tiles to specific special locations  


            if (i == 15) {
              location = "Peppermint";
          }

          else if (i ==22){
            location = "Nana's Nuthouse";
          }

          else if (i ==37){
            location = "Licorice Lagoon";
          }

          else if (i ==47){
            location = "Lollipop Castle";
          }

          else if (i ==52){
            location = "Frosted Palace";
          }

  
            
          Map tiles = new Map(false, color, "None");
          map.add(tiles);
          }


        String name = Player.enterName();
        Player player = new Player(name,0);    
    
        //starting display

        System.out.println("Welcome to Candy Land, " + name + "  ");

        System.out.println("You are currently on Tile " + player.getCurrPosition());

      //  Main game loop
        while (player.getIsAlive()) {
            System.out.println("\n Spin the wheel to move forward!");
            System.out.print("Press Enter to spin the wheel...");

            scanner.nextLine();
            SpinnerPart SpinnerOutput = spinner.spin();
            String part = SpinnerOutput.getColor();
      
            System.out.println(spinner);

            System.out.println("Congratulations! You have spun a " + SpinnerOutput.getColor() + ". You can now advance ahead to the " + SpinnerOutput.getColor() + " tile.");


            //moving our player using our spinner output 
            player.move(SpinnerOutput,map);
            spinner.removeVisitedCandies(part);

            //displaying our players movements
            Player.displayMotion(player, map);
                    

         //  Handle special locations
            String currPosition = SpinnerOutput.getColor();

            if (player.getPositionIndex() == 15 || currPosition.equals("Peppermint"))   {

                System.out.println("Suddenly, you are surrounded by the sweet,cool,minty aroma of peppermint . Before your very eyes immense red and white pinstriped trees sprout from the floor and surround you. You are now in ......the Peppermint forest.To wander deeper in, enter any number.");
                int playerInput = scanner.nextInt();
                PeppermintForest peppermint = new PeppermintForest("Peppermint Forest",playerInput);
                scanner.nextLine();
                peppermint.printPathName(); 
                PeppermintForest.startChallenge();
            }      

                

             else if (player.getPositionIndex() == 22 || currPosition.equals("Peanut") ) {
             
                System.out.println("Awww nuts!!!You find yourself infront of the delicious...yet very dangerous Nana's nuthouse. To advance, press any number to come in !");
                  int playerInput = scanner.nextInt();
                  NanaNutHouse nana = new NanaNutHouse("Nana's Nuthouse",playerInput);
                  scanner.nextLine();

                  boolean crossedBridge = nana.chocoBridgeNumber(player, scanner);

                  if (crossedBridge) {
                    System.out.println("Teleporting you to Licorice Lagoon...");
                    System.out.println("It's sticky ! It's sweet ! And it has gotten up to your knees! You have stumbled into the sticky.....Licorice Lagoon. Waddle in! Discover more! And to do so , just enter your favorite number here!");
                    playerInput = scanner.nextInt();
                    LicoriceLagoon lagoon = new LicoriceLagoon("Licorice Lagoon", playerInput);
                    lagoon.printPathName();
                    scanner.nextLine();
                    lagoon.startChallenge();
                  }
                      
              
            }
             
             else if (player.getPositionIndex() ==  37 || currPosition.equals("Licorice")  ) {
                System.out.println("It's sticky ! It's sweet ! And it has gotten up to your knees! You have stumbled into the sticky.....Licorice Lagoon. Waddle in! Discover more! And to do so , just enter your favorite number here!");
                int playerInput = scanner.nextInt();

              LicoriceLagoon lagoon = new LicoriceLagoon("Licorice Lagoon",playerInput);
              lagoon.printPathName();
              scanner.nextLine();
              lagoon.startChallenge();
              }

            

             else if (player.getPositionIndex() == 47 || currPosition.equals("Lollipop")) {
                System.out.println("You made it to Lollipop Castle! Behold the glory !!!!!!!!!\n To proceed , whisper any number to us.");
                int playerInput = scanner.nextInt();
                LollipopCastle lollipop = new LollipopCastle();
                Boolean hasKey = true; 
                lollipop.startChallenge(hasKey,player);
                scanner.nextLine();

                if (player.getPositionIndex() == 52) {
                  System.out.println("You’ve reached the Frosted Palace.");
                  int palaceInput = scanner.nextInt();
                  FrostedPalace frosted = new FrostedPalace();
                  frosted.startChallenge(player);
                  scanner.nextLine();
}

               
                }
            else if (player.getPositionIndex() == 52 || currPosition.equals("Icecream")) {
                  System.out.println("You’ve reached the Frosted Palace. Enter any number to step inside");
                  int playerInput = scanner.nextInt();
                  FrostedPalace frosted = new FrostedPalace();
                  frosted.startChallenge(player);
                  scanner.nextLine();
            }

            // End of Game
            if (player.getPositionIndex() ==60 )
              {  if (player.getHasFrostedKey()){
                    System.out.println("\n You’ve arrived at King Kandy’s Castle!");
                    System.out.println(" YOU WIN! Sweet victory is yours!");
                    player.setHasWon(true);
                } else {
                    System.out.println("\n You reached the castle, but you don't have the final key! Find the Frosted Palace first.");
                }
              }


            // Check if the player has died
            if (!player.getIsAlive()) {
                System.out.println("\nOh no! You didn’t survive the journey. Game Over.");
            }
        }

      scanner.close();

    }
}
