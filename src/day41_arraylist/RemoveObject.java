package day41_arraylist;

import java.util.ArrayList;

public class RemoveObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);

        nums.remove(0);
        //approach 1 by making the object first
        Integer a=700;
        nums.remove(a);
        // approach 2 by making the object in the remove method
        nums.remove(900);
        System.out.println(nums);

    }
}
