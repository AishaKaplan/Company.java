package iq_old;

public class RemoveDuplicateForEach {
    public static void main(String[] args) {
        System.out.println(removeDup("AABBCCDDEEF"));
    }

    public static String removeDup(String word){
        String result="";
        for(String each: word.split("")){
            if(!result.contains(each)){
                result+=each;
            }
        }
        return result;
    }
}
