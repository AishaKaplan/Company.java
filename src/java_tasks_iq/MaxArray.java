//package java_tasks_iq;
//
//
//public class MaxArray {
//    public static void main(String[] args) {
//
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        System.out.println(maxNumber(arr));
//    }
//    public static int maxNumber(int[] arr) {
//        int max = arr[0];
//        for (int each : arr) {
//            if (each > max) {
//                max = each;
//            }
//        }
//        return max;
//    }
//}
package java_tasks_iq;

public class MaxArray {
    public static void main(String[] args) {

        int[] arr = {7,56,89,0,-1};
        System.out.println(maxArray(arr));
    }
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}