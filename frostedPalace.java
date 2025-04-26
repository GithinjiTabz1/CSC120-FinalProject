import java.util.Random;
import java.util.Scanner;

/**
 * Represents the Frosted Palace in Candy Land.
 * Players must guess a number to earn the key to King Kandy's Castle.
 * Entry is only allowed if the player has the Frosted Palace key.
 */
public class FrostedPalace extends Castle {

    private int correctNumber;
    private int temperature;
    private boolean isAlive;
    private boolean hasKeyToFrostedPalace;
    private boolean hasKeyToKingKandy;

    /**
     * Constructs a new Frosted Palace.
     * Initializes challenge values.
     */
    public FrostedPalace() {
        super("Frosted Palace");
        this.correctNumber = generateRandomNumber();
        this.temperature = 98;
        this.isAlive = true;
        this.hasKeyToFrostedPalace = false;
        this.hasKeyToKingKandy = false;
    }

    /**
     * Attempts to enter the Frosted Palace.
     * Only allows entry if the player has the key from Lollipop Castle.
     */
    public void enter(boolean hasKeyFromLollipopCastle) {
        if (hasKeyFromLollipopCastle) {
            System.out.println("\n You used the key to enter the Frosted Palace!");
            startChallenge();
        } else {
            System.out.println("\n You cannot enter the Frosted Palace without the key from Lollipop Castle!");
        }
    }

    /**
     * Starts the freezing number-guessing challenge.
     * If successful, earns the player the key to King Kandy's Castle.
     */
    private void startChallenge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Frosted Palace.");
        System.out.println("Guess the number between 1 and 10. It's freezing in here!");

        while (temperature > 0 && !hasKeyToKingKandy) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == correctNumber) {
                System.out.println("Correct! You survived and earned the key to King Kandy’s Castle!");
                hasKeyToKingKandy = true;
                this.isAccessible = true; // Optional: If you want KingKandyCastle to check this
                break;
            } else {
                temperature -= 10;
                System.out.println("Incorrect! Your body temperature is now: " + temperature + "°F");
                if (checkFrozen()) {
                    System.out.println("You froze to death in the Frosted Palace...");
                    isAlive = false;
                    break;
                }
            }
        }
    }

    /**
     * Checks if the player is alive.
     */
    public boolean isAlive() {
        return isAlive;
    }

    /**
     * Checks if the player has earned the key to King Kandy's Castle.
     */
    public boolean hasKeyToKingKandy() {
        return hasKeyToKingKandy;
    }

    /**
     * Helper method to check if the player froze.
     */
    private boolean checkFrozen() {
        return temperature <= 0;
    }

    /**
     * Generates a random number between 1 and 10.
     */
    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }
}
