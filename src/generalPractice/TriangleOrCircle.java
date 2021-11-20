package generalPractice;
import java.util.Scanner;
public class TriangleOrCircle {
public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        triOrCirc(num1, num2, num3);


        }


    public static void triOrCirc(int num1, int num2, int num3) {
        int total = 0;
        total = num1 + num2 + num3;
        if (total == 180) {
            System.out.println("This is a triangle");
        } else if (total == 360) {
            System.out.println("This is a circle");
        } else {
        }
        System.out.println("Neither triangle nor circle");
    }
}
