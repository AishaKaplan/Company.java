package day48_static;

public class Iphone {
    String model;
    String color;
    double price;
    int storage;

    static String brand;
    static String operatingSystem;

    public Iphone(String model, String color, double price, int storage){
        this.model=model;
        this.color=color;
        this.price=price;
        this.storage=storage;

    }
    static {
        brand="Apple";
        operatingSystem="IOS";
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
