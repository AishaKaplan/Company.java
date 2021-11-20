package day26;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your text");
        String text=input.nextLine();

        System.out.println("Enter how many times you want to repeat the end");
        int repeat=input.nextInt();
        for(int i=0; i<repeat; i++){
            text+=text.charAt(text.length()-1);
        }
        System.out.println(text);





    }
}
