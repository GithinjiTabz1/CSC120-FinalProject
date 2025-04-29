import java.util.ArrayList;

public class Map {
    private Boolean position ;
    private String colorBlocks;
    private String playerPosition;

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


    /*
     * Establishing the player position, color blocks and index position of the tiles in the map.
     */

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public void setColorBlocks(String colorBlocks) {
        this.colorBlocks = colorBlocks;
    }


    public void setIndexPosition(Boolean position) {
        this.position = position;
    }

    public static void main(String[] args){
        ArrayList<Map> map = new ArrayList<>();
        FullSpinner spinner = new FullSpinner();
        spinner.addParts();
        String[] colors = {"Red", "Purple", "Yellow", "Blue", "Orange", "Green"};

        for (int i = 0; i < 60; i++){
            String color = colors[i % colors.length];
            Map tiles = new Map(false, color, "None");
            map.add(tiles);
        }

        map.get(playerIndex).setIndexPosition(true);
        map.get(playerIndex).setPlayerPosition("Player 1");

        String spinColor = spinner.spin();
        System.out.println("Spinner result: " + spinColor);

        int newIndex = -1;
        for (int i = playerIndex + 1; i < map.size(); i++){
            if (map.get(i).gameBlocks().equalsIgnoreCase(spinColor)){
                newIndex = i;
                break;
            }
        }

        if (newIndex != -1){
            map.get(playerIndex).setIndexPosition(false);
            map.get(playerIndex).setPlayerPosition("None");
            

        }

    }
} 


    public void setIndexPosition(Boolean position) {
        this.position = position;
    }

    public static void main(String[] args){
        /*
         * Map array list.
         */
        ArrayList<Map> map = new ArrayList<>();
        FullSpinner spinner = new FullSpinner();
        spinner.addParts();
        /*
         * Setting the colors of the tiles.
         */
        String[] colors = {"Red", "Purple", "Yellow", "Blue", "Orange", "Green"};

        /*
         * Loop for the map and tiles.
         */
        for (int i = 0; i < 61; i++){
            String color = colors[i % colors.length];
            Map tiles = new Map(false, color, "None");
            map.add(tiles);
        }

        /*
         * Position and index gets set in the map.  
         */
        map.get(playerIndex).setIndexPosition(true);
        map.get(playerIndex).setPlayerPosition(Player.getName);

        /*
         * using the full spinner and spinner parts the color that was randomly selected gets printed.
         */
        String spunColor = spinner.spunColor();
        System.out.println("Spinner result: " + spunColor);

        /*
         * Array to make the player move to repsective tile(color) that was spun in the spinner.
         */
        int currentPos = Player.getPosition();
        int newIndex = -1;
        for (int i = playerIndex + 1; i < map.size(); i++){
            if (map.get(i).gameBlocks().equalsIgnoreCase(spunColor)){
                newIndex = i;
                break;
            }
            else {
                System.out.println("There are no tiles of that color ahead.");
            }
        /*
         * Getting final player position after spinner.
         */
        if (newIndex != -1){
            map.get(playerIndex).setIndexPosition(false);
            map.get(playerIndex).setPlayerPosition("None");
            map.get(newIndex).setIndexPosition(true);
            map.get(newIndex).setPlayerPosition(Player.getName);
            playerIndex = newIndex;
            System.out.println("Player " + getName + " is now at " + playerIndex);
        }
    }
}

