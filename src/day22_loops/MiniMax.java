package day22_loops;
import java.util.Scanner;
public class MiniMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int counter=0;
        int max=-2147483648;
        int min=2147483647;

        while(counter <=5){
            counter++;

            System.out.println("Enter a number");;
            int number=input.nextInt();
            if(number>max){
                max=number;

            }
            if(number < min){
                min=number;
            }
        }
        System.out.println(max);
















    }
}
