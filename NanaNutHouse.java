import java.util.Scanner;


public class NanaNutHouse extends PathPlaces{
    private static boolean hasKeyToLollipop =false;
    
    
    public NanaNutHouse(String name, int playerInput) {
        super (name, playerInput);
        
    }
    public Boolean chocoBridgeNumber(Player player,Scanner scanner) {
        
        System.out.println("Welcome to Nana's Nut House, Sugar! You are ready to begin your challenge. Please choose a magic number.");
        
        int playerInput = scanner.nextInt();
        String question = triviaQuestions.get(this.random.nextInt (triviaQuestions.size()));

        if (this.playerInput % 2 != 0) {
            System.out.println("Congratulations! Your magic number " + this.playerInput + " has unlocked the chocolate bridge. You advance to Licorice Lagoon!");
            player.setPositionIndex(37);
            return true;

        } else {
            System.out.println("Oh no! Your number " + playerInput + " has broken the chocolate bridge! You will have to take the long way after you answer this trivia question. " + question);
            scanner.nextLine();
            String response = scanner.nextLine();
            return false;
        }

        

    }
    public void finalSentiment() {
        System.out.println("That's right! You have completed the challenge and may progress to the next tile.");
    }

}