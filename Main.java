import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
        // Initialize the game components
        // 1. Create a FullSpinner object:
        FullSpinner spinner = new FullSpinner();

        // 2. Test the spin() method:
        System.out.println("Testing the spin() method:");
        for (int i = 0; i < 10; i++) { // Spin it a few times
            String result = spinner.spin();
            System.out.println("Spin " + (i + 1) + ": " + result);
        }

        // 3.  Example of accessing SpinnerPart data (optional):
        System.out.println("\nTesting SpinnerPart data:");
        // Since 'parts' is private in FullSpinner, we can't directly access it.
        // If you need to access the parts, you could add a method to FullSpinner,
        // but for this test, we'll just show how the spin() method gives us the data.

        String firstPart = spinner.spin(); // Get the result of a spin
        System.out.println("A spin landed on: " + firstPart);
        //  you could further process the String  if needed (e.g., extract color/item).
        }
}
