package day_40_arraylist;

public class ParseVsValueOf {
    public static void main(String[] args) {
        String s="30";
        System.out.println(s+5);
        int seconds=Integer.parseInt(s);
        System.out.println(seconds<60);
        Integer num=Integer.valueOf(s);//converts the "30" String into the Integer wrapper class object.
        System.out.println(num<60);
        String s2=String.valueOf(seconds);//converts the int seconds of 30-
        System.out.println(s2);
    }
}
