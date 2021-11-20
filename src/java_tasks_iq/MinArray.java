//package java_tasks_iq;
//
//public class MinArray {
//    public static void main(String[] args) {
//         int []arr={5,9,8,3,1};
//        System.out.println(minNumber(arr));
//    }
//    public static int minNumber(int [] arr){
//        int min = arr[0];
//        for(int each : arr){
//            if(each < min){
//                min = each;
//            }
//        }
//        return min;
//    }
//}
package java_tasks_iq;

public class MinArray {
    public static void main(String[] args) {

        int[] arr = {7,5,3,1,0,-90};
        System.out.println(minArray(arr));
    }
    public static int minArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
}