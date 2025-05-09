/**
 * Represents a tile on the game board in Candy Land.
 * Each tile has a position status, color, and may contain a special location.
 * Tiles are used to track player movement and special locations on the board.
 */
public class Map {
    private Boolean position;
    private String colorBlocks;
    private String playerPosition;

    /**
     * Constructs a new Map tile with specified position, color, and player position.
     * 
     * @param position indicates if this is a valid position on the board
     * @param colorBlocks the color of this tile
     * @param playerPosition the name of the special location if any, or "None"
     */
    public Map(Boolean position, String colorBlocks, String playerPosition) {
        this.position = position;
        this.colorBlocks = colorBlocks;
        this.playerPosition = playerPosition;
    }

    /**
     * Gets the position status of this tile.
     * 
     * @return true if this is a valid position on the board
     */
    public Boolean indexPosition() {
        return this.position;
    }

    /**
     * Gets the color of this tile.
     * 
     * @return the color of this tile
     */
    public String gameBlocks() {
        return this.colorBlocks;
    }

    /**
     * Gets the name of the special location on this tile.
     * 
     * @return the name of the special location or "None" if no special location
     */
    public String getPlayerPosition() {
        return this.playerPosition;
    }

    /**
     * Sets the name of the special location on this tile.
     * 
     * @param playerPosition the name of the special location
     */
    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    /**
     * Sets the color of this tile.
     * 
     * @param colorBlocks the new color for this tile
     */
    public void setColorBlocks(String colorBlocks) {
        this.colorBlocks = colorBlocks;
    }

    /**
     * Sets the position status of this tile.
     * 
     * @param position the new position status
     */
    public void setIndexPosition(Boolean position) {
        this.position = position;
    }

    /**
     * Gets the color of this tile.
     * 
     * @return the color of this tile
     */
    public String getColor() {
        return this.colorBlocks;
    }

    /**
     * Gets the name of the special location on this tile.
     * 
     * @return the name of the special location or "None" if no special location
     */
    public String getLocation() {
        return this.playerPosition;
    }
}