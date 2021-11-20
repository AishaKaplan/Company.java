package day47_constructors;

public class Item {
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Item(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculatePrice();

    }
 public void calculatePrice(){
        totalPrice=quantity*unitPrice;
 }

 public String toString() {
     return "ITEM: " + name + " | Quantity: " + quantity + " | Total Price: $" + totalPrice;
 }



    }


















