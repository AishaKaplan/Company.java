package day39_wrapper_arraylist;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your email");
        String email=input.next();
        int upper=0, lower=0, num=0, other=0;

        for(char each: email.toCharArray()){
            if(Character.isUpperCase(each)){
                upper++;
            } else if(Character.isLowerCase(each)){
                lower++;
            }else if(Character.isDigit(each)){
                num++;
            }else{
                other++;
            }

        }
        System.out.println("Upper case: " + upper);
        System.out.println("Lower case: " + lower);
        System.out.println("Digits: " + num);
        System.out.println("Other: " + other);







    }
}
