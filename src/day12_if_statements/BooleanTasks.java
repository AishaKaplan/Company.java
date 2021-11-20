package day12_if_statements;
import java.util.Scanner;
public class BooleanTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a boolean (ture or false)");
        boolean value= input.nextBoolean();
        if (value==true) {
            System.out.println("The opposite of your input is " + !value);

        } else {
            System.out.println("The opposite of your input is " + !value);

        }


    }
}
