package office_hours.day09_09;

import java.util.Arrays;
import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {
      /*
      ask how many emails they want to make
      ask the user to enter last name
      all lower case
      ask the user to enter first name
      first letter uppercase, the rest lowercase
      first three letters of the first name
      ask the user to enter their favorite number
      the number * last name length
      last name+ first name+ number+.gmail.com
      store the emails into array
       */
Scanner input=new Scanner(System.in);
        System.out.println("How many emails you want to make?");
        int size=input.nextInt();
        String [] emails=new String[size];
        for(int i=0; i<emails.length; i++) {
            System.out.println("Enter your last name");
            String lastName = input.next().toLowerCase();
            System.out.println("Enter your first name");
            String firstName = input.next().toLowerCase();
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1, 3);
            System.out.println("Enter your favorite number");
            int favNum = input.nextInt() * lastName.length();
            emails[i] = lastName + "." + firstName + favNum + "@gmail.com";

        }

        System.out.println(Arrays.toString(emails));




    }
}
