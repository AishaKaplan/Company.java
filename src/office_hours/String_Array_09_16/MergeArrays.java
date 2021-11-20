package office_hours.String_Array_09_16;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int [] arrOne={1,2,3,4};
        int[] arrTwo= {10, 20, 30};
        int mergedLength=arrOne.length+ arrTwo.length;
        int [] merged= Arrays.copyOf(arrOne, mergedLength);
        System.out.println(Arrays.toString(merged));
        int index=arrOne.length;
        for(int num : arrTwo){
            merged[index++]=num;
        }
        System.out.println(Arrays.toString(merged));
    }
}
