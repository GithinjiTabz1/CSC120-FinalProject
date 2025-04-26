import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    private String name;
    private String color;
    private String shape;
    private int positionIndex;
    private String currPosition;
    private int lives;
    private Boolean isAlive;
    private ArrayList<SpinnerPart> tiles; //only added so i could test my move method , this arraylist should be declared within maybe a tile class or within the map class
    



    public Player(String name,String color, String shape,int position){
        this.name = name ;
        this.currPosition = "red";//if we have all the points on the map that the player can be at set up as an arraylist then im setting this to 0 as statring position
        this.positionIndex = 0;
        this.lives = 3;
        this.isAlive = true;
        this.tiles = new ArrayList<>();
    }

    public String enterName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        return name;

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
    


    public String getCurrPosition() {
        return currPosition;
    }

    public void move(String SpinnerPart, ArrayList<String> tiles){
        this.positionIndex+=1; /
       if (this.positionIndex >= tiles.size()) {
        this.positionIndex = tiles.size() - 1;
    }

        while(this.positionIndex < tiles.size() && !tiles.get(this.positionIndex).equals(SpinnerPart)){//this just checks if the color of the tile tjat we are on is the same as the out put of our spinner and if it isn't, then the player keeps moving one tile forward
            this.positionIndex+=1;
        } 
        this.currPosition = SpinnerPart;  
    }
   




    





    
    
}

