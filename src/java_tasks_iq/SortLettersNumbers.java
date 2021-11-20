package java_tasks_iq;

import java.util.Arrays;

public class SortLettersNumbers {
    //input: DC501GCCCA098911
    //Output:CD105ACCCG011899
    public static void main(String[] args) {


    String str1="DC501GCCCA098911";
    String str2= "";

    for(int i=0; i<str1.length(); i++){
        str2=str2+str1.charAt(i);

        if(Character.isAlphabetic(str1.charAt(i)) && i<str1.length()-1){
            if(Character.isDigit(str1.charAt(i+1))){
            str2=str2+",";
        }
    }
    if(Character.isDigit(str1.charAt(i)) && i<str1.length()-1){
        if(Character.isAlphabetic(str1.charAt(i+1))){
            str2=str2+",";
        }
    }
    }
    String [] arr=str2.split(",");
    str1="";

    for(String each: arr){
        char[] chars= each.toCharArray();
        Arrays.sort(chars);

        for(char eachChar: chars){
            str1=str1+eachChar;
        }
    }
        System.out.println(str1);
}
}