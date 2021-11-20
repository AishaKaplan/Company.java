package day_43_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUnique {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(3,4,1,5,1,1, 3,6,10));
        System.out.println(getUniqueElements(list));
    }










    public static ArrayList<Integer> getUniqueElements(ArrayList<Integer> list){
        ArrayList<Integer> unique=new ArrayList<>();
        for(int each : list){
         int count= Collections.frequency(list, each);
         if (count==1){
             unique.add(each);
         }

        }
        return unique;
    }
}
