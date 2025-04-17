import java.util.ArrayList;
import java.util.Random;

public class FullSpinner {
    private ArrayList<SpinnerPart> parts;

    public  FullSpinner(){
        this.parts = new ArrayList<>();
        //addParts();
    }


public void addParts(){
    parts.add(new SpinnerPart("Red"));
    parts.add(new SpinnerPart("Yellow"));
    parts.add(new SpinnerPart("Blue"));
    parts.add(new SpinnerPart("Orange"));    
    parts.add(new SpinnerPart("Red"));
    parts.add(new SpinnerPart("Yellow"));
    parts.add(new SpinnerPart("Blue"));
    parts.add(new SpinnerPart("Orange")); 

    //adding my  candies

    parts.add(new SpinnerPart("Ice cream")); 
    parts.add(new SpinnerPart("Peanut"));
    parts.add(new SpinnerPart("Lollipop")); 
    parts.add(new SpinnerPart("Licorice")); 


}
//i'll need to add an override method to a to string

// @Override
// public void toString(){
//     return "FullSpinner has a ";
// }
public String spin(){
    int Index = random.nextInt(parts.size());   //is it not recognizing random?
    return parts.get(Index).toString();
    //how could i do this without a getOutput variable
    
    
    // just declare a variable that would pick a random number from the number of stuff in the arraylist
    //and then just get it to spit out that index


}
public static void main(String[] args) {
    FullSpinner spinner = new FullSpinner();
    spinner.addParts();
    System.out.println(spinner);
}

}
