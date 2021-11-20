package day25_loops;

public class BiggestString {
    public static void main(String[] args) {
        String str="aaabbbcccccdddee";
        String other="";
        String longestSub="";
        for(int i=0; i<str.length()-1; i++) {
            other += str.charAt(i);
        if(str.charAt(i)!=str.charAt(i+1)){ //action is done here, when the char is not same as the char next to it
            if(other.length() > longestSub.length()){
                longestSub=other;
            }
            other="";
        }

        }

        System.out.println(longestSub);







    }
}
