package day06_aritmethic_operators;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 4;
        double addResult = num1 + num2;
        double subResult = num1 - num2;
        double multiResult = num1 * num2;
        double divResult = num1/num2;
        double remainResult = num1 % num2;
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        System.out.println("java" + (5+4));

        char a = 'A';
        char b = 'B';
        System.out.println("" + a + b);

    }
}
