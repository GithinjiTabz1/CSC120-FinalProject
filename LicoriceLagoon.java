import java.util.Scanner;

public class LicoriceLagoon extends PathPlaces{

    public LicoriceLagoon(String name, int playerInput) {
        super (name, playerInput);
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
        String question = triviaQuestions.get(this.random.nextInt (triviaQuestions.size()));
        
        if (playerInput >= 2000 && playerInput <= 5000) {
            if (playerInput % 2 != 0) {
                System.out.println("Aha! I see you have done your research! " + playerInput + " licorice make up the Lagoon. You can advance to the next tile.");
            } else {
                System.out.println("Oh no! " + playerInput + " is not the correct number of licorice that make up the Lagoon. You must complete the following trivia question to move to the next tile." + question);
                System.out.println(scanner.nextLine());
                String response = scanner.nextLine();
                
                System.out.println("Well done! You have completed the challenge and may progress to the next tile.");
            }
        } else { 
                throw new IllegalArgumentException("Please enter a number between 2000 and 5000.");
            }
            
    }
    public void finalSentiment() {
        System.out.println("That's right! You have completed the challenge and may progress to the next tile.");
        }
