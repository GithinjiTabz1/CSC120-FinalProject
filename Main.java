
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        // ArrayList <String> visitedLocations = new ArrayList<>();
        Set<String> visitedSpecialLocations = new HashSet<>();


        for (int i = 0; i < 60; i++){
            String color = colors[i % colors.length];
           
           //setting locations so that we can assign tiles to specific special locations  
            String location = "None";


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
            map.add(tiles);}


        String name = Player.enterName();
        Player player = new Player(name,0);    
    
        //starting display

        System.out.println("Welcome to Candy Land, " + name + "  ");

        System.out.println("You are currently on Tile " + player.getCurrPosition());

      //  Main game loop
        while (player.getIsAlive()) {
            System.out.println("\n Spin the wheel to move forward!");
            System.out.print("Press Enter to spin...");

            scanner.nextLine();
            SpinnerPart SpinnerOutput = spinner.spin();

            String part = SpinnerOutput.getColor();
            



            System.out.println(spinner);

            //moving our player using our spinner output 
            player.move(SpinnerOutput,map);
            // visitedSpecialLocations.add(part);

            //displaying our players movements
            player.displayMotion(player, map.size());

            //System.out.println(currentPosition);
            

                


    

         //  Handle special locations
            String currPosition = SpinnerOutput.getColor();

           // System.out.println("here");
           

            if (player.getPositionIndex() == 15 || currPosition.equals("Peppermint"))   { // i tried to add & !visitedLocations.contains("Peppermint") so that people wouldnt keep visiting the peppermint forest but it kept causing an issue where it just would not go into the condition if I did an nad which makes sense and if I did an or it would just go into the condition even if I didnt spin peppermint should I consider a nested condition
            // if( !visitedLocations.contains("Peppermint")){

                System.out.println("You are standing in front of the .....PepperMint Forest . Click any number to enter ");
                int playerInput = scanner.nextInt(); //should I try abstraction or something so that the player can click any key ? - not a necessity
                PeppermintForest peppermint = new PeppermintForest("Peppermint Forest",playerInput);
                scanner.nextLine();
                peppermint.printPathName(); 
            }      

                
               // peppermint.enter(player);

            // }

             else if (player.getPositionIndex() == 22 || currPosition.equals("Peanut") ) {
              // if(!visitedLocations.contains("Peanut")){
             
                System.out.println("You are now standing infront of Nana's Nuthouse! Press any number to come in...if you dare!");
                  int playerInput = scanner.nextInt();
                  Nana_NutHouse nana = new Nana_NutHouse("Nana's Nuthouse",playerInput);
                  scanner.nextLine();
                  nana.chocoBridgeNumber();
              
            }
            // }
    //          //nana.enter(player);

             
             else if (player.getPositionIndex() ==  37 || currPosition.equals("Licorice")  ) {
               // || 
              //  if(!visitedLocations.contains("Licorice")){
              System.out.println("You have stumbled upon the sticky.....Licorice Lagoon. Press any number to waddle in !");
              // System.out.println("i'm breaking on line 2");
              int playerInput = scanner.nextInt();
              // System.out.println("i'm breaking on line 3");

              LicoriceLagoon lagoon = new LicoriceLagoon("Licorice Lagoon",playerInput);
              lagoon.printPathName();
              scanner.nextLine();
              lagoon.finalSentiment();}

    //             lagoon.enter(player);
            

             else if (player.getPositionIndex() == 47 || currPosition.equals("Lollipop")) {
              //  if(!visitedLocations.contains("Lollipop")){
                System.out.println("You made it to Lollipop Castle! Behold the glory !!!!!!!!!");
                int playerInput = scanner.nextInt();
                LollipopCastle lollipop = new LollipopCastle();
                Boolean hasKey = true; //should i have it as false - because in this logic the person is already inside and I'm super unclear on if they are inside - then do they already have the key and if so where di dthey pick up the key?
                lollipop.startChallenge(hasKey,player);
                scanner.nextLine();

               
                }
            else if (player.getPositionIndex() == 52 || currPosition.equals("IceCream")) {
                // if(!visitedLocations.contains("IceCream")){
                  System.out.println("You’ve reached the Frosted Palace.");
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
                }}


            // Check if the player has died
            if (!player.getIsAlive()) {
                System.out.println("\nOh no! You didn’t survive the journey. Game Over.");
            }
        }

      scanner.close();

    }
}
