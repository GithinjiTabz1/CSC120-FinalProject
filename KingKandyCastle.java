import java.util.Scanner;

/**
 * Represents King Kandy's Castle, the final destination in Candy Land.
 * Players can only enter if they have the required key from Frosted Palace.
 */
public class KingKandyCastle extends Castle {
    private boolean hasKeyToKingKandy; 

    /**
     * Constructor.
     */
    public KingKandyCastle() {
        super("King Kandy's Castle");
        this.hasKeyToKingKandy = false; 
    }

    /**
     * Sets whether the player has the key to King Kandy's Castle.
     * @param hasKey true if the player has the key, false otherwise.
     */
    public void setHasKeyToKingKandy(boolean hasKey) {
        this.hasKeyToKingKandy = hasKey;
    }

    /**
     * Attempts to enter King Kandy's Castle.
     * Only allows entry if the player has the King Kandy key.
     */
    public void attemptEntry() {
        if (hasKeyToKingKandy) {  // <<< use the local boolean here
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n You have reached King Kandy's Castle!");
            System.out.print("Press Enter to step inside and claim your victory...");
            scanner.nextLine();
            System.out.println("\n Congratulations! You have WON the game!");
        } else {
            System.out.println("\n You cannot enter King Kandy's Castle yet! You need the final key!");
        }
    }
}