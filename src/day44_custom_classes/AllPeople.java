package day44_custom_classes;

public class AllPeople {
    public static void main(String[] args) {
        Person personOne=new Person();
        personOne.name="James Bond";
        personOne.age=40;
        personOne.hairColor="Black";
        personOne.sex='M';
        personOne.isMarried=false;
        System.out.println("Name: " + personOne.name);
        System.out.println("Age: " + personOne.age);
        System.out.println("Hair color: " + personOne.hairColor);
        System.out.println("Sex: "+ personOne.sex);
        System.out.println("Married: " + (personOne.isMarried ? "yes" : "no"));
    }
}
