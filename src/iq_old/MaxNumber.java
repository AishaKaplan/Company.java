package iq_old;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber=input.nextInt();
        int secondNumber=input.nextInt();
        int thirdNumber= input.nextInt();
        int fourthNumber=input.nextInt();
        int fifthNumber= input.nextInt();
        String result="";
        int max=0;
        if(firstNumber>max){
            max=firstNumber;
        } if(secondNumber>max){
            max=secondNumber;
        }if(thirdNumber>max){
            max=thirdNumber;
        }if(fourthNumber>max){
            max=fourthNumber;
        }if(fifthNumber>max){
            max=fifthNumber;
        }
        System.out.println("Max number is: " + max);










    }
}
