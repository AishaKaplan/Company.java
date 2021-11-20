package day26;

import java.util.Scanner;

public class CreateId {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName= input.nextLine().toLowerCase()
        .trim();

        System.out.println("Enter your last name");
        String lastName= input.nextLine().toLowerCase()
                .trim();

        String id=""+firstName.charAt(0);
        id+=lastName.substring(0,1).toUpperCase()+lastName.substring(1,3);
        id+=firstName.length()*2;
        System.out.println("ID generated: " + id);
    }
}
