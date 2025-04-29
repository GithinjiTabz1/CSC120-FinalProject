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
    private boolean hasKeyToKingKandy;
    private boolean teleportedToKingKandy;

    /**
     * Constructs a new Frosted Palace.
     * Initializes challenge values.
     */
    public FrostedPalace() {
        super("Frosted Palace");
        this.correctNumber = generateRandomNumber();
        this.temperature = 98;
        this.hasKeyToKingKandy = false;
        this.teleportedToKingKandy = false;
    }

    /**
     * Attempts to enter the Frosted Palace.
     * Only allows entry if the player has the key from Lollipop Castle.
     * 
     * @param hasKeyFromLollipopCastle true if player has the key, false otherwise
     */
    public void enter(boolean hasKeyFromLollipopCastle) {
        if (hasKeyFromLollipopCastle) {
            System.out.println("\nYou used the key to enter the Frosted Palace!");
            startChallenge();
        } else {
            System.out.println("\nYou cannot enter the Frosted Palace without the key from Lollipop Castle!");
        }
    }

    /**
     * Starts the freezing number-guessing challenge.
     * If guessed correctly on the first try, player is teleported to King Kandy.
     * Otherwise, the player either gets the key after more trials or freezes to death.
     */
    private void startChallenge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Frosted Palace.");
        System.out.println("Guess the number between 1 and 10. It's freezing in here!");

        boolean firstAttempt = true;

        while (temperature > 0 && !hasKeyToKingKandy) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();

                if (guess == correctNumber) {
                    System.out.println("Correct! You survived and earned the key to King Kandy’s Castle!");
                    hasKeyToKingKandy = true;
                    this.isAccessible = true;

                    if (firstAttempt) {
                        System.out.println("You guessed correctly on the first try! Teleporting you directly to King Kandy’s Castle...");
                        teleportedToKingKandy = true;
                        player.setPositionIndex(60);
                    } else {
                        System.out.println("You guessed correctly, but you must take the long way to reach King Kandy’s Castle.");
                        teleportedToKingKandy = false;
                    }
                    break;
                } else {
                    temperature -= 10;
                    System.out.println("Incorrect! Your body temperature is now: " + temperature + "°F");
                    if (checkFrozen()) {
                        System.out.println("You froze to death in the Frosted Palace...");
                        break;
                    }
                }
                firstAttempt = false;
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // clear invalid input
            }
        }
    }

    /**
     * Checks if the player has earned the key to King Kandy's Castle.
     * 
     * @return true if the player has the key, false otherwise
     */
    public boolean hasKeyToKingKandy() {
        return hasKeyToKingKandy;
    }

    /**
     * Checks if the player teleported directly to King Kandy's Castle.
     * 
     * @return true if teleported, false otherwise
     */
    public boolean wasTeleported() {
        return teleportedToKingKandy;
    }

    /**
     * method to check if the player froze.
     * 
     * @return true if frozen, false otherwise
     */
    private boolean checkFrozen() {
        return temperature <= 0;
    }

    /**
     * Generates a random number between 1 and 10.
     * 
     * @return a random number between 1 and 10
     */
    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }
}
