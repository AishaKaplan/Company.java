package day_40_arraylist;

import java.util.ArrayList;

public class RemoveMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(list.size() - 1);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println();
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(50);
        nums.add(70);
        nums.add(80);
        System.out.println(nums);
       int firstRemoved= nums.remove(1);
        System.out.println("First removed element : "+ firstRemoved);
        System.out.println(nums);
        nums.add(firstRemoved);
        System.out.println(nums);



    }
}