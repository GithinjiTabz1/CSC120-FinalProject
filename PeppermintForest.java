import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PeppermintForest extends PathPlaces{
    
    public PeppermintForest(String name, boolean triviaAcceptance, int playerInput) {
        super(name, triviaAcceptance, playerInput);
    }

    public void printPathName() {
        System.out.println("You have entered the Peppermint Forest! With the aroma of peppermint candy canes, mint chocolate chip, and sugar, you are ready to begin your first challenge. From 1 - 10000, how many peppermint candy canes make up the Peppermint Forest?");
    
        Scanner scanner = new Scanner(System.in);
        int playerInput = scanner.nextInt();

        if (playerInput >= 1 && playerInput <= 10000) {
            if (playerInput % 2 != 0) {
                System.out.println("Way to go! Exactly " + playerInput + " peppermint candy canes make up the Peppermint Forest! You can advance to the next tile. Remember to grab a candy cane on your way out.");
            } else {
                System.out.println("Unfortunately " + playerInput + " is not the correct amount of peppermint candy canes that make up the Peppermint Forest. You can continue on your path, but you may not take a peppermint candy cane. Good luck!");
                String question = triviaQuestions.get(random.nextInt (triviaQuestions.size()));
            }
        } else { 
                throw new IllegalArgumentException("Please enter a number between 1 and 10000.");
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //PeppermintForest pfTest = new PeppermintForest("PF", false, 2);


        //PeppermintForest pfTest = new PeppermintForest("Peppermint Forest", true, 4238);
        //pfTest.printPathName();
    }