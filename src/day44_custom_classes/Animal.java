package day44_custom_classes;

public class Animal {
    String species;
    String size;
    int numberOfLegs;
    boolean canFly;
    boolean isMammal;
    double weight;
    double lifeSpan;

    public void eat (){
        System.out.println(species+ " is eating");
    }
    public void sleeping (){
        System.out.println("This small " + size+ " animal is sleeping");
    }
}
