package day17_string;

public class StringMethods {
    public static void main(String[] args) {
        String name= "james";
        System.out.println(name.equals("james")); // true
        System.out.println(name.equals("James")); // false
        System.out.println(name.equalsIgnoreCase("James")); // true
        System.out.println(name.equalsIgnoreCase("JaMeS")); // true
        System.out.println(name.toUpperCase()); //JAMES
        System.out.println(name); //james
        String lastName= "bond";
        lastName=lastName.toUpperCase();
        System.out.println(lastName);
        System.out.println(lastName.toLowerCase()); // if you only do this it does not change the value for the next lines. the next line prints it as uppercase.
        System.out.println(lastName);
        String word= "Monday ";
        int length= word.length();
        System.out.println(length);

        String word2="Monday";
        int length2=word2.length();
        System.out.println(length2);
















    }
}
