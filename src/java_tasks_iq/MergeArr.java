package java_tasks_iq;

import java.util.Arrays;

public class MergeArr {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 99};
        int[] arr2 = {2, 4, 6, 8, 10};
         System.out.println(Arrays.toString(mergeArr(arr1, arr2)));
    }
        public static int[] mergeArr(int[] arr1, int[] arr2){

            int[] newArr = new int[arr1.length + arr2.length];
            int position = 0;
            for (int each : arr1) {
                newArr[position] = each;
                position++;
            }
            for (int each : arr2) {
                newArr[position] = each;
                position++;
            }

            return newArr;
        }
    }
