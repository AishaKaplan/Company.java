package day12_if_statements;
import java.util.Scanner;
public class GradeAfterRetake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score of the test: ");
        double score = input.nextDouble();
        System.out.println("How many times did you attempt to retake this test?");
        int retake = input.nextInt();
        if (retake == 1) {
            System.out.println("Your grade after retake is " + (score - (score*10/100)));
        }
        else if (retake == 2) {
            System.out.println("Your grade after retake is " + (score - (score*20/100)));
        }
        else if (retake == 3) {
        } System.out.println("Your grade after retake is " + (score - (score*30/100)));

    }
}