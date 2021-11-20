package nadir_java;

import java.util.Locale;

public class ContainsLowerCase {
    public static boolean contains(String first, String second){
        if(first.toLowerCase(Locale.ROOT).contains(second.toLowerCase(Locale.ROOT))){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String one="Nadir";
        String two="nad";
        System.out.println(contains(one,two));
    }
}
