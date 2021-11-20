package day26;

import java.util.Scanner;

public class MoodRing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the mood ring color?");
        String color = input.next();

        String mood = "";
        double budget = 0.0;

        switch (color) {
            case "pink":
                mood = "happy";
                budget = 200.0;
                break;

            case "blue":
                mood = "relaxed";
                budget = 150.0;
                break;

        case "orange":
        mood = "nervous";
        budget = 50.0;
        break;

        case "red":
        mood = "angry";
        budget = 0.0;
        break;
    }
        System.out.println("Your color was: " + color);
        System.out.println("Which means you are " +mood);
        System.out.println("You mode means you can spend $" + budget);






    }
}
