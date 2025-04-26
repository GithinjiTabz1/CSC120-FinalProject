import java.util.Scanner;

public class Nana_NutHouse extends PathPlaces{
    
    public Nana_NutHouse(String name, boolean triviaAcceptance, int playerInput, boolean discoverIngredients) {
        super (name, triviaAcceptance, playerInput);
    }

    public int chocoBridgeNumber() {
        if (playerInput % 2 != 0) {
            System.out.println("Congratulations! Your magic number " + playerInput + " has unlocked the chocolate bridge. You advance to Licorice Lagoon!");
        } else {
            System.out.println("Oh no! Your number " + playerInput + " has broken the chocolate bridge! You will have to take the long way. Best of luck!");
        }
        return this.playerInput;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Nana_NutHouse nanasTest = new Nana_NutHouse("Nana's House", true, 7, true);
        nanasTest.chocoBridgeNumber();
    }
}
