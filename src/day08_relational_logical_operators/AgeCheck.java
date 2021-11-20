package day08_relational_logical_operators;
import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an age number");

        int age=input.nextInt();
        boolean isAToddler = age <= 3;
        boolean isASenior= age >= 65;
        System.out.println("Is still a toddler: " + isAToddler);
        System.out.println("Is a senior: " + isASenior);











    }
}
