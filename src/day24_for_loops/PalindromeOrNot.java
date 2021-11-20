package day24_for_loops;
import java.util.Scanner;
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        String reverse = "";

        for (int index = word.length() - 1; index >= 0; index--) {
            reverse += word.charAt(index);

//
//        System.out.println(word.charAt(index));
    }
        System.out.println(reverse);
if(word.equals(reverse)){
    System.out.println("Palindrome");

}else {
    System.out.println("Not Palindrome");
}








    }
}
