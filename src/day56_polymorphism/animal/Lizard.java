package day56_polymorphism.animal;

public class Lizard extends Reptile{
    @Override
    public void eat() {
        System.out.println("Lizard is eating--FROM CHILD");
    }
}
class Wild{
    public static void main(String[] args) {
        Lizard obj1=new Lizard();
        Reptile obj2=new Lizard();
        Animal obj3=new Lizard();
        obj1.eat();
        obj2.eat();
        obj3.eat();

    }
}
