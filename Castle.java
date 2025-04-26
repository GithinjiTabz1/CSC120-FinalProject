/**
 * Castle class represents a special location (castle) in the Candy Land game.
 * Players can enter or exit castles if they are accessible.
 */
public class Castle {
    protected String name;           
    protected boolean isAccessible;  
    protected boolean isInTheCastle; 

    /**
     * Constructor for Castle.
     * @param name The name of the castle.
     */
    public Castle(String name) {
        this.name = name;
        this.isAccessible = true;
        this.isInTheCastle = false;
    }

    /**
     * Gets the name of the castle.
     * @return The name of the castle.
     */
    public String getName() {
        return name;
    }

    /**
     * Checks if the castle is accessible.
     * @return True if accessible, false otherwise.
     */
    public boolean isAccessible() {
        return isAccessible;
    }

    /**
     * Sets whether the castle is accessible.
     * @param accessible True to make accessible, false to block access.
     */
    public void setAccessible(boolean accessible) {
        this.isAccessible = accessible;
    }

    /**
     * Checks if the player is currently inside the castle.
     * @return True if inside, false otherwise.
     */
    public boolean isInTheCastle() {
        return isInTheCastle;
    }

    
    /**
     * Handles the logic for entering the castle.
     * Player can only enter if the castle is accessible and they are not already inside.
     */
    public void enter() {
        if (isAccessible && !isInTheCastle) {
            isInTheCastle = true;
            System.out.println("You have entered the " + name + ".");
        } else if (isInTheCastle) {
            System.out.println("You are already in the " + name + ".");
        } else {
            System.out.println("The " + name + " is not accessible right now.");
        }
    }

    /**
     * Handles the logic for exiting the castle.
     * Player can only exit if they are currently inside.
     */
    public void exit() {
        if (isInTheCastle) {
            isInTheCastle = false;
            System.out.println("You have exited the " + name + ".");
        } else {
            System.out.println("You are not in the " + name + " to exit.");
        }
    }
}
