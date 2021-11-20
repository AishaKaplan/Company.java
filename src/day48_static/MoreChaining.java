package day48_static;

public class MoreChaining {
    public MoreChaining(){
        System.out.println("First");
    }

    public MoreChaining(int i){
        this();
    }

    public MoreChaining(String s){
this(5);
        System.out.println(("String one"));
    }
    public MoreChaining(double d){
        this (10);

    }
    public MoreChaining(char c){
        this("java");
    }
    public MoreChaining (boolean b){
        this(4.5f);
    }

}
