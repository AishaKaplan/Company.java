package day45_constructors;

public class UsingApp {
    public static void main(String[] args) {
        App firstApp=new App();
        firstApp.name="Google";
        firstApp.version=4.0;
        firstApp.isFree=true;

        firstApp.update();
        System.out.println(firstApp);
        System.out.println("App information");
        System.out.println("Name: " + firstApp.name);
        System.out.println("Version: " + firstApp.version);
        System.out.println(firstApp.isFree ? "App is free" : "App cost some money");
    }
}
