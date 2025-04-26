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
 
    public Boolean indexPosition(){
        return this.position;
    }
 
    public String gameBlocks(){
        return this.colorBlocks;
    }
 
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
        map.get(playerIndex).setPlayerPosition(Player.getName);

        String spunColor = spinner.spun();
        System.out.println("Spinner result: " + spunColor);

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