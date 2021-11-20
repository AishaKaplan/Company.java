package day09_scanner_logical;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an int number ");
        int number = input.nextInt();
        boolean isEven = number%2==0;
        boolean isOdd = number%2!=0;
        System.out.println("Number " + number + " is even: " +isEven);
        System.out.println("Number " + number + " is odd: " + isOdd);

    }
}
