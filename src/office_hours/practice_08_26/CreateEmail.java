package office_hours.practice_08_26;
import java.util.Scanner;
public class CreateEmail {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String wordOne=input.nextLine();

        System.out.println("Enter a string");
        String wordTwo=input.nextLine();
        String email="";
        if(wordOne.length()>=6 && wordTwo.length() >=6){
       email+= wordOne.substring(0,4);
       email+=wordTwo.substring(wordTwo.length()-3);
        email+="@cybertek.com";


        }else{
            System.out.println("Invalid data");
        }
        System.out.println(email.toLowerCase());








    }
}
