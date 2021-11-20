package day32_array;

import java.util.Scanner;

public class SplitPractice2 {
    public static void main(String[] args) {
        //3 words
        //reverse the middle word
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three words");
        String str= input.nextLine();
        input.close(); //close your scanner
        String [] words=str.split(" ");
        String reverse="";
        for(int i=words[1].length()-1; i>=0; i--){
            reverse+=words[1].charAt(i);
        }
        System.out.println(words[0] + " " + reverse+ " "+ words[2]);


    }
}
