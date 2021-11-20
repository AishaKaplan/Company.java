package office_hours.practice08_25_2021;
import java.util.Scanner;
public class MiddleChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();
        if(word.length()%2==1){

            char middle=word.charAt(word.length()/2);
            System.out.println(middle);
        }else{
            char middleOne=word.charAt(word.length()/2-1);
            char middleTwo=word.charAt(word.length()/2);
            System.out.println(""+ middleOne+middleTwo);
            System.out.println(word.substring(word.length()/2-1, word.length()/2+1));

        }




















    }
}
