package day33_multidimentional_arrays;

import java.util.Arrays;

public class UrlSplit {
    public static void main(String[] args) {
        String url="https://learn.cybertekschool.com/courses/130";

        String [] parts =url.split("/");
        System.out.println(Arrays.toString(parts));
        Arrays.sort(parts);
        System.out.println(Arrays.toString(parts));









    }
}
