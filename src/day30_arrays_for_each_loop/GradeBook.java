package day30_arrays_for_each_loop;

import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        String[] studentNames = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int[] studentGrades = {80, 54, 100, 66, 94};
        char[] gradeLetter = {'B', 'D', 'A', 'C', 'A'};
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.println(" " + studentNames[i] + " | " + studentGrades[i] + " | " + gradeLetter[i]);
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("How many students you want to enter?");
        String[] student = new String[scan.nextInt()];
        System.out.println("How many scores you want to enter?");
        int[] scores = new int[scan.nextInt()];
        char[] letterGrades = new char[student.length];
        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter your " + (i + 1) + " student and the score");
            student[i] = scan.next();
            scores[i] = scan.nextInt();
            if (scores[i] >= 85) {
                letterGrades[i] = 'A';
            } else if (scores[i] >= 75) {
                letterGrades[i] = 'B';
            } else if (scores[i] >= 65) {
                letterGrades[i] = 'C';
            }

        }
    }
}

