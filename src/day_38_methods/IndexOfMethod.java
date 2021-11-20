package day_38_methods;

public class IndexOfMethod {
    public static void main(String[] args) {
        String[] arr={"a", "b", "c"};
        System.out.println(firstIndex(arr, "c"));
        System.out.println(firstIndex(arr, "A"));
    }
    public static int firstIndex(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int firstIndex(String[] arr, String element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }














}