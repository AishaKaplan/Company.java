package office_hours.day11_10;

public final class Iphone extends Phone implements AppleApp{
    public Iphone(String model, double price, int size){
        super("Iphone", model, price, size);
    }
    @Override
    public void faceTime() {
        System.out.println("Iphone using facetime");
    }

    @Override
    public boolean download() {
        System.out.println("Downloading from: " +APP_STORE_NAME);
        return true;
    }

    @Override
    public void calling() {
        System.out.println("Iphone is calling");
    }

    @Override
    public void texting() {
        System.out.println("Texting on Imessage");
    }
}
