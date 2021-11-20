package day_43_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        ArrayList<String> first=new ArrayList<>();
        first.add("water");
        first.add("items");
        first.add("run");

        ArrayList<String> second=new ArrayList<>(first);
        second.add("pen");
        System.out.println(first);
        System.out.println(second);

        ArrayList<String> third=new ArrayList<>(Arrays.asList("one", "two"));
        System.out.println(third);
    }
}
