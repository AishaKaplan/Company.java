package java_tasks_iq;

public class Swap2AB {

    public static void main(String[] args) {
        swap(10,5);
    }
    public static void swap(int a, int b){
        a=a+b; //10+5=15 a=15
        b=a-b; // 15-5=10 b=10
        a=a-b;//15-10=5 a=5
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}

/*
  a = b * a;  // 10 * 5 = 50
        b = a / b;  // 50 / 5 = 10
        a = a / b;  // 50 / 10 = 5
 */