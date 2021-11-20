package day33_multidimentional_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums={1,55,100,200};
        System.out.println(Arrays.binarySearch(nums, 55));
        System.out.println(Arrays.binarySearch(nums,200));
        System.out.println();
        int[] not={49, 30, 2, 1, 60, 23};
        Arrays.sort(not);
        System.out.println(Arrays.binarySearch(not, 30));
        System.out.println();
        int[] third={-5, -3, -2,10, 20};
        int indexOfNeg=Arrays.binarySearch(third, -5);
        System.out.println(indexOfNeg);












    }
}
