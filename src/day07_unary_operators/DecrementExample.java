package day07_unary_operators;

public class DecrementExample {
    public static void main(String[] args) {
        int n = 20;
        int t = n;
        System.out.println("t:" + t);
        int j = --n;
        System.out.println("j : " + j);
        System.out.println("n : " + n);
        System.out.println( "n : " + --n);
        int u = n--;
        System.out.println(u);
        System.out.println(n--);

    }
}
