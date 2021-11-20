package java_tasks_iq;

public class Swap2 {
    public static void main(String[] args) {
        int c = 20;
        int d = 10;

        c = c - d; // c =10
        d = d + c; // d =20
        c = d - c; // c =10

        System.out.println(d);
        System.out.println(c);
    }
}


