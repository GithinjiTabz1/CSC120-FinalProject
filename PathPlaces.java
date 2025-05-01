/** 
 * PathPlaces is the base class that each Peppermint Forest, Licorice Lagoon, and Nana's Nut House inherit from in this game.
 * Each location, or Path Place, has a name and a number guessing challenge. If correct the player proceeds and if incorrect, the player must answer a trivia question stored in triviaBoard. The player will then proceed upon answering the question.
*/

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class PathPlaces {
    protected Hashtable<String,String> triviaBoard;
    protected String name;
    protected boolean triviaAcceptance;
    protected int playerInput;
    protected ArrayList<String> triviaQuestions;

    public PathPlaces(String name, int playerInput) {
        this.name = name;
        this.playerInput = playerInput;
        Random random = new Random();
        this.triviaQuestions = new ArrayList<>();
        
        //this.addString();
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
    public void addString() {
        triviaQuestions.add("What is the one secret to Nana's bizcocho recipe?");
        triviaQuestions.add("What is Queen Kandy's favorite color?");
        triviaQuestions.add("What animal does Queen Kandy dream of having in her Castle?");
    }
}