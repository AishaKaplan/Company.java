package day29_array;

import java.util.Scanner;

public class PickMonth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] months = {
                "Jan", "Feb", "Mar", "Apr", "May" , "Jun" , "Jul", "Aug" ,
                "Sep","Oct", "Nov", "Dec"
        };

        System.out.println("Enter a month number: ");
        int month = input.nextInt();


        System.out.println("The month you picked is: " + months[month-1]);
    }
}
