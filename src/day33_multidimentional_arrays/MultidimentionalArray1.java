package day33_multidimentional_arrays;

import java.util.Arrays;

public class MultidimentionalArray1 {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b={4,5,6};

        int [][] all={a,b};
        System.out.println(Arrays.toString(all[0]));
        System.out.println(Arrays.toString(all[1]));
        System.out.println(all.length);
        System.out.println(Arrays.deepToString(all));






    }
}
