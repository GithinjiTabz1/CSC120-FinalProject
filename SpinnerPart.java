import java.util.ArrayList;


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



    public String getItem(){
        return Item;
    }



   

    
}




