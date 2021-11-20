package java_tasks_iq;

import java.util.Arrays;

public class DescSortWo {
    public static void main(String[] args) {
        int arr[]={5,90, 2, 3, 0, -70, 700};
        System.out.println(descendingOrder(arr));
    }
        public static String descendingOrder(int[] arr){
            for (int i = 0; i< arr.length; i++){
                for (int j = 0; j < arr.length; j++) {
                 if(arr[i]>arr[j]){
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;

                 }
            }
        }
            return Arrays.toString(arr);
    }
}
