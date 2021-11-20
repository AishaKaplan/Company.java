package day06_aritmethic_operators;

public class GiftCard {
    public static void main(String[] args) {
        int giftCardBalance = 200;
        int item1Price = 40;
        int item2Price = 100;
        int remainingBalance = giftCardBalance - ((item1Price) + (item2Price));
        System.out.println("The gift card started with a balance of $ " + giftCardBalance + " and after buying item 1 for $" + item1Price + " and item 2 for $ " + item2Price + "." +"\n" + "The remaining balance of the gift card is $ " + remainingBalance + ".");

    }
}
