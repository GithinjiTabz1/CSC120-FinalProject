import java.util.ArrayList;
import java.util.List;

public class Map {
    private final String[] colorBlocks = {"Red", "Purple", "Yellow", "Blue", "Orange", "Green"};
    private List<String> tiles;


    /* Constructor
     * Array List which contains each color (colorBlocks).
     * Creation of loop which will run # of tile times
     * Add color to the tiles using the colorBlocks array
     */
    public Map(int numberOfTiles){
        Map = new ArrayList<>();
        for (int i = 0; i <numberOfTiles; i++){
            Map.add(colorBlocks[i % colorBlocks.length]);
        }
    }

    public void printMap(Player player){
        for (int i)
    }

}

