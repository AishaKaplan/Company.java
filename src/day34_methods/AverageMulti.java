package day34_methods;

import java.util.Arrays;

public class AverageMulti {
    public static void main(String[] args) {
        int [] [] nums={
                {3,4,5,6},
                 {5,2,6},
                {10,40,20},
        };

double total=0;
double totalNumbers=0;
        for(int [] eachArray : nums) {
double sum=0; //putting the variable here means it will be set back to 0 every time my outer loop runs.
            for (int eachNum : eachArray) {
            sum+=eachNum;

            }
            System.out.println("The average of " + Arrays.toString(eachArray) + " is: " + sum/eachArray.length);
            total+=sum;
            totalNumbers+=eachArray.length;

        }
        System.out.println("Total average: " +(total/totalNumbers));






    }
}
