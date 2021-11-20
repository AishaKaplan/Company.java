package day_04_variables;

public class Fruits {
    public static void main(String[] args) {
        int apples = 10;
        int grapes = 15;
        int bananas = 20;
        System.out.println("Number of apples: " + apples);
        System.out.println("Number of grapes: " +  grapes);
        int totalNumberofFruits = apples + grapes + bananas;
        System.out.println("Total number of fruits" + totalNumberofFruits);
        apples = 50;
        totalNumberofFruits = apples + grapes + bananas; // new assigning after new numbers of apples

        System.out.println("Total number of fruits: " + totalNumberofFruits);



    }
}
