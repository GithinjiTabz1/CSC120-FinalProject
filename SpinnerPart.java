import java.util.random;
import java.util.ArrayList;
import java.util.Random;


public class SpinnerPart {
    //text based version of the spinner
  //  private output;
    //this could be a string or an int  - and i need to remember the abstraction way to fix that 
    // private ArrayList<String> Parts;
    private String Item;
    private String Color;


    //initialize the constructor
    // public Spinner(ArrayList<String> Parts){
    //     this.Parts = new ArrayList<>();
    // }
//overloading 
    public SpinnerPart(String Color) {
    this.Color = Color;
}
    public SpinnerPart(String Color, String Item) {
        this.Color = Color;
        this.Item = Item;
    }

    public String getColor(){
        return Color;
    }

    //add sections of candyland spinner onto my parts arraylist maybe in a method

    // public ArrayList makeList(String Part){
    //     Parts.add(Part);

    //     return Parts;
    // }

    public String getItem(){
        return Item;
    }



   

    
}

//player takes a turn spinning the spinner :
//if they land on 1 of 2 oranges go to nearest orange
//same logic for purples blues yellow, greens and reds

//if it lands on the pepperminet : 
//if it lands on the peanut thingy = // Nana’s NutHouse Class
//if it lands on the lollypop  =  Lollipop Palace 
//if it lands on the icecream

//Map Class
// Peppermint Forest Class
// Licorice Lagoon
// Castle Class - by inheritance 
// Lollipop Palace 
// Frosted Palace Class
// Queen Kandy’s Castle Class 



