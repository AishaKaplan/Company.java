package practice_arrays;

import java.util.Arrays;

public class StoreInventory {
    public static void main(String[] args) {
String [] items={"Shoes", "Jackets", "Gloves", "Airpods", "Ipad", "Backpack"};
double [] prices={89.99, 150.0, 9.99, 250.0, 439.5, 39.99};
int [] itemId= {12345, 12346, 12347, 12348, 12349, 12350};
double mostExpensive=0;
String message="";
        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Item Id: " + Arrays.toString(itemId));
        System.out.println();
        for (int i=0; i< prices.length; i++){
            if(prices[i] > mostExpensive){
                mostExpensive=prices[i];
                message= "The information of the most expensive item:\n" + "Name: " + items[i]+"\n"+ "Price: $ "
                        + prices[i] + "\n"+ "ID: " + itemId[i];
            }
        }
        System.out.println(message);













    }
}
