import java.util.Scanner;

/**
 * Main class that runs the Candy Land game.
 * Guides the player through spinning, moving, and entering special locations.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FullSpinner spinner = new FullSpinner(); // Simulates spinning the wheel
        Player player = new Player();            // Tracks player tile, keys, alive status, and win status

        System.out.println("Welcome to Candy Land!");
        System.out.println("You are currently on Tile " + player.currentposition());

        // Main game loop
        while (player.isAlive()) {
            System.out.println("\n Spin the wheel to move forward!");
            System.out.print("Press Enter to spin...");
            scanner.nextLine();

    

            // Handle special locations
            if (tile == 5) {
                System.out.println("You arrived at Peppermint Forest!");
                peppermintForest peppermint = new peppermintForest();
                peppermint.enter(player);
            } else if (tile == 10) {
                System.out.println("Welcome to Nana’s Nuthouse!");
                Nana_NutHousehouse nana = new Nana_NutHouse()Nuthouse();
                nana.enter(player);
            } else if (tile == 15) {
                System.out.println("Entering Licorice Lagoon...");
                licoriceLagoon lagoon = new licoriceLagoon();
                lagoon.enter(player);
            } else if (tile == 20) {
                System.out.println("You made it to Lollipop Castle!");
                LollipopCastle lollipop = new LollipopCastle();
                lollipop.startChallenge();
                if (lollipop.getIsAlive()) {
                    player.obtainKeyToFrostedPalace();
                } else {
                    player.setAlive(false);
                }
            } else if (tile == 25) {
                System.out.println("You’ve reached the Frosted Palace.");
                frostedPalace frosted = new frostedPalace();
                frosted.startChallenge();
                if (frosted.getIsAlive()) {
                    player.obtainKeyToKingKandy();
                } else {
                    player.setAlive(false);
                }
            } else if (tile == 60) {
                if (player.hasKeyToKingKandy()) {
                    System.out.println("\n You’ve arrived at King Kandy’s Castle!");
                    System.out.println(" YOU WIN! Sweet victory is yours!");
                    player.setHasWon(true);
                } else {
                    System.out.println("\n You reached the castle, but you don't have the final key! Find the Frosted Palace first.");
                }
            } else {
                System.out.println("Nothing special here. Keep moving!");
            }

            // Check if the player has died
            if (!player.isAlive()) {
                System.out.println("\nOh no! You didn’t survive the journey. Game Over.");
            }
        }

        scanner.close();
    }
}
