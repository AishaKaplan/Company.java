package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {

    public static void main(String[] args) {
        String[] allDrinks = {"coffee", "tea", "monster", "red bull", "coke", "pepsi", "bang", "apple juice"};
        ArrayList<String> drinkList = new ArrayList<>(Arrays.asList(allDrinks));
        ArrayList<Integer> caffeineAmounts = new ArrayList<>();
        for (String eachDrink : drinkList) {
            int caffeineNum = 0;
            switch (eachDrink) {
                case "apple juice":
                    caffeineNum = 0;
                    break;
                case "tea":
                    caffeineNum = 50;
                    break;
                case "coke":
                case "pepsi":
                    caffeineNum = 70;
                case "coffee":
                    caffeineNum = 80;
                    break;
                case "monster":
                case "red bull":
                case "bang":
                    caffeineNum = 100;
                    break;
            }
            caffeineAmounts.add(caffeineNum);
        }
        //  System.out.println(drinkList);
        //    System.out.println(caffeineAmounts);
        System.out.println("==============Caffeine Table================");
        for (int i = 0; i < drinkList.size(); i++) {
            System.out.println("Drink: " + drinkList.get(i));
            System.out.println("Caffeine amount: " + caffeineAmounts.get(i));
            System.out.println();
        }
        System.out.println("==============Finished===============");
    }
}