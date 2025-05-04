import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PeppermintForest extends PathPlaces{
    private String name;
    private int playerInput;
    private ArrayList<String> triviaQuestions;
    private  boolean hasKey = false;
    private static boolean hasKeyToLollipop =false;
    private Random random;

    
    public PeppermintForest(String name, int playerInput) {
        super(name, playerInput);
    }

    public  void printPathName() {
        System.out.println("You have entered the Peppermint Forest! With the aroma of peppermint candy canes, mint chocolate chip, and sugar, you are ready to begin your first challenge. From 1 - 10000, how many peppermint candy canes make up the Peppermint Forest?");
    
        
    }
    
    /*
    * If trivia questions wrongly answered then player loses and therefore proceeds through the long way and does not get directly relocated to were the catsles are.
    * If correctly answered then player gets relocated to the first castle.
    */
    public static void startChallenge(){

        Scanner scanner = new Scanner(System.in);
        int playerInput = scanner.nextInt();

        if (playerInput >= 1 && playerInput <= 10000) {
            if (playerInput % 2 != 0) {
                System.out.println("Way to go! Exactly " + playerInput + " peppermint candy canes make up the Peppermint Forest! You can advance to the next tile. Remember to grab a candy cane on your way out.");
            } else {
                System.out.println("Unfortunately " + playerInput + " is not the correct amount of peppermint candy canes that make up the Peppermint Forest. You can continue on your path, but you may not take a peppermint candy cane. Good luck!");
            }
        } else { 
                throw new IllegalArgumentException("Please enter a number between 1 and 10000.");
            }
        }}

    
