package day10_scanner;
import java.util.Scanner;
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = input.nextByte();
        System.out.println("Enter your favorite number");
        long number = input.nextLong();
        System.out.println("Are you a student: true or false");
        boolean isStudent= input.nextBoolean();
        System.out.println("This is your personal info: ");
        System.out.println("age: " + age);
        System.out.println("favorite number : " + number);
        System.out.println("Are you a student : " + isStudent);


    }
}
