import java.util.ArrayList;

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

}


