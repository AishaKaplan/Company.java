package day48_static;

public class AppleStore {
    public static void main(String[] args) {

        Iphone phone1=new Iphone("10", "Black", 1300, 128);
        System.out.println(phone1);

        System.out.println(Iphone.brand);
        System.out.println(Iphone.operatingSystem);

        }
    }

