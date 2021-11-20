package generalPractice;
import java.util.Arrays;
public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 2, 6, 8, 9};
        int[] result=new int[2];
        System.out.println(Arrays.toString(numbers));
        countEvenAndOdd(numbers, result);
    }
    public static void countEvenAndOdd(int[] numbers, int[] result) {
        int countEven = 0;
        int countOdd = 0;

        for (int each : numbers) {
            if (each % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        result[0]=countEven;
        result[1]=countOdd;
        System.out.println(Arrays.toString(result));
    }
}
