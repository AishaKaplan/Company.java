package day39_wrapper_arraylist;

import java.util.ArrayList;

public class AddToArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(50);
        System.out.println(numbers);
        numbers.add(-100);
        numbers.add(200);

        System.out.println(numbers.add(400));
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println("First element " + numbers.get(0));
        System.out.println("Last element " + numbers.get(numbers.size()-1));



    }
}
