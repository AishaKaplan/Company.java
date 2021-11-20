package day_40_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {


        ArrayList<String> groupOne = new ArrayList<>();
        System.out.println(groupOne);
        System.out.println(groupOne.size());
        groupOne.add("Vindar");
        groupOne.add("James Bond");
        groupOne.add("Tach");
        groupOne.add("Topcu");
        System.out.println(groupOne);
        System.out.println("First element, first char: " +groupOne.get(0).charAt(0));


        ArrayList<String> groupTwo=new ArrayList<>(20);
        System.out.println(groupTwo.size());

        ArrayList<String> groupThree=new ArrayList<>();
        groupThree.add("Nisso");
        System.out.println(groupThree);
        groupThree.add(0, "Omer");
        groupThree.add("Kamila");
        groupThree.add(0, "Bogdan");
        groupThree.add(1, "James");

        System.out.println(groupThree);







    }
}