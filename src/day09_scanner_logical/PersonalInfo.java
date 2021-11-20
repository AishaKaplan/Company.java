package day09_scanner_logical;
import java.util.Scanner;
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age ");
        byte age = input.nextByte();
        System.out.println("Enter your favorite number ");
        long number = input.nextLong();
        System.out.println("You are a student: ");
        boolean isStudent = age >=18 && age <=24;
        System.out.println("Your age is: "+ age+ "\n Your favorite number is: "+ number + "\n You are a student: " + isStudent);


    }
}
