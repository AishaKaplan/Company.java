package day08_relational_logical_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        System.out.println("5>3: " + (5>3));
        System.out.println("5 < 3: " + (5<3 ));

        int age = 2;
        boolean isAToddler = age <= 3;
        System.out.println( "isStill a toddler: " + isAToddler);
        boolean isASenior = age >= 65;
        System.out.println( " Is a senior: " + isASenior);
    }
}
