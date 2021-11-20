package java_tasks_iq;

public class MaxArr {
    public static void main(String[] args) {


        int[] arr = {-1, 0, 6, 30, 69, 4};
        int max =Integer.MIN_VALUE;
        for (int each: arr){
            if(each> max){
            max=each;
        }
    }
        System.out.println(max);
}
}