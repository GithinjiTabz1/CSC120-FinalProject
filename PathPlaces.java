import java.util.Scanner;

public class PathPlaces {
    
    protected String name;
    protected Boolean trivia;
    protected String triviaQuestions;
    protected String acceptance;

public PathPlaces(String name, Boolean trivia, String triviaQuestion, String acceptance) {
    this.name = name;
    this.trivia = trivia;
    this.triviaQuestions = triviaQuestions;
    this.acceptance = acceptance;
}

public String getName() {
    return this.name;
}

public Boolean proceedTrivia(){
    return this.trivia;
}

public String triviaQuestions(){
    return this.triviaQuestions;
}

public String proceedOrNot(){
    return this.acceptance;
}
//all need trivea question
// attributes
// constructor 
//random number
//random objects
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PathPlaces LicoriceLagoon = new PathPlaces("Licorice Lagoon", true, "What is the secret to Nana's bizcocho recipe?", "Yes, I accept the challenge.");
    System.out.println("Location:" + LicoriceLagoon.getName());
    
}
}