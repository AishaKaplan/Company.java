package day39_wrapper_arraylist;

import java.util.Scanner;

public class ParseExamples {
    public static void main(String[] args) {
        String year="2009";
        int intYear=Integer.parseInt(year);//parseInt is a method here
        System.out.println(year);
        System.out.println(intYear);

        System.out.println(year+1);
        System.out.println(intYear+1);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        String text=scan.nextLine();
        String ageText=text.split(" ")[2];
        int age=Integer.parseInt(ageText);
        System.out.println("In 5 years you will be " + (age+5));

        String priceStr="112.99";
        double priceDouble=Double.parseDouble(priceStr);
        System.out.println(priceDouble);









    }
}
