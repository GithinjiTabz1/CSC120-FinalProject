/** 
 * PathPlaces is the base class that each Peppermint Forest, Licorice Lagoon, and Nana's Nut House inherit from in this game.
 * Each location, or Path Place, has a name and a number guessing challenge. If correct the player proceeds and if incorrect, the player must answer a trivia question stored in triviaBoard. The player will then proceed upon answering the question.
*/

import java.util.Hashtable;
import java.util.Scanner;


public class PathPlaces {
    protected Hashtable<String,String> triviaBoard;
    protected String name;
    protected boolean triviaAcceptance;
    protected int playerInput;

public PathPlaces(String name, boolean triviaAcceptance, int playerInput) {
    this.name = name;
    this.triviaAcceptance = triviaAcceptance;
    this.playerInput = playerInput;
    this.triviaBoard = new Hashtable<String, String>();
}

public void printPathName() {
    System.out.println("Welcome to " + this.name + "!");
}

public String getPathName() {
    return this.name;
}

public boolean isTriviaAccepted(){
    return this.triviaAcceptance;
}

public Hashtable<String, String> getTriviaBoard(){
    return this.triviaBoard;
}

public void addQuestion(String question, String answer) {
    triviaBoard.put(question, answer);
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // triviaQuestions.add("What is the secret to Nana's bizcocho recipe?");
    // triviaQuestions.add("What are the three most important ingredients for Nana's desserts?");

    // PathPlaces LicoriceLagoon = new PathPlaces("Licorice Lagoon", true");
    // System.out.println("Location:" + LicoriceLagoon.getName());

}
}

// Hashtable<String, String> triviaBoard = new Hashtable<String, String>();
// triviaBoard.put("What is the secret to Nana's bizcocho recipe?", "e");