package office_hours.practice10_21;

public class Store {
    public static void main(String[] args) {
        WaterBottle bottle=new WaterBottle("ice mountain", 16);
        System.out.println(bottle.getBrand());
        System.out.println(bottle.getOunces());
        bottle.setOunces(-20); //does not change
        System.out.println(bottle.getOunces());
        bottle.setBrand(null); //does not change
        System.out.println(bottle.getBrand());
    }
}
