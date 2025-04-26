import java.util.Random;
import java.util.Scanner;

public class LicoriceLagoon extends PathPlaces{

    public LicoriceLagoon(String name, boolean triviaAcceptance, int playerInput) {
        super (name, triviaAcceptance, playerInput);
    }
    public void printPathName() {
            /*
             * When you land in the lagoon you will need to guess a number from 1 to 10.
             * If you guess it incorectly, you will get a random trivia question.
             * Hashtable of the trivia questions.
             */
        System.out.println("You have entered the Licorice Lagoon! You are ready to begin your next challenge. From 2000 - 5000, how many licorice make up the Lagoon?");
    
        Scanner scanner = new Scanner(System.in);
        int playerInput = scanner.nextInt();

        if (playerInput >= 2000 && playerInput <= 5000) {
            if (playerInput % 2 != 0) {
                System.out.println("Aha! I see you have done your research! " + playerInput + " licorice make up the Lagoon. You can advance to the next tile.");
            } else {
                System.out.println("Oh no!" + playerInput + " is not the correct number of licorice that make up the Lagoon. You must complete the following trivia question to move to the next tile.");
            // String triviaQ = getRandomkey(triviaBoard);
            }
        } else { 
                throw new IllegalArgumentException("Please enter a number between 2000 and 5000.");
            }
    }
    
        Random trivia = new Random();
        

        public Boolean proceedTrivia(){
            /* 
             * If number guessed is incorrect proceed to trivia questions.
             */
            return this.triviaAcceptance;
        }
            /*
             * Random questions in an Array List
             */
    

            /*
             * If trivia questions wrongly answered then player loses
               and therefore proceeds through the long way and does not get directly
               relocated to were the catsles are.
             * If correctly answered then player gets relocated to the first castle.
             */
    
    }