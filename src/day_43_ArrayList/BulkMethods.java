package day_43_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.addAll(Arrays.asList(3,5,1,2,5));
        ArrayList<Integer> other=new ArrayList(Arrays.asList(10,20));
     //   nums.add(other.get(0));
      //  nums.add(other.get(1));
     //   nums.addAll(other);
        nums.addAll(0, other);
        nums.removeAll(Arrays.asList(5,10));
        System.out.println(nums);
    }
}
