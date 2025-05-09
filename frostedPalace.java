import java.util.Random;
import java.util.Scanner;

/**
 * Represents the Frosted Palace in Candy Land.
 * Players must guess a number to earn the key to King Kandy's Castle.
 * Entry is only allowed if the player has the Frosted Palace key.
 */
public class FrostedPalace extends Castle {

    private static int correctNumber;
    private static int temperature;
    private static boolean hasKeyToKingKandy;
    private static boolean teleportedToKingKandy;

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
    public static void enter(boolean hasKeyFromLollipopCastle,Player player) {
        if (hasKeyFromLollipopCastle) {
            System.out.println("\nYou used the key to enter the Frosted Palace!");
            startChallenge(player);
        } else {
            System.out.println("\nYou cannot enter the Frosted Palace without the key from Lollipop Castle!");
        }
    }


    /**
     * Checks if the player has earned the key to King Kandy's Castle.
     * 
     * @return true if the player has the key, false otherwise
     */
    public boolean hasKeyToKingKandy() {
        this.correctNumber = generateRandomNumber();
        this.temperature = 98;
        this.hasKeyToKingKandy = false;
        this.teleportedToKingKandy = false;
        return hasKeyToKingKandy;
    }
    


     /**
     * Starts the freezing number-guessing challenge.
     * If guessed correctly on the first try, player is teleported to King Kandy.
     * Otherwise, the player either gets the key after more trials or freezes to death.
     */
    public static void startChallenge(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nYou've made your way to the coldest corner of Candy Land....the Frosted Palace.....Welcome.");
        System.out.println("Guess the number between 1 and 10. It's freezing in here!");

        boolean firstAttempt = true;

        while (temperature > 0 && !hasKeyToKingKandy) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();

                if (guess == correctNumber) {
                    System.out.println("Correct! You survived and earned the key to King Kandy’s Castle!");
                    hasKeyToKingKandy = true;
                    FrostedPalace.isAccessible = true;

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
                        player.setIsAlive(false); 
                        return;
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
    public boolean hasKeyToKingKandy(Player player) {
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
    public static boolean checkFrozen() {
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