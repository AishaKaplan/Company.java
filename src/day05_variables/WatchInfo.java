package day05_variables;

public class WatchInfo {
    public static void main(String[] args) {
        String brand = "Sonia";
        String color = "Black";
        Double price = 150.70;
        boolean waterResistant = true;
        boolean isSmart = true;

        System.out.println("Information about new watch " + "'" + brand + "'" );
        System.out.println("The watch is "+color);
        System.out.println("It costs $" + price);
        System.out.println("This watch is water resistant: " + waterResistant);
        System.out.println("It is also smart: "  + isSmart);
        String watchInfo = ("\t\t\t\tInformation about new watch" + "\t" + brand + "\n The watch is" + "\t" + color + "\nIt costs $" + price + "\nThis watch is water resistant: "+ waterResistant + "\nIt is also smart: " + isSmart);
        System.out.println(watchInfo);






    }
}
