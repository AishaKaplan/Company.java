package day_38_methods;

public class ArrayAsParameter {
    public static void main(String[] args) {

        printArray(1,2,3,4);
        System.out.println();
        printArray("james", "bond");
    }
    public static void printArray(int ... arr){
        for(int each : arr){
            System.out.print(each + " ");
        }
    }

    public static void printArray(String ... arr) {
        for(String each : arr){
            System.out.print(each+" ");
        }
    }
}
