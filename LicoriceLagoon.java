import java.util.ArrayList;
import java.util.Scanner;


    }

    public int guessNumber(){
        return this.selectNumber;
        /*
         * When you land in the lagoon you will need to guess a number from 1 to 10.
         * If you guess it incorectly, you will get a random trivia question.
         * Array List of the trivia questions.
         */
    }

    public Boolean proceedTrivia(){
        /* 
         * If number guessed is incorrect proceed to trivia questions.
         */
        return this.trivia;
    }

    public String triviaQuestions(){
        /*
         * Random questions in an Array List
         */
        questions = new ArrayList<>();

        return this.triviaQuestions;
    }

    public String proceedOrNot(){
        /*
         * If trivia questions wrongly answered then player loses
           and therefore proceeds through the long way and does not get directly
           relocated to were the catsles are.
         * If correctly answered then player gets relocated to the first castle.
         */
        return this.acceptance;
        
public class LicoriceLagoon extends PathPlaces{

    public LicoriceLagoon(String name, int playerInput, ArrayList triviaQuestions) {
        super (name, playerInput, triviaQuestions);
    }
    public void printPathName() {
            /*
             * When you land in the lagoon you will need to guess a number.
             * If you guess it incorectly, you will get a random trivia question.
             * ArrayList of the trivia questions.
             */
        System.out.println("You have entered the Licorice Lagoon! You are ready to begin your next challenge. From 2000 - 5000, how many licorice make up the Lagoon?");
    
        Scanner scanner = new Scanner(System.in);
        int playerInput = scanner.nextInt();
        System.out.println(triviaQuestions.size());
        String question = triviaQuestions.get(this.random.nextInt (triviaQuestions.size()));
        
        if (playerInput >= 2000 && playerInput <= 5000) {
            if (playerInput % 2 != 0) {
                System.out.println("Aha! I see you have done your research! " + playerInput + " licorice make up the Lagoon. You can advance to the next tile.");
            } else {
                System.out.println("Oh no! " + playerInput + " is not the correct number of licorice that make up the Lagoon. You must complete the following trivia question to move to the next tile." + question);
                
                System.out.println("Well done! You have completed the challenge and may progress to the next tile.");
            }
        } else { 
                throw new IllegalArgumentException("Please enter a number between 2000 and 5000.");
            }
            
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

}
        LicoriceLagoon llTest = new LicoriceLagoon("Licorice Lagoon", 2003, PathPlaces.triviaQuestions);
        llTest.printPathName();
        }
    }