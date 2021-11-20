package day12_if_statements;

public class IfStatementsTasks {
    public static void main(String[] args) {
        //Write an if statement that assigns 5 to x when y is equal to 20
        int y = 20, x;
        if (y == 20) {
            x = 5;
            System.out.println(x);
        }
    //Write an if statement that sets the variable fees to 50 if the Boolean variable max is true

    boolean max = true;
    double fees;
    if (max) {

        fees = 50;
        System.out.println(fees);
    }

//Write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater and equal to 100
        int a, b= 50, c=100;
        if (b ==50 && c >= 100) {
            a =20;
            System.out.println(a);
        }
 // Write an if statement that prints Ideal Temp if the temp is between 70 and 80
    int temp = 75;
    if(70 <= temp && temp <= 80) {

        System.out.println("Ideal Temp is between 70 and 80");
    }

    }




}
