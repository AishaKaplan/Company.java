package day45_constructors;

public class Pen {
    String color;
    public Pen(String str){
        System.out.println("Made Pen object " + str);
        color =str;
    }

    public static void main(String[] args) {

        Pen pen=new Pen("red");
        System.out.println(pen.color);
        new Pen("blue");
        new Pen("yellow");

    }

}
