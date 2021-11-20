package day_36_methods;

public class VoidVersusReturn {
    public static void main(String[] args) {
        sayHello();
      //  String s=sayHello();  you cannot assign
        // you cannot print sout(sayHello());
        sayBye();
        String bye=sayBye();
        System.out.println(bye);
        System.out.println(sayBye());
    }
    public static void sayHello(){
        //void method with no parameters
        System.out.println("Hello World");
    }
    public static String sayBye(){
        return "Bye World";
    }








}


