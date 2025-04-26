public class LicoriceLagoon {
    private int selectNumber;
    private Boolean trivia;
    private String triviaQuestions;
    private String acceptance;

    public LicoriceLagoon(){

    }

    public int guessNumber(){
        return this.selectNumber;
        /*
         * When you land in the lagoon you will need to guess a number from 1 to 10.
         * If you guess it incorectly, you will get a random trivia question.
         * Array List of the trivia questions.
         */
    }

    public Boolean proceedTrivia(){
        /* 
         * If number guessed is incorrect proceed to trivia questions.
         */
        return this.trivia;
    }

    public String triviaQuestions(){
        /*
         * Random questions in an Array List
         */
        questions = new ArrayList<>();

        return this.triviaQuestions;
    }

    public String proceedOrNot(){
        /*
         * If trivia questions wrongly answered then player loses
           and therefore proceeds through the long way and does not get directly
           relocated to were the catsles are.
         * If correctly answered then player gets relocated to the first castle.
         */
        return this.acceptance;
    }

}
