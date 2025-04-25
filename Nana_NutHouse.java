import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class Nana_NutHouse extends PathPlaces{
    private int selectNumber;
    private boolean discoverIngredients;
    private String NanasCake;
    
    public Nana_NutHouse(String name, Boolean triviaAcceptance, int selectNumber, boolean discoverIngredients, String NanasCake) {
        super (name, triviaAcceptance);
        this.selectNumber = selectNumber;
        this.discoverIngredients = discoverIngredients;
        this.NanasCake = NanasCake;
//how do I do it like "welcome to Nana's Nut House. Please collect the three ingredients for her to make her Bizcocho sin leche y gluten"
//add method for nanahouse where if you get the number right you get a gluten-free cake for Kandy Kastle --> 
    }

    public int chocoBridgeNumber() {
        if (selectNumber % 2 != 0) {
            System.out.println("Congratulations! Your magic number " + selectNumber + " has unlocked the chocolate bridge. You advance to Licorice Lagoon!");
        } else {
            System.out.println("Oh no! Your number " + selectNumber + " has broken the chocolate bridge! You will have to take the long way. Best of luck!");
        }
        return this.selectNumber;
    }

//peppermint forest change position to #20
    public boolean scavengerHunt() {
        return this.discoverIngredients;
        //hide sugar, candy, and gluten-free flour for Nana's home. if found advance straight to Nana's house
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        Nana_NutHouse nanasTest = new Nana_NutHouse("Nana's House", null, null, 2, true, null);
        nanasTest.chocoBridgeNumber();
    }
}
