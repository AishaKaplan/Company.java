package day30_arrays_for_each_loop;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        String[] personOne={"Linda", "123456", "$1000.88", "Checking"};

        String[] personTwo=new String[4];
        personTwo[0]="Ahmet";
        personTwo[1]="123456";
        personTwo[2]="1000.90";
        personTwo[3]="Checking";
        System.out.println(Arrays.toString(personOne));
        System.out.println(Arrays.toString(personTwo));

        Scanner input=new Scanner(System.in);
String [] personThree=new String[4];
        System.out.println("Enter your name");
        personThree[0]= input.next();
        System.out.println("Enter your account number");
        personThree[1]=input.next();
        System.out.println("Enter your account amount");
        personThree[2]= input.next();
        System.out.println("Amount type");
        personThree[3]= input.next();

        System.out.println("First account: "+ Arrays.toString(personOne));
        System.out.println(Arrays.toString(personTwo));
        System.out.println(Arrays.toString(personThree));
        // Dynamic scanner:
        String[] personFour=new String[4];
        String[] questions={"first name", "account number", "balance", "account type"};
        for(int i=0; i<personFour.length; i++) {
            System.out.println("Enter your " + questions[i]);
            personFour[i] = input.next();
        }
        System.out.println(Arrays.toString(personOne));
        System.out.println(Arrays.toString(personTwo));
        System.out.println(Arrays.toString(personThree));
        System.out.println(Arrays.toString(personFour));




    }
}
