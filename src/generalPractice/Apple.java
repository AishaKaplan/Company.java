package generalPractice;

public class Apple {
    public static void main(String[] args) {
     String str="Apple";
        System.out.println(str.indexOf('A'));
        System.out.println(str.indexOf('p'));
        int firstP=str.indexOf('p');
        int secP=str.indexOf('p',firstP+1);
        System.out.println(secP);
        System.out.println(str.lastIndexOf('p'));
        String str1=" ";
        System.out.println(str1.isEmpty());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(3));
        System.out.println(str.substring(2,4));
        System.out.println(str.contains("pl"));
        System.out.println(str.replace('p', 't'));










    }

}
