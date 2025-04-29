/**
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Nana_NutHouse extends PathPlaces{
    
    public Nana_NutHouse(String name, int playerInput, ArrayList triviaQuestions) {
        super (name, playerInput, triviaQuestions);
    }

    public int chocoBridgeNumber() {
        if (playerInput % 2 != 0) {
            System.out.println("Congratulations! Your magic number " + playerInput + " has unlocked the chocolate bridge. You advance to Licorice Lagoon!");
        } else {
            System.out.println("Oh no! Your number " + playerInput + " has broken the chocolate bridge! You will have to take the long way after you answer this trivia question. Best of luck!");
            String question = triviaQuestions.get(this.random.nextInt (triviaQuestions.size()));
            System.out.println("Well done! You have completed the challenge and may progress to the next tile.");
        }
        return this.playerInput;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Nana_NutHouse nanasTest = new Nana_NutHouse("Nana's House", 6);
        nanasTest.chocoBridgeNumber();
    }
}
