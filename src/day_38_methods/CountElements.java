package day_38_methods;

public class CountElements {
    public static void main(String[] args) {


    int[] arr = {1, 2, 3, 4, 4, 4, 5, 5};
        System.out.println(frequencyOfElement(arr, 4));
        System.out.println(frequencyOfElement(arr, 5));
        getUniqueElements(arr);
}
public static int frequencyOfElement(int[] arr, int myElement){
    int counter=0;
    for(int each : arr){
        if(each==myElement) {
            counter++;
        }
        }
    return counter;
}
public static void getUniqueElements(int [] nums){
        for(int each : nums){
            int counter=frequencyOfElement(nums, each);
            if(counter==1);
            System.out.println(each);
        }
}




}