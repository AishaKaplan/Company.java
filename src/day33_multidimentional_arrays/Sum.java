package day33_multidimentional_arrays;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int [] arr={3,5,7,9};
        int [] newArr=Arrays.copyOf(arr, arr.length+1);
    int sum=0;
    for(int num : arr){
        sum+=num;
    }
    newArr[newArr.length-1]=sum;

        System.out.println(Arrays.toString(newArr));






    }
}
