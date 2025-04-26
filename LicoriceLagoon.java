public class LicoriceLagoon extends PathPlaces{
    private int selectNumber;
    private Boolean trivia;
    private String triviaQuestions;
    private String acceptance;

    public LicoriceLagoon(){

    }

    public int guessNumber(){
        return this.selectNumber;
        /*
         * When you land in the lagoon
         *  you will need to guess the number 
         */
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

    /*Navigate through lagoon */
}
