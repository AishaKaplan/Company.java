package day02_print_statement;

import day49_encapsulation.AccessModifier;

public class ComeBackFromFuture {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.a = 1;
     //   obj.b = 2; b is default, it is not accessible because it is outside of the package
     //   obj.c = 3;  c is private not accessible outside of the class
    }
}
