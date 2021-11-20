package day10_scanner;
import java.util.Scanner;
public class DivisibleSaim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        boolean isDivisibleByTwo = num % 2==0;
        boolean isDivisibleByThree = num % 3==0;
        boolean isDivisibleByFive= num % 5==0;
        System.out.println(num + " is divisible by 2: " + isDivisibleByTwo);
        System.out.println(num + " is divisible by 3: " + isDivisibleByThree);
        System.out.println(num + " is divisible by 5: " + isDivisibleByFive);

    }
}
