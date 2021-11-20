package office_hours.String_Array_09_16;

import java.util.Arrays;

public class MergedArray2 {
    public static void main(String[] args) {
        int[] arrOne = {1, 2, 3, 4};
        int[] arrTwo = {10, 20, 30};
        int mergedLength = arrOne.length + arrTwo.length;
        int[] merge = new int[mergedLength];
        int j = 0;
        for (int i = 0; i < mergedLength; i++) {
            if (i < arrOne.length) {
                merge[i] = arrOne[i];
            } else {
                merge[i] = arrTwo[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(merge));
    }
}