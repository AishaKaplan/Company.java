package day10_scanner;
import java.util.Scanner;
public class LeapYearSaim {
    public static void main (String []args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a year");
       int year= input.nextInt();
       boolean isLeapYear = year % 4 == 0;
        System.out.println("Is leap year: " + isLeapYear);

    }
}
