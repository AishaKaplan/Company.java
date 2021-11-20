package day22_loops;

public class Factorial {
    public static void main(String[] args) {
        int number=5;
        int total=1;
        while(number>1) {
            System.out.println(total+" * "+ number + " ");
            total *= number;
            number--;
        }

        System.out.println(total);

    }
}
