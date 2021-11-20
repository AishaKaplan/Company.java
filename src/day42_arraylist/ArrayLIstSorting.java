package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLIstSorting {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(4,50,20,502,150,-40));
        Collections.sort(nums);
        System.out.println(nums);
    }
}
