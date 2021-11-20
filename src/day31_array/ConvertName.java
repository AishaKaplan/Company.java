package day31_array;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String name=input.next();
        char [] firstName=name.toCharArray(); //both works as below:
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toCharArray()[0]); //first letter
        System.out.println(firstName[0]);//first letter same as above.
        System.out.println(firstName[firstName.length-1]);
        System.out.println(firstName[0] + " " + firstName[1]);

        char [] arr={'f', 'r', 'i', 'd','a', 'y'};
      //  String str=new String(arr); //another method
        System.out.println(arr);













    }
}
