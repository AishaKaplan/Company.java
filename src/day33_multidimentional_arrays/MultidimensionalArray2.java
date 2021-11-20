package day33_multidimentional_arrays;

import java.util.Arrays;

public class MultidimensionalArray2 {
    public static void main(String[] args) {
        int [][] arr= { {10, 20, 30,40}, {100, 200, 300, 400}, {1000,2000}};
        System.out.println(arr.length); //length of whole array(3 elements)
        System.out.println(arr[0].length); //index of 0
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(arr[2].length);
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.deepToString(arr));
        System.out.println("First array: " + arr[0][0]);
        System.out.println("Second array: " + arr[1][0]);
        System.out.println("Third array: " + arr[2][0]);



    }
}
