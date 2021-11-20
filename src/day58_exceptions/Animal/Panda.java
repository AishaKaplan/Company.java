package day58_exceptions.Animal;

public class Panda extends Animal{
    @Override
    public Panda getAnimal() {
        return new Panda();
    }
}
