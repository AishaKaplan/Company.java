package day09_scanner_logical;
import java.util.Scanner;
public class PlaceOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String productName = input.nextLine();

        System.out.println("Enter product price");
        double price = input.nextDouble();

        System.out.println("Enter quantity");
        int quantity= input.nextInt();

        System.out.println("Enter your full name");
        String firstName= input.next();
        String lastName= input.next();
        String fullName= firstName + " " + lastName;

        System.out.println(fullName + "," + " Your order for " + quantity + " " + productName + " has been placed. \nYour total is $ " + price*quantity
        );



    }
}
