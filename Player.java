import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    private String name;
    private int positionIndex;
    private String currPosition;
    private Boolean isAlive;
    private Boolean hasFrostedKey = false;
    private ArrayList <String> tiles;


    public Player(String name,int position){
        this.name = name ;
        this.currPosition = "red";//if we have all the points on the map that the player can be at set up as an arraylist then im setting this to 0 as statring position
        this.positionIndex = 0;
        this.isAlive = true;
        this.tiles = new ArrayList<>();
    }

    public static String enterName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Player ! Enter your name:");
        String name = sc.nextLine();
        return name;

    }

    public Boolean getIsAlive(){
        return isAlive;
    }

    
    public String getName(){
        return name;
    }

    public int getPositionIndex(){
        return positionIndex;
    }

    public void setPositionIndex(int positionIndex){
        this.positionIndex=positionIndex;//setter cause this is the only one we need to manipulate
    }
    //have a move method - while loop

    public Boolean getHasFrostedKey(){
        return hasFrostedKey ;
    }

    public void setHasFrostedKey(Boolean hasFrostedKey) {
        this.hasFrostedKey = hasFrostedKey;
    }
    


    public String getCurrPosition() {
        return currPosition;
    }

    public String move(SpinnerPart SpinnerOutput, ArrayList<Map> tiles){
        this.positionIndex+=1; 
       if (this.positionIndex >= tiles.size()) {
        this.positionIndex = tiles.size() - 1;
    }

        while(this.positionIndex < tiles.size() && !!tiles.get(this.positionIndex).equals(SpinnerOutput)){//this just checks if the color of the tile tjat we are on is the same as the out put of our spinner and if it isn't, then the player keeps moving one tile forward
            this.positionIndex+=1;
        } 
        this.currPosition = SpinnerOutput.getColor();  
        System.out.println("You have now moved to " +currPosition );
        return currPosition;
    }

    public static void displayMotion(Player player, int boardSize){
        StringBuilder tiles = new StringBuilder ("Start journey");

        for(int i = 0; i < boardSize; i++){
            if(i == player.getPositionIndex())
            
            {
                tiles.append("|").append(player.getName().charAt(0)).append("|");//i will edit this later to make it so that it displays the first letter of the person's name

            }else{
                tiles.append("|_|");
            }
  

        }
        System.out.println(tiles.toString());

    }

    public Boolean setHasWon(boolean b) {
        return b;
        }
   




    





    
    
}

