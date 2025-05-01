import java.util.Scanner;
import java.util.Random;


public class Nana_NutHouse extends PathPlaces{
    
    
    public Nana_NutHouse(String name, int playerInput) {
        super (name, playerInput);
        
    }
    public int chocoBridgeNumber() {
        
        System.out.println("Welcome to Nana's Nut House, Sugar! You are ready to begin your challenge. Please choose a magic number.");
        
        Scanner scanner = new Scanner(System.in);
        int playerInput = scanner.nextInt();
        Random random = new Random();
        String question = triviaQuestions.get(this.random.nextInt (triviaQuestions.size()));

        if (playerInput % 2 != 0) {
            System.out.println("Congratulations! Your magic number " + playerInput + " has unlocked the chocolate bridge. You advance to Licorice Lagoon!");
        } else {
            System.out.println("Oh no! Your number " + playerInput + " has broken the chocolate bridge! You will have to take the long way after you answer this trivia question. " + question);
            System.out.println(scanner.nextLine());
            String response = scanner.nextLine();
        }
        return this.playerInput;
    }
    public void finalSentiment() {
    System.out.println("That's right! You have completed the challenge and may progress to the next tile.");
    }

}
