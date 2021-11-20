package day08_relational_logical_operators;

public class GiftCard {
    public static void main(String[] args) {
       double balance = 200;
        System.out.println("buy item 1 and it costs $40");
        balance -=40;
        System.out.println("Gift card balance : " + balance);
        System.out.println( "buy item 2 and it costs $100");
        balance -=100;
        System.out.println("Gift card balance: " + balance);

    }
}
