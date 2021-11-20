package day34_methods;

public class Car {

    /*
    Algorithm to start a car

        Unlock and open the door
        Get into the car and close door
        Put seatbelt on
        Check mirrors
        Start car
        Put into drive and press gas pedal
     */
    public static void main(String [] args){
        unlockAndOpenDoor();
        getIntoCarCloseDoor();
        putSeatbeltOn();
        checkMirrors();
        startCar();
        drive();
    }

public static void unlockAndOpenDoor(){
    System.out.println("Unlock and open the door");
}
public static void getIntoCarCloseDoor(){
    System.out.println("Get into the car and close door");
}
public static void putSeatbeltOn(){
    System.out.println("Put seatbelt on");
}
public static void checkMirrors(){
    System.out.println("Check the left mirror");
    System.out.println("Checking the right mirror");
    System.out.println("Checking the rear view mirror");
}
public static void startCar(){
    System.out.println("Putting key in and turning");
    }
    public static void drive(){
        System.out.println("Put the car into drive and press the gas pedal");
    }
    public static void driveInHurry(){
        unlockAndOpenDoor();
        getIntoCarCloseDoor();
        startCar();
        drive();





    }








}
