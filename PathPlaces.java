/** 
 * PathPlaces is the base class that each Peppermint Forest, Licorice Lagoon, and Nana's Nut House inherit from in this game.
 * Each location, or Path Place, has a name and a number guessing challenge. If correct the player proceeds and if incorrect, the player must answer a trivia question stored in triviaQuestions. The player will then proceed upon answering the question.
 * The following imports, a scanner and an arraylist are necessary for PathPlaces.
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/** 
 * The following attributes are for Path Places and each subclass; Peppermint Forest, Nana's Nut House, and Licorice Lagoon. The trivia questions are stored in an Array List. 
*/

public class PathPlaces {
    protected String name;
    protected int playerInput;
    protected ArrayList<String> triviaQuestions;
    protected Random random;
/**
 * The following constructor includes these paramenters:
 * @param name
 * @param playerInput
 */
public PathPlaces(String name, int playerInput) {
    this.name = name;
    this.playerInput = playerInput;
    this.triviaQuestions = new ArrayList<>();
    this.random = new Random();
}
/**
 * printPathName will print the name of each subclass. 
 * getPathName obtains the name of the subclass. 
 * addString are the questions stored in the array list triviaQuestions. Initially a hashtable was going to be used, but for simplicity purposes an array list seemed to work better at this time.
 */
public void printPathName() {
    System.out.println("Welcome to " + this.name + "!");
}

public String getPathName() {
    return this.name;
}
/*
* Random questions in an Array List
*/
public void addString(String str) {
    this.triviaQuestions.add("What is the one secret to Nana's bizcocho recipe?");
    this.triviaQuestions.add("What is Queen Kandy's favorite color?");
    this.triviaQuestions.add("What animal does Queen Kandy dream of having in her Castle?");
}
/**
 * Main Method
 * @param args
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
}
}