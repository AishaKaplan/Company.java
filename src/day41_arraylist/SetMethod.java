package day41_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);

        nums.set(0, 1000);
        nums.set(3, -2000);
        System.out.println(nums.set(1,90));
        System.out.println(nums);
    }
}
