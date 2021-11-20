//package day16_switch;
//import java.util.Scanner;
//
//public class TernaryPractice2 {
//    public static void main(String[] args) {
//       boolean isGreen=true;
//       String action = isGreen ? "go" : "stop";
//        System.out.println(action);
//
//        String name="Nadir";
//        String className=name.equals("Nadir") ? "Soft skills" : "Java";
//        System.out.println(className);
//
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a number");
//int number = input.nextInt();
//        System.out.println(number % 2==0 ? "Even number" : "Odd number");
//        System.out.println();
//
//        System.out.println("Enter number one");
//        double numberOne=input.nextDouble();
//        System.out.println("Enter number two");
//        double numberTwo=input.nextDouble();
//        double max=numberOne>numberTwo ? numberOne : numberTwo;
//        System.out.println(max);

   package day16_switch;
import java.util.Scanner;
        public class TernaryPractice2 {
            public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the items name");
                String itemName=input.nextLine();
                System.out.println("Enter the price of " + itemName);
                double itemPrice=input.nextDouble();
                System.out.println("Do you have prime?");
                String hasPrime=input.next();
                // Add shipping cost of 5 $ if they don't have prime.
                double finalPrice = hasPrime.equals("yes") || hasPrime.equals("Yes") ? itemPrice : itemPrice + 5;
                System.out.println("Your total price for " + itemName + " $ " + finalPrice + 5);

























    }





}
