package java_tasks_iq;

import java.util.Arrays;

public class ShiftZerosToEnd {
    public static int[] shiftZerosToEnd(int [] numbers){
        int [] newArr=new int[numbers.length];
        int counter=0;

        for(int each: numbers){
            if(each!=0){
                newArr[counter++]=each;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int [] arr={0,6,9,0,9,6,0,3,-1};
        System.out.println(Arrays.toString(shiftZerosToEnd(arr)));
    }

}
