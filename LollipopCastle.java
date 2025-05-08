import java.util.Scanner;
import javax.swing.text.Position;

/**
 * Represents the Lollipop Castle in Candy Land.
 * Players must complete a jumping challenge to proceed toward the Frosted Palace.
 */
public class LollipopCastle extends Castle {
    private boolean hasKeyToFrostedPalace;
    private double height;

    /**
     * Constructs a new Lollipop Castle.
     */
    public LollipopCastle() {
        super("Lollipop Castle");
        this.hasKeyToFrostedPalace = false;
        this.height = 0;
    }

    /**
     * Starts the jumping challenge at Lollipop Castle.
     * If the player jumps between 200–400, they succeed and teleport closer to the Frosted Palace.
     * Even if they fail the jump, they still receive the key but must take a longer route.
     * 
     * @param hasKey A boolean indicating if the player has the required key to enter.
     */
    public void startChallenge(boolean hasKey,Player player) {
        if (!hasKey) {
            System.out.println("You cannot enter Lollipop Castle without the key to the Frosted Palace.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Lollipop Castle!A space in which the gravity is fickle and there's obstacles at each turn");
      //  System.out.println("Jump too low = caramel abyss. Jump too high = sucked into space.");

        boolean validJump = false;

        while (!validJump) {
            System.out.print("You are faced with several lollipop barred fences preventing you from escaping.\n The only way out is to utilize the weird gravity to jump out of the castle.\n But beware, your jumps may have consequences!\n How high would you like to jump ?");
    
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                scanner.nextLine(); // consume leftover newline
    
                if (height < 100 || height > 500) {
                    System.out.println("Invalid jump height. Must be between 100 and 500. Try again.");
                } else {
                    validJump = true; // exit the loop
    
                    if (height >= 200 && height <= 400) {
                        System.out.println("Perfect jump! You land safely on the other side.");
                        player.setPositionIndex(52);
                        System.out.println("Schwooop! You are teleported to the Frosted Palace! I hope you have a coat!");
                    } else if (height < 200) {
                        System.out.println("Too low! You fall into the gooey caramel abyss.......and fell to you death ! ");
                        player.setIsAlive(false);
                    } else {
                        System.out.println("Too high! You’re sucked into the gaping void of space... and you unfortunately did not make it back");
                        player.setIsAlive(false);
                    }
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); 
            }
        }


        // Regardless of success or failure, the player gets the key
        this.hasKeyToFrostedPalace = true;
        this.isAccessible = true;
    }

    /**
     * Checks if the player has earned the key to the Frosted Palace.
     * 
     * @return true if the player has the key, false otherwise.
     */
    public boolean hasKeyToFrostedPalace() {
        return hasKeyToFrostedPalace;
    }
}