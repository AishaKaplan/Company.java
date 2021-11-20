package day34_methods;
//this method prints hello world
public class MyFirstMethod {
    public static void helloWorld(){
        System.out.println("Hello World");
    }

    public static void helloWorld50Times(){
        for (int i=0; i<50; i++){
            System.out.println("Hello World");
        }
    }


    //the main is used to call our method
    public static void main(String[] args) {
        helloWorld();
        helloWorld();

        helloWorld50Times();
        System.out.println();

        helloWorld50Times();

        for(int i=0; i<50; i++){
            helloWorld();
        }
    }







}
