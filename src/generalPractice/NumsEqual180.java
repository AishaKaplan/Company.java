package generalPractice;

public class NumsEqual180 {
    public static void main(String[] args) {
        triOrCircle(50, 50, 80);
        triOrCircle(200, 100, 60);
        triOrCircle(200, 500, 100);


    }


    public static void triOrCircle(int a, int b, int c) {
        if ( a+b+c==180) {
            System.out.println("This is a triangle");
        } else if(a+b+c==360){
            System.out.println("This is a circle");
        } else{
            System.out.println("Not triangle or circle");
        }


    }

}
