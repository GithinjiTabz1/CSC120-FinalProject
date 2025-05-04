import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Player class represents a player in the board game.
 * It manages the player's name, position on the board, status (alive or not),
 * whether they possess a key, and their movement based on spinner output.
 */
public class Player {
    private String name;
    private int positionIndex;
    private String currPosition;
    private Boolean isAlive;
    private Boolean hasFrostedKey = false;
    private ArrayList<String> tiles;

    /**
     * Constructs a Player with a given name and starting position.
     *
     * @param name     the name of the player
     * @param position the starting position (typically 0)
     */
    public Player(String name, int position) {
        this.name = name;
        this.currPosition = "red"; // Starting position name
        this.positionIndex = 0;
        this.isAlive = true;
        this.tiles = new ArrayList<>();
    }

    /**
     * Prompts the user to enter their name.
     *
     * @return the player's name entered from console
     */
    public static String enterName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Player! Enter your name:");
        String name = sc.nextLine();
        return name;
    }

    /**
     * Returns whether the player is currently alive.
     *
     * @return true if alive, false otherwise
     */
    public Boolean getIsAlive() {
        return isAlive;
    }

    /**
     * Sets the alive status of the player.
     *
     * @param alive boolean representing whether the player is alive
     */
    public void setIsAlive(boolean alive) {
        this.isAlive = alive;
    }

    /**
     * Gets the player's name.
     *
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the player's current index position on the board.
     *
     * @return the current position index
     */
    public int getPositionIndex() {
        return positionIndex;
    }

    /**
     * Sets the player's position index on the board.
     *
     * @param positionIndex the new position index
     */
    public void setPositionIndex(int positionIndex) {
        this.positionIndex = positionIndex;
    }

    /**
     * Returns whether the player has the Frosted Key.
     *
     * @return true if the player has the Frosted Key, false otherwise
     */
    public Boolean getHasFrostedKey() {
        return hasFrostedKey;
    }

    /**
     * Sets whether the player has obtained the Frosted Key.
     *
     * @param hasFrostedKey true if the player has the key, false otherwise
     */
    public void setHasFrostedKey(Boolean hasFrostedKey) {
        this.hasFrostedKey = hasFrostedKey;
    }

    /**
     * Returns the name of the current position the player is on.
     *
     * @return the name of the current tile
     */
    public String getCurrPosition() {
        return currPosition;
    }

    /**
     * Moves the player forward on the board until they land on a tile
     * that matches the spinner result. The player advances by checking each
     * tile from their current position until a match is found.
     *
     * @param SpinnerOutput the result from spinning the spinner
     * @param tiles         the list of Map tiles representing the game board
     * @return the name of the tile the player landed on
     */
    public String move(SpinnerPart SpinnerOutput, ArrayList<Map> tiles) {
        this.positionIndex += 1;

        if (this.positionIndex >= tiles.size()) {
            this.positionIndex = tiles.size() - 1;
        }

        while (this.positionIndex < tiles.size() &&
               !tiles.get(this.positionIndex).equals(SpinnerOutput)) {
            this.positionIndex += 1;
        }

        this.currPosition = SpinnerOutput.getColor();
        System.out.println("You have now moved to " + currPosition);
        return currPosition;
    }

    /**
     * Displays the player's progress on the board using a simple visual layout.
     *
     * @param player    the player whose position is displayed
     * @param boardSize the total size of the board
     */
    public static void displayMotion(Player player, int boardSize) {
        StringBuilder tiles = new StringBuilder("Start journey");

        for (int i = 0; i < boardSize; i++) {
            if (i == player.getPositionIndex()) {
                tiles.append("|").append(player.getName().charAt(0)).append("|");
            } else {
                tiles.append("|_|");
            }
        }

        System.out.println(tiles.toString());
    }

    /**
     * Placeholder method to set whether the player has won.
     * Consider implementing this properly or renaming it for clarity.
     *
     * @param b true if the player has won
     * @return the same boolean value passed in
     */
    public Boolean setHasWon(boolean b) {
        return b;
    }
}


