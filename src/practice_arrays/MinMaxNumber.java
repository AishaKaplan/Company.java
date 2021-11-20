package practice_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("How many number you would like to enter?");
int min=0;
int max=0;

int [] number=new int [scan.nextInt()];
for (int i=0; i<number.length; i++){
    System.out.println("Enter your number " + (i+1) +": ");
    number[i] = scan.nextInt();

    if(min>number[i]){
        min=number[i];
    }
    if(max< number[i]){
        max=number[i];
    }
}
        System.out.println(Arrays.toString(number));
        System.out.println("Min number is: " + min);
        System.out.println("Max number is: " + max);







    }
}
