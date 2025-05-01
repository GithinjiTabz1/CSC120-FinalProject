
public class Map {
    private Boolean position ;
    private String colorBlocks;
    private String playerPosition;

    //
    


    /* Constructor */
    public Map(Boolean position, String colorBlocks, String playerPosition){
        this.position = position;
        this.colorBlocks = colorBlocks;
        this.playerPosition = playerPosition;
    }


    /*
     * Index of each block of the map.
     */
    public Boolean indexPosition(){
        return this.position;
    }
 
    /*
     * Tiles of the map.
     */

    public String gameBlocks(){
        return this.colorBlocks;
    }
 
    /*
     * Name of the tile (color and index) which the player is in.
     */

    public String playerPosition(){
        return this.playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public void setColorBlocks(String colorBlocks) {
        this.colorBlocks = colorBlocks;
    }

    public void setIndexPosition(Boolean position) {
        this.position = position;
    }

}


