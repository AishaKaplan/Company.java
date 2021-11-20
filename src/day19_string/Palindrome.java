package day19_string;

public class Palindrome {
    public static void main(String[] args) {

        String word="mom";
        String reverse= ""+word.charAt(2) + word.charAt(1)+word.charAt(0);
        System.out.println(reverse);
        if (word.equals(reverse)) {
            System.out.println("palindrome");

        }else {
            System.out.println("not palindrome");
        }





















    }


}


