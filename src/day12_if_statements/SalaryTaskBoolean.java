package day12_if_statements;
import java.util.Scanner;
public class SalaryTaskBoolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Write a program that will accept your salary amount. Then also ask the user if they are full time or not ( boolean). If they are full time, add 20000 to their salary, but if they are //part time then subtract 5000. Print the final salary.
        System.out.println("Enter your salary");
        double salary = input.nextDouble();
        System.out.println("Are you a full time employee? (true or false)");
        boolean fullTime = input.nextBoolean();
        if (fullTime==true) {
            salary += 20000;
            System.out.println(salary);
        }
        else {
            salary -= 5000;

        }
        System.out.println("Your final salary is: $" + salary);
    }
}
