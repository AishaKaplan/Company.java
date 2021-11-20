package day10_scanner;
import java.util.Scanner;
public class ChangeMachine {
    public static void main(String[] args) {
        /*
        Ask the user to enter some number from 1-99

        quarters
        dimes
        nickels
        pennies

         ex: 80 cents
         3 quarters
         0 dimes
         1 nickels
         0 pennies

         Hint: use %
         */

        Scanner input = new Scanner(System.in);
        int userMoney, quarters, dimes, nickles, pennies;

        System.out.println(" Hello, welcome to the change machine");
        System.out.println( " Please enter your cents from 1-99");
        userMoney = input.nextInt();

        quarters = userMoney/25;
        userMoney %= 25;
        dimes= userMoney/10;
        userMoney %=10;
        nickles = userMoney / 5;
        userMoney %=5;
        pennies = userMoney;

        System.out.println("Your change is: ");
        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickles: " + nickles);
        System.out.println("pennies: " + pennies);

        input.close();



    }
}
