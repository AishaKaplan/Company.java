package day15_switch;
import java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int age= input.nextInt();
       if(age>=0 && age <= 120) {
           if (age <= 1) {
               System.out.println("Infant");

           } else if (age <= 5){
               System.out.println("Toddler");
           } else if(age <=9) {
           System.out.println("Kid");
       } else if(age <=12) {
           System.out.println("Pre Teen");
       }else if (age <=17) {
           System.out.println("Teenager");
       } else if (age <=20) {
           System.out.println("Young adult");
       } else if(age <=35) {
           System.out.println("Adult");
       }else if (age <=55 ){

           System.out.println("Middle Aged Adult");
       } else {
           System.out.println("Senior Citizen");
       }
       } else {
           System.out.println("Invalid age");
       }

    }
}
