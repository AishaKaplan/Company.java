package iq_old;

public class FindUniqueForEach {

    public static void main(String[] args) {
        System.out.println(getUnique("AAABBBCCCDEFG"));
    }

    public static String getUnique(String word){
        String result="";
        String[] characters=word.split("");
        for(String character : characters){
            int counter=0;
            for(String each: characters){
                if(each.equals(character)){
                    counter++;
                }
            } if(counter==1){
                result+=character;
            }
        }
        return result;
    }
}
/*
Place characters in a string array.
we will have number of occurances.
then find only one occurance.


 */