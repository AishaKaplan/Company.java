package practice_arrays;

import my_utilities.ArraysUtil;

import java.util.Arrays;

public class AddElementsToArr {
    public static void main(String[] args) {
        int[] original={1,3,5,7};
        int[] elementsToAdd={2,4,6,8};
        System.out.println(Arrays.toString(ArraysUtil.addElement(original, elementsToAdd)));
    }
    }

