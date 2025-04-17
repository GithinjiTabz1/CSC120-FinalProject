public class frostedPalace extends Castle {
    
    // Attributes
    private int correctNumber;     // Number player must guess
    private int temperature;       // Current temperature
    private boolean isAlive;       // Player's survival status

    // Constructor
    public frostedPalace() {
        super("Frosted Palace");
        // initialize correctNumber, temperature, isAlive
    }

    // Methods

    // Starts the challenge in Frosted Palace
    public void startChallenge() {
        // Loop:
        // - Ask player to guess
        // - Decrease temperature on wrong guess
        // - End if guessed correctly or temperature drops too low
    }

    // Generates a random number between 1 and 10
    private int generateRandomNumber() {
        // Return random number
    }

    // Checks if the player is still alive
    public boolean getIsAlive() {
        // Return survival status
    }

    // Returns current temperature
    public int getTemperature() {
        // Return temperature value
    }

    // Optional: Set a freeze threshold (e.g., if temperature <= 0)
    private boolean checkFrozen() {
        // Return true if player should be considered frozen
    }
}


