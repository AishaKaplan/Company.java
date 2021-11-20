package day46_constructors;

public class ThisKeyword {

    int a=100;
    public ThisKeyword(int a){
        System.out.println(a); //prints 70
        a= 400;
        System.out.println(a); //prints 400
    }

    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(70);
        System.out.println(obj.a); //prints 100

    }



}
