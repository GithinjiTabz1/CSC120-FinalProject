import java.util.Scanner;

/**
 * Represents King Kandy's Castle, the final destination in Candy Land.
 * Players can only enter if they have the required key from Frosted Palace.
 */
public class KingKandyCastle extends Castle {

    /**
     * Constructs King Kandy's Castle.
     */
    public KingKandyCastle() {
        super("King Kandy's Castle");
    }

    /**
     * Attempts to enter King Kandy's Castle.
     * Only allows entry if the player has the King Kandy key.
     * 
     * @param player The player attempting to enter.
     */
    public void attemptEntry(Player player) {
        if (player.hasKingKandyKey == true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n You have reached King Kandy's Castle!");
            System.out.print(" Press Enter to step inside and claim your victory...");
            scanner.nextLine();
            System.out.println("\n Congratulations! You have WON the game!"); 
        } else {
            System.out.println("\n You cannot enter King Kandy's Castle yet! You need the final key!");
        }
    }
}
