package java_tasks_iq;

public class ConcatTwoArrInt {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int [] arr2={6,7,8,9,10};
        System.out.println(concatTwoArrInt(arr1, arr2));
    }
     public static String concatTwoArrInt(int[] arr1, int [] arr2){
        String result="";

        for (int each: arr1){
            result+=each+"";
        }
        for(int each: arr2){
            result+=each+"";
        }
        return result.substring(0, result.length());
     }
}
















