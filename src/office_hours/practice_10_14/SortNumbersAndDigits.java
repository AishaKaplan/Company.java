package office_hours.practice_10_14;

import java.util.Arrays;

public class SortNumbersAndDigits {
     /*
      Input: "DC501GCCCA098911"
      OutPut: "CD015ACCCG011899"

    current char letter?
    is next one (i+1) letter or not a letter? to find the substring.

    actions: sort this substring;
    assign sorted substring to final string;
    reset the current substring to be empty;

    current char digit? is next one(i+1) is digit too? to find the substring
    when we are on the last letter length-1
    force the action to happen, assuming the last character is part of the substring
     */
    public static void main(String[] args) {
        System.out.println(sortEachPart("DC501GCCCA098911"));
    }
    public static String sortEachPart(String s){

        String sub = "";  // DC
        String sortedStr = "";

        for(int i = 0; i < s.length(); i++){

            char current = s.charAt(i);
            sub += current;
            boolean sort = false;

            if(i != s.length() -1) {
                char next = s.charAt(i + 1);
                sort =
                        Character.isLetter(current) && !Character.isLetter(next) ||
                                Character.isDigit(current) && !Character.isDigit(next);

            } else {
                sort = true;
            }

            if(sort){
                String [] toSort = sub.split("");
                Arrays.sort(toSort);
                // sortedStr += Arrays.toString(toSort).replace("[", "").replace("]", "").replace(", ", "");
                sortedStr += String.join("", toSort);
                sub = "";
            }
        }

        return sortedStr;
    }
}

 /*
                boolean sort = i == s.length() - 1 ||
                         Character.isLetter(current) && !Character.isLetter(s.charAt(i + 1)) ||
                         Character.isDigit(current) && !Character.isDigit(s.charAt(i + 1));

  */