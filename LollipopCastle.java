public class LollipopCastle extends Castle {
    private int jumpAttempts;

    public LollipopCastle() {
        super("Lollipop Castle");
        this.jumpAttempts = 2; // Number of chances the player has to jump correctly
    }

    public boolean jumpChallenge(int height) {
        /*
         * Logic:
         * - If height is within the safe range (e.g., 5 to 10), the jump is successful.
         * - If height is too low (e.g., < 5), the player falls short and "dies".
         * - If height is too high (e.g., > 10), the player hits something and "dies".
         * - Allow the player up to 'jumpAttempts' to get it right.
         */

        // Placeholder return for now — actual logic to be implemented
        return false;
    }

    public int getJumpAttempts() {
        return jumpAttempts;
    }

    public void resetJumpAttempts() {
        this.jumpAttempts = 2; //to reset when retrying
    }
}
