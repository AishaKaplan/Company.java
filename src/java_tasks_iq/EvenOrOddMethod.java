package java_tasks_iq;

public class EvenOrOddMethod {
    public static void main(String[] args) {

        evenOrOdd(-108);
    }

    public static void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}

