package day_37_methods;

public class CountLetters {
    public static void main(String[] args) {
        System.out.println(frequencyOfLetter("apple", 'p'));
    }


    public static int frequencyOfLetter(String word, char letter) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                counter++;

            }
        }
        return counter;

    }
}