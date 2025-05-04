import java.util.ArrayList;
import java.util.Random;

public class FullSpinner {
    private  ArrayList<SpinnerPart> parts;
    private String part;
    private Random random;

    public  FullSpinner(){
        this.parts = new ArrayList<>();
        this.random = new Random();
    }


public void addParts(){
    parts.add(new SpinnerPart("Red"));
    parts.add(new SpinnerPart("Purple"));
    parts.add(new SpinnerPart("Yellow"));
    parts.add(new SpinnerPart("Blue"));    
    parts.add(new SpinnerPart("Orange"));
    parts.add(new SpinnerPart("Green"));

    //adding my  candies

    parts.add(new SpinnerPart("Peppermint")); 
    parts.add(new SpinnerPart("Icecream"));
    parts.add(new SpinnerPart("Licorice")); 
    parts.add(new SpinnerPart("Lollipop")); 
    parts.add(new SpinnerPart("Peanut")); 



}

public void removeVisitedCandies(String partName) {
    parts.removeIf(p -> p.getColor().equals(partName));
}

//i'll need to add an override method to a to string

// @Override
// public void toString(){
//     return "FullSpinner has a ";
// }

@Override
public String toString(){
    return "Congratulations ! You have spun a " + this.part+ " You can now advance ahead to the "+ this.part+ " tile.";
}



public SpinnerPart spin(){
    if (parts.isEmpty()) {
        throw new IllegalStateException("The spinner parts list is empty! Please add parts before spinning.");
    }

    int index = random.nextInt(parts.size());
    SpinnerPart SpinnerOutput = parts.get(index);

    this.part = SpinnerOutput.getColor();
    //System.out.println(part);
    return SpinnerOutput;
    
    //the thing that 
    //how could i do this without a getOutput variable
    
    
    // just declare a variable that would pick a random number from the number of stuff in the arraylist
    //and then just get it to spit out that index



}




}


//pepperminet forest = 15
//nana's nuthouse = 22
//licorice lagon = 37
//lollipop castle = 47
//frosted palace = 52
//king kandy' castle 