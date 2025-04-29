import java.util.Scanner;

public class Nana_NutHouse extends PathPlaces{
    
    public Nana_NutHouse(String name, int playerInput) {
        super (name, playerInput);
    }
    public int chocoBridgeNumber() {
        
        System.out.println("Welcome to Nana's Nut House, Sugar! You are ready to begin your challenge. Please choose a magic number.");
        
        Scanner scanner = new Scanner(System.in);
        int playerInput = scanner.nextInt();
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Nana_NutHouse nanasTest = new Nana_NutHouse("Nana's House", 6);
        nanasTest.chocoBridgeNumber();
        nanasTest.finalSentiment();
    }
}
