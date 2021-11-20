package generalPractice;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence=scan.nextLine();

        String [] newWord=sentence.split(" ");
        for(String each: newWord){
            System.out.println(each);
        }




    }
}
