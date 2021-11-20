package day09_scanner_logical;
import java.util.Scanner;
public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = input.nextDouble();
        System.out.println("Enter your weekly hour");
        int weeklyHour= input.nextInt();
        double hourRate= salary/(weeklyHour*52);
        System.out.println("Hourly rate of employee: " + "$" + hourRate);
    }
}
