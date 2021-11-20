package day09_scanner_logical;

public class ShortCircuit {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && true);
        //true basta gelirse onu baz aliyor && statementta. Eger basta false varsa ikinci tarafa hic bakmiyor bile, (it does not execute the right side) cunku zaten bastan yanlis.
        //ama eger single & kullanirsak sag tarafi da execute yapiyor.
        System.out.println(true || false);
        System.out.println(true || 5/0 ==0); // Burda da || statementta basta tru oldugu icin sag tarafa bakma geregi duymuyor, even it is non-executable like 5/0.
        // ama single | olsa her zaman diger sag tarafi execute yapar ve problem olusturur.

        //buraya calis:
        int count = 5;
        System.out.println(count++==5 || ++count ==7);
        System.out.println(count);
         int count2 = 5;
        System.out.println(count2++ == 5 | ++count2 ==7);
        System.out.println(count2);
    }
}
