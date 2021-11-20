package nadir_java;

import java.util.Scanner;

public class ContainsScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println(containsWords(str1, str2));
    }
        public static boolean containsWords (String str1, String str2){
        boolean result=false;
//        if(str1.contains(str2)){
//            result=true;
//        }
//        return result;

        return str1.contains(str2) ? true : false;
    }
}
