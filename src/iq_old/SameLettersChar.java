package iq_old;

import java.util.Arrays;

public class SameLettersChar {

    public static void main(String[] args) {
    System.out.println(sameLetters("abc", "bca"));

    }

    public static boolean sameLetters (String str1, String str2){
        char [] arr1=str1.toCharArray();
        char [] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        return Arrays.equals(arr1, arr2);

            }
        }



