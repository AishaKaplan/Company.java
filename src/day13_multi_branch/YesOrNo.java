package day13_multi_branch;
import java.util.Scanner;
public class YesOrNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name");
        String firstName = input.next();
        System.out.println("do you like soccer");
        String likeSoccer = input.next();
        if (likeSoccer.equals("yes")) {


        System.out.println("who is your favorite team");
        String team = input.next();
        System.out.println("Oh I like " + team + " too");
    } else if (likeSoccer.equals("no")) {
            System.out.println("That's okay");
        } else {
            System.out.println("You did not answer the question");
        }

















    }
}