import java.util.ArrayList;
import java.util.Random;

/**
 * The FullSpinner class simulates a spinner used in a board game.
 * It randomly selects a color or candy tile from a predefined list.
 * Special tiles (candies) can be removed once visited to prevent replay.
 * 
 * This class supports adding spinner parts, removing special tiles,
 * spinning for a random outcome, and displaying the result.
 */
public class FullSpinner {
    private ArrayList<SpinnerPart> parts;
    private String part;
    private Random random;

    /**
     * Constructs a FullSpinner with an empty list of spinner parts
     * and initializes the random number generator.
     */
    public FullSpinner() {
        this.parts = new ArrayList<>();
        this.random = new Random();
    }

    /**
     * Populates the spinner with basic color tiles and special candy tiles.
     * This method should be called before any spinning is performed.
     */
    public void addParts() {
        parts.add(new SpinnerPart("Red"));
        parts.add(new SpinnerPart("Purple"));
        parts.add(new SpinnerPart("Yellow"));
        parts.add(new SpinnerPart("Blue"));    
        parts.add(new SpinnerPart("Orange"));
        parts.add(new SpinnerPart("Green"));

        // Adding special candy tiles
        parts.add(new SpinnerPart("Peppermint")); 
        parts.add(new SpinnerPart("Icecream"));
        parts.add(new SpinnerPart("Licorice")); 
        parts.add(new SpinnerPart("Lollipop")); 
        parts.add(new SpinnerPart("Peanut")); 
    }

    /**
     * Removes a special tile (e.g., candy) that has already been visited
     * so it won't appear again in future spins.
     * 
     * @param partName the name of the tile to remove from the spinner
     */
    public void removeVisitedCandies(String partName) {
        parts.removeIf(p -> p.getColor().equals(partName));
    }

    /**
     * Spins the spinner and returns a randomly selected SpinnerPart.
     * 
     * @return the randomly selected SpinnerPart
     * @throws IllegalStateException if the spinner parts list is empty
     */
    public SpinnerPart spin() {
        if (parts.isEmpty()) {
            throw new IllegalStateException("The spinner parts list is empty! Please add parts before spinning.");
        }

        int index = random.nextInt(parts.size());
        SpinnerPart SpinnerOutput = parts.get(index);

        this.part = SpinnerOutput.getColor();
        return SpinnerOutput;
    }

    /**
     * Returns a string representation of the spin result.
     * 
     * @return message indicating the tile the player spun
     */
    @Override
    public String toString() {
        return "Congratulations! You have spun a " + this.part + ". You can now advance ahead to the " + this.part + " tile.";
    }
}

