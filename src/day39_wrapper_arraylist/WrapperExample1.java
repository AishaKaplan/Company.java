package day39_wrapper_arraylist;

public class WrapperExample1 {
    public static void main(String[] args) {
        int a=5;

        Integer i1=10;
        Integer i2=100;
        System.out.println(i1);
        byte b= 4;
        Byte b2=new Byte((byte)5);
        Byte b3=(byte)500;

        System.out.println(b3);// did not work. not in range
        short s=100;
        Short s2=new Short((short)200);
        Short s3=300;
        System.out.println(s);

        long l=1000;
        Long l2=new Long(2000L);
        Long l3=3000L;














    }
}
