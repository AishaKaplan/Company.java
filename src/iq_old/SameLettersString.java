package iq_old;

import java.util.Arrays;

public class SameLettersString {
    public static void main(String[] args) {

        System.out.println((sameLetters("MAGICAL", "CALMAGI")));
    }

    public static boolean sameLetters(String word1, String word2) {
        boolean result = false;
        String[] arr1 = word1.split("");
        String[] arr2 = word2.split("");

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        if (Arrays.equals(arr1, arr2)) {
            result = true;
        }
        return result;
    }
}