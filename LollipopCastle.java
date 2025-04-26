import java.util.Scanner;

/**
 * Represents the Lollipop Castle in Candy Land.
 * Players must complete a jumping challenge to earn a key to the Frosted Palace.
 */
public class LollipopCastle extends Castle {
    private boolean hasKeyToFrostedPalace;
    private boolean isAlive;

    /**
     * Constructs a new Lollipop Castle.
     */
    public LollipopCastle() {
        super("Lollipop Castle");
        this.hasKeyToFrostedPalace = false;
        this.isAlive = true;
    }

    /**
     * Starts the jumping challenge in Lollipop Castle.
     * Player must jump between 200–400 to survive and earn the Frosted Palace key.
     */
    public void startChallenge(boolean hasKey) {
        if (!hasKey) {
            System.out.println("You cannot enter Lollipop Castle without the key to the Frosted Palace.");
            this.isAlive = false;
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Lollipop Castle!");
        System.out.println("A glowing chasm blocks your path—you must jump to survive.");
        System.out.println("Jump too low = caramel abyss. Too high = sucked into space.");

        int height = -1;
        while (height < 100 || height > 500) {
            System.out.print("Enter your jump height (100–500): ");
            if (scanner.hasNextInt()) {
                height = scanner.nextInt();
                if (height < 100 || height > 500) {
                    System.out.println("Invalid jump height. Must be between 100 and 500.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        if (height >= 200 && height <= 400) {
            System.out.println("Perfect jump! You land safely on the other side.");
            System.out.println("You've earned the key to the Frosted Palace!");
            this.hasKeyToFrostedPalace = true;
            this.isAccessible = true; // Unlock the castle for the player
        } else if (height < 200) {
            System.out.println("Too low! You fall into the caramel abyss...");
            this.isAlive = false;
        } else {
            System.out.println("Too high! You’re sucked into the void of space...");
            this.isAlive = false;
        }
       
    }

    /**
     * Checks if the player has earned the key to the Frosted Palace.
     * @return true if the player has the key, false otherwise.
     */
    public boolean hasKeyToFrostedPalace() {
        return hasKeyToFrostedPalace;
    }

    /**
     * Checks if the player is still alive after the challenge.
     * @return true if alive, false otherwise.
     */
    public boolean isAlive() {
        return isAlive;
    }
}
