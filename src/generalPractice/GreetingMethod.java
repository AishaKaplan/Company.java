package generalPractice;

import java.util.Scanner;

public class GreetingMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        greeting(name);
    }
        public static void greeting(String name){
            System.out.println("Hello " + name+ ", how are you?");

        }

    }

