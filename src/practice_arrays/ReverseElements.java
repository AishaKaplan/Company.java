package practice_arrays;

import java.util.Arrays;

public class ReverseElements {
    public static void main(String[] args) {
int [] numbers={1,2,3,4,5};
for (int i=0; i< numbers.length; i++){

} System.out.println(Arrays.toString(numbers));
for(int i= numbers.length-1; i>=0; i--) {
    System.out.print(numbers[i]+" ");
}
    }
}
