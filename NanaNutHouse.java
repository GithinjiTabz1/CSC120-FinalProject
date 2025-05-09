import java.util.Scanner;

/**
 * Represents Nana's Nut House, a special location in the game where players
 * must complete a number-based challenge to cross a chocolate bridge.
 */
public class NanaNutHouse extends PathPlaces {
    private static boolean hasKeyToLollipop = false;
    
    /**
     * Constructs a new Nana's Nut House with the specified name and player input.
     * 
     * @param name the name of this location
     * @param playerInput the initial player input value
     */
    public NanaNutHouse(String name, int playerInput) {
        super(name, playerInput);
    }

    /**
     * Handles the chocolate bridge challenge at Nana's Nut House.
     * If the player's number is odd, they can cross the bridge directly to Licorice Lagoon.
     * If even, they must answer a trivia question and take the long way.
     * 
     * @param player the player attempting the challenge
     * @param scanner the scanner for reading player input
     * @return true if the player successfully crosses the bridge, false otherwise
     */
    public Boolean chocoBridgeNumber(Player player, Scanner scanner) {
        System.out.println("Welcome to Nana's Nut House, Sugar! You are ready to begin your challenge. " +
                          "Please choose a magic number.");
        
        int playerInput = scanner.nextInt();
        String question = triviaQuestions.get(this.random.nextInt(triviaQuestions.size()));

        if (this.playerInput % 2 != 0) {
            System.out.println("Congratulations! Your magic number " + this.playerInput + 
                             " has unlocked the chocolate bridge. You advance to Licorice Lagoon!");
            player.setPositionIndex(37);
            return true;
        } else {
            System.out.println("Oh no! Your number " + playerInput + 
                             " has broken the chocolate bridge! You will have to take the long way " +
                             "after you answer this trivia question. " + question);
            scanner.nextLine();
            String response = scanner.nextLine();
            return false;
        }
    }

    /**
     * Displays a success message when the player completes the challenge.
     */
    public void finalSentiment() {
        System.out.println("That's right! You have completed the challenge and may progress to the next tile.");
    }
}