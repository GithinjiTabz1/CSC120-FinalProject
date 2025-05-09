import java.util.Scanner;

/**
 * Represents the Licorice Lagoon, a special location in the game where players
 * must guess the number of licorice pieces to proceed and earn the key to Lollipop Castle.
 */
public class LicoriceLagoon extends PathPlaces {
    private static boolean hasKeyToLollipop = false;

    /**
     * Constructs a new Licorice Lagoon with the specified name and player input.
     * 
     * @param name the name of this location
     * @param playerInput the initial player input value
     */
    public LicoriceLagoon(String name, int playerInput) {
        super(name, playerInput);
    }

    /**
     * Displays the welcome message and challenge description for the Licorice Lagoon.
     */
    public void printPathName() {
        System.out.println("You have entered the Licorice Lagoon! You are ready to begin your next challenge. " +
                          "From 2000 - 5000, how many licorice make up the Lagoon?");
    }

    /*
    * When you land in the lagoon you will need to guess a number.
    * If you guess it incorectly, you will get a random trivia question.
    * ArrayList of the trivia questions.
    */

    /**
     * Starts the licorice counting challenge.
     * Players must guess a number between 2000 and 5000.
     * Odd numbers allow direct progression, while even numbers require answering a trivia question.
     * 
     * @return true if the player has earned the key to Lollipop Castle
     */
    public Boolean startChallenge() {
        Scanner scanner = new Scanner(System.in);
        int playerInput = scanner.nextInt();
        String question = triviaQuestions.get(this.random.nextInt(triviaQuestions.size()));
        
        hasKeyToLollipop = true;
        if (playerInput >= 2000 && playerInput <= 5000) {
            if (playerInput % 2 != 0) {
                System.out.println("Aha! I see you have done your research! " + playerInput + 
                                 " licorice make up the Lagoon. You can advance to the next tile.");
            } else {
                System.out.println("Oh no! " + playerInput + 
                                 " is not the correct number of licorice that make up the Lagoon. " +
                                 "You must complete the following trivia question to move to the next tile. " + 
                                 question);
                scanner.nextLine();
                String response = scanner.nextLine();
                System.out.println("Well done! You have completed the challenge and may progress to the next tile.");
            }
        } else {
            System.out.println("Please enter a number between 2000 and 5000.");
        }
        System.out.println("Yay! You also just acquired the key to Lollipop Castle. Keeping it in your inventory for now."); 
        return hasKeyToLollipop;
    }

    /**
     * Displays a success message when the player completes the challenge.
     */
    public void finalSentiment() {
        System.out.println("That's right! You have completed the challenge and may progress to the next tile.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LicoriceLagoon llTest = new LicoriceLagoon("Licorice Lagoon", 2003);
        llTest.printPathName();
        

        try {
            Boolean result = llTest.startChallenge();
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}