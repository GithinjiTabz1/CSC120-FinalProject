import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Represents the Peppermint Forest, a special location in the game where players
 * must guess the number of candy canes to proceed.
 */
public class PeppermintForest extends PathPlaces {
    private String name;
    private int playerInput;
    private ArrayList<String> triviaQuestions;
    private boolean hasKey = false;
    private static boolean hasKeyToLollipop = false;
    private Random random;

    /**
     * Constructs a new Peppermint Forest with the specified name and player input.
     * 
     * @param name the name of this location
     * @param playerInput the initial player input value
     */
    public PeppermintForest(String name, int playerInput) {
        super(name, playerInput);
    }

    /**
     * Displays the welcome message and challenge description for the Peppermint Forest.
     */
    public void printPathName() {
        System.out.println("You have entered the Peppermint Forest! With the aroma of peppermint candy canes, " +
                          "mint chocolate chip, and sugar, you are ready to begin your first challenge. " +
                          "From 1 - 10000, how many peppermint candy canes make up the Peppermint Forest?");
    }

    /**
     * Starts the candy cane counting challenge.
     * Players must guess a number between 1 and 10000.
     * Odd numbers are considered correct and allow players to proceed directly.
     * Even numbers require players to take the long way.
     * 
     * @throws IllegalArgumentException if the input is not between 1 and 10000
     */
    public static void startChallenge() {
        Scanner scanner = new Scanner(System.in);
        int playerInput = scanner.nextInt();

        if (playerInput >= 1 && playerInput <= 10000) {
            if (playerInput % 2 != 0) {
                System.out.println("Way to go! Exactly " + playerInput + 
                                 " peppermint candy canes make up the Peppermint Forest! " +
                                 "You can advance to the next tile. Remember to grab a candy cane on your way out.");
            } else {
                System.out.println("Unfortunately " + playerInput + 
                                 " is not the correct amount of peppermint candy canes that make up the Peppermint Forest. " +
                                 "You can continue on your path, but you may not take a peppermint candy cane. Good luck!");
            }
        } else {
            throw new IllegalArgumentException("Please enter a number between 1 and 10000.");
        }
    }
}

    