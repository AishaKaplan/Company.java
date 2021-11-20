package iq_old;

public class CountCharacters {
    public static void main(String[] args) {


        String s = "This has multiple words";

        int count = 0;

        for (int i = 0; i < s.length() ; i++  ){

            s = s.replace(" ","");

            count++;
        }
        System.out.println( "number of " +count);











    }
}
