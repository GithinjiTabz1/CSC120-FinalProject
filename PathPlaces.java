import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class PathPlaces {
    protected Hashtable<String,String> triviaBoard;
    protected String name;
    protected Boolean triviaAcceptance;

public PathPlaces(String name, Boolean triviaAcceptance) {
    this.name = name;
    this.triviaAcceptance = triviaAcceptance;
    this.triviaBoard = new Hashtable<String, String>();
}

public String getName() {
    return this.name;
}

public Boolean triviaAcceptance(){
    return this.triviaAcceptance;
}

public Hashtable triviaBoard(){
    return this.triviaBoard;
}
//need help below
public void addQuestion(String question, String answer) {
    triviaBoard.put(question, answer);
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    triviaQuestions.add("What is the secret to Nana's bizcocho recipe?");
    triviaQuestions.add("What are the three most important ingredients for Nana's desserts?");

    PathPlaces LicoriceLagoon = new PathPlaces("Licorice Lagoon", true, "What is the secret to Nana's bizcocho recipe?", "Yes, I accept the challenge.");
    System.out.println("Location:" + LicoriceLagoon.getName());

}
}