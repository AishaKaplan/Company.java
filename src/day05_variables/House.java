package day05_variables;

public class House {
    public static void main(String[] args) {
        String houseType = "Town house";
        byte numberOfBedrooms = 4;
        byte numberOfBathrooms = 3;
        byte numberOfKitchens = 1;
        boolean isBasement = true;
        boolean isAttic = false;
        boolean isPool = false;
        boolean isForSale = false;
        double price = 2300;
        String address = "17 Jaime Court Morris Plains";
        int zipCode = 79980;
        boolean isParkNearBy = true;
        byte ratingOfSchoolDistrict = 5;

        System.out.println("\t\t\t\tInformation about the house");
        System.out.println("This house is a " + houseType);
        System.out.println("The number of bedrooms are " + numberOfBedrooms);
        System.out.println("The number of bathrooms are " + numberOfBathrooms);
        System.out.println("The number of kitchens is " + numberOfKitchens);
        System.out.println("The house has a basement: " + isBasement);
        System.out.println("The house has attic : " + isAttic);
        System.out.println("The house has a pool : " + isPool);
        System.out.println("The house is for sale : " + isForSale);
        System.out.println("This house's rent price is : " + '$' + price);
        System.out.println("The address is : " + address);
        System.out.println("The zipcode is : " + zipCode);
        System.out.println("This house has park nearby : " + isParkNearBy);
        System.out.println("The rating of school district 1 out of 5 : " + ratingOfSchoolDistrict);







    }
}
