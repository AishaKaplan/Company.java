package day05_variables;

import org.w3c.dom.ls.LSOutput;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "Nissan Rogue";
        String driverName = "Aisha";
        String licenceNumber = "DL85769584";
        short speed = 150;
        boolean isAutomatic = true;
        char licenceClass = 'B';

        String carDriverInfo = "This car model is: " + carModel + "\n" + "Driver name is: " + driverName + "\n" + "Licence number is: " + licenceNumber + "\n" + "It has" + "\t" + speed + "\tmph"
+ "\nThis car is automatic: " + isAutomatic + "\nLicence class is: " + licenceClass;
        System.out.println(carDriverInfo);
}
}