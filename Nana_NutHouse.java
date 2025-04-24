import java.util.Scanner;
import java.util.Random;

public class Nana_NutHouse extends PathPlaces{
    private int selectNumber;
    private boolean discoverIngredients;
    private String NanasCake;
    
    public Nana_NutHouse(String name, Boolean trivia, String triviaQuestion, String acceptance, int selectNumber, boolean discoverIngredients, String NanasCake) {
        super (name, trivia, triviaQuestion, acceptance);
        this.selectNumber = selectNumber;
        this.discoverIngredients = discoverIngredients;
        this.NanasCake = NanasCake;

//add method for nanahouse where if you get the number right you get a gluten-free cake for Kandy Kastle --> 
    }

    public int chocoBridgeNumber() {
        if (//number is odd, bridge breaks, and lose one life) {
        //if statement is true
        } else {
            //false
        }
        return this.selectNumber;
        //how do I make it so the chocolate bridge breaks if an odd number is typed ?
        //advance to nana nut house if even number is typed? if, else
    }

//peppermint forest change position to #20
    public boolean scavengerHunt() {
        return this.discoverIngredients;
        //hide sugar, candy, and gluten-free flour for Nana's home. if found advance straight to Nana's house
    }

    public int findSugarCubes() {
        //if land on certain color, sugar cube found
        //how do I create a baseline sugar cube amount
    }


    //scanner class needed 
    //or use random number generator within a range 
    //hide a peppermint candy on trail and if found, advance to peppermint forest
    // how many gingerbreads in the bag, then you advance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
    }
}
