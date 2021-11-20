package day02_print_statement;

public class Problems {
    public static void main (String [] args) {
        int A = 50;
        int B = --A + A++ + A-- + A++;
        System.out.println(A);
        System.out.println(B);
    }
}
