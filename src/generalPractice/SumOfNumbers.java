package generalPractice;

import java.util.Arrays;

public class SumOfNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 7, 40, 55};
        System.out.println(Arrays.toString(numbers));
        System.out.println("The sum of the numbers is: ");
        sumNumbers(numbers);
        }


      public static void sumNumbers(int [] numbers){
        int result=0;
        for(int number : numbers){
            result+=number;
        }
          System.out.println(result);
      }


    }

