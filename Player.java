public class Player {
    private String name;
    private String color;
    private String shape;
    private int position;
    private String currPosition;


    public Player(String name,String color, String shape,int position){
        this.name = name ;
        this.color = color;
        this.shape = shape;
        this.currPosition = "red";//if we have all the points on the map that the player can be at set up as an arraylist then im setting this to 0 as statring position
        this.position = position;

    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }

    public void setPosition(int position){
        this.position=position;//setter cause this is the only one we need to manipulate
    }
    


    public String getCurrPosition() {
        return currPosition;
    }

    public void setCurrPosition(String currPosition) {
        this.currPosition = currPosition;
    }

    public String toString(){
        return this.name + " color: " + this.color + " " + this.shape + " player named " + this.name; // Corrected toString

    }
    
    
}

