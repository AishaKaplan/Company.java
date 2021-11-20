package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer [] a = {1, 2, 3};
        Arrays.asList(a); //this allows us to convert from the array to the arraylist
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(a));
        System.out.println(list);

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(4,5,8,9,5));
        System.out.println(list2.isEmpty());
        System.out.println(list2);




















    }
}