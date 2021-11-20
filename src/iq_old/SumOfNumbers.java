package iq_old;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=input.nextInt();
        int sum=0;
        while (number>0) {
            sum += number;
            System.out.println("Your sum is: " + sum);
            System.out.println("Enter new number");
            number = input.nextInt();
            if (number < 0) {

                System.out.println(number + " is less than 0. Program ended.");
            }
        }

    }
}
