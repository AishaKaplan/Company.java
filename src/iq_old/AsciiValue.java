package iq_old;

public class AsciiValue {
    public static void main(String[] args) {
      String word="java";
      int sum=0;
      for(int i=0; i< word.length(); i++) {

          int asciiValue = word.charAt(i);

          System.out.println(word.charAt(i) + ": " + asciiValue);
      }


    }
}
