package iq_old;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);

        String sentence=input.nextLine();
        System.out.println("Enter a sentence");
        int count=1;
        for(int i=0; i<sentence.length()-1; i++) {

            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ') {
                count++;
            }
        }
            System.out.println("Number of words: " + count);



    }
}
