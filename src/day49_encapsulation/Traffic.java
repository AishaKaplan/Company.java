package day49_encapsulation;

public class Traffic {
    public static void main(String[] args) {

    TrafficLight light=new TrafficLight("red");
 //   System.out.println(light.color); cannot access color directly anymore.
 //   light.color="brown";
        System.out.println(light.getColor());
        light.setColor("green");
        System.out.println(light.getColor());

        light.setColor("brown");
        System.out.println(light.getColor());
}
}