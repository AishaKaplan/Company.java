package day22_loops;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        boolean positiveNumber=true;
        while(positiveNumber){
            System.out.println("enter a number");
            int number=input.nextInt();
            sum+=number;
            if(number<0){
                positiveNumber=false;
            }
        }
        System.out.println("Sum: 0" + sum);




    }
}
