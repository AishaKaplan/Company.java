package generalPractice;

import java.util.Arrays;

public class MultiplyMethod {
    public static void main(String[] args) {
        int [] nums={3,5,7,9};
        System.out.println(Arrays.toString(nums));
        System.out.println("The multiplication of numbers is: ");
        multiplyArray(nums);
    }

    public static void multiplyArray( int [] nums) {

        int result = 1;
        for (int each : nums){
            result *= each;
        }
        System.out.println(result);
    }
}