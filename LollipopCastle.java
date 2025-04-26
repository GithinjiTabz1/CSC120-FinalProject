public class LollipopCastle extends Castle {
    
    // Attributes
    private int jumpAttempts;  // Number of tries allowed

    // Constructor
    public LollipopCastle() {
        super("Lollipop Castle");
        this.jumpAttempts = 2;  // Set number of jump attempts
    }

    // Start the jumping challenge
    public void startChallenge() {
        // 1. Announce the challenge and rules
        // 2. Loop for number of attempts:
            // - Prompt player to enter jump height
            // - Call jumpChallenge(height)
            // - If jump successful: print success message, break
            // - If jump fails and no attempts left: end challenge
        // 3. Based on success/failure:
            // - "You may now proceed to the Frosted Palace."
            // - "Sorry, you failed the challenge. Game over."
    }

    // Determines if the jump is successful
    public boolean jumpChallenge(int height) {
        // Check if height meets a success condition
        // Return true if successful, false otherwise
    }
}


// and jump too hgh...