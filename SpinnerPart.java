
/**
 * The SpinnerPart class represents a single part of the game spinner.
 * Each SpinnerPart has a color or a special item name (e.g., a candy tile).
 * These parts are used by the FullSpinner to simulate spinning results.
 */
public class SpinnerPart {
    private String Item;
    private String Color;

    /**
     * Constructs a SpinnerPart with a specified color or name.
     * 
     * @param Color the color or name of the spinner part
     */
    public SpinnerPart(String Color) {
        this.Color = Color;
    }

    /**
     * Returns the color or name of this SpinnerPart.
     * 
     * @return the color or name string
     */
    public String getColor() {
        return Color;
    }

    /**
     * Returns the item associated with this SpinnerPart (if any).
     * Currently unused but can be expanded for additional game features.
     * 
     * @return the item string
     */
    public String getItem() {
        return Item;
    }
}





