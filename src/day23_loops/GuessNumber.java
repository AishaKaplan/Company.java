package day23_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int secretNumber=80;
        int userGuess;
        int attempts=0;

        do{
            System.out.println("Guess a number");
            userGuess= input.nextInt();
            attempts++;
            // this if statement checks for valid inputs of number from 1-100
            if(userGuess>0 && userGuess<=100){
                //this if statement tells the user how close the guess is to the number
                // this is a repeated action
            }
            if(userGuess==secretNumber){
                System.out.println("Good guess! The number was: "+ secretNumber);

            } else if(userGuess<secretNumber){
                System.out.println(userGuess + " is too small");

            } else if(userGuess>secretNumber){
                System.out.println(userGuess + " is too big");

            } else{
                System.out.println("Invalid number, needs to be between 1-100");
            }
        }while (userGuess!=secretNumber); //keep running the above code until the guess number is the same as the secret number
        //below code is only to give feedback to the guess attempts, not //limiting
    if(attempts<=2){
        System.out.println("really good guess");
    }else if(attempts<=4){
        System.out.println("still good guess");
    }else{
        System.out.println("a lot of guesses but you got it");
    }
    }
}
