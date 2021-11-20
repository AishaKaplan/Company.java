package day12_if_statements;
import java.util.Scanner;
public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Choose your language. Enter a number 1-5");
        int selection = input.nextInt();
        String message= " ";
        if (selection==1){
            message = "hello, thank you for your call";

        } else if (selection==2) {
            message = "hola, gracias para llamar";
        } else if (selection==3){
            message = "merhaba, tesekkurler";
        } else if (selection==4){
            message = "privet";
        } else if (selection==5) {
            message= "merci";
        }
     else {
        message = "Let's talk in English";
    }
}
}