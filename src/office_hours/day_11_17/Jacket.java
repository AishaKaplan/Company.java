package office_hours.day_11_17;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Putting on jacket");
        putOnHood();
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on hood");
    }
}
