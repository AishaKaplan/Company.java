package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Samsung";
        String model = "X";
        String color = "White";
        Double price = 750.50;
        int storage = 128;
        boolean hasCamera = true;
        color  = "black";


        String info = "Information for the: " + model + "\n\t" + model + " is a " + brand + " phone. " + "\n\tThis phone comes in " + color + " and has "
       + storage + "GB of memory.\n\t" + "Has a camera: " + hasCamera + "\n" + "All of this for $ " + price + ".";
        System.out.print(info);
    }
}
