package iq_old;

public class FrequencyOfLetters {
    public static void main(String[] args) {
        System.out.print(frequencyOfLetters("AAABBCCD", 'A'));
        System.out.print(frequencyOfLetters("AAABBCCD", 'B'));
        System.out.print(frequencyOfLetters("AAABBCCD", 'C'));
        System.out.print(frequencyOfLetters("AAABBCCD", 'D'));
    }

public static int frequencyOfLetters(String word, char letter){
    int counter=0;
    for(int i=0; i<word.length(); i++) {
        if (word.charAt(i) == letter)
            counter++;
        }
        System.out.print(letter);
        return counter;
    }
}
