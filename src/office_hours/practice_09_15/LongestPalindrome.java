package office_hours.practice_09_15;
/*
[IQ] Longest Palindrome

        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome
        */

public class LongestPalindrome {
    public static void main(String[] args) {
        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"} ;
        String longest="";

for(String eachWord : words){
    boolean isPalindrome=true;
    for(int i=0; i<eachWord.length()/2; i++){
        if(eachWord.charAt(i)!=eachWord.charAt(eachWord.length()-1-i)){
            isPalindrome=false;
            break;
        }
    } if(isPalindrome && eachWord.length()>longest.length()){
        longest=eachWord;
    }
}
        System.out.println("Longest: " + longest);


    }
}
