package day_36_methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore();
        System.out.println(getCreditScore());
        int score=getCreditScore(); //same thing
        System.out.println(score);
        hasGoodCreditScore(900);
        System.out.println(hasGoodCreditScore(860));
        System.out.println(hasGoodCreditScore(700));

        if(hasGoodCreditScore(600)){
            System.out.println("Good Score");

        }else{
            System.out.println("Bad score");
        }
    }
    public static int getCreditScore(){
        return 800;
    }
    public static boolean hasGoodCreditScore(int score){
        if(score>750){
            return true;
        }else {
            return false;
        }
    }






}
