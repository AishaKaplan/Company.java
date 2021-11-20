package day26;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to add space to?");
        String str = input.nextLine();
        String spaceResult = "";
        for (int i = 0; i < str.length(); i++) {
            spaceResult += str.charAt(i) + " ";
            if (str.charAt(i) == ' ') {
                spaceResult += "_ ";
            }else{
                spaceResult += str.charAt(i) + " ";
            }
        }System.out.println("Translated " + str+ " to: ");
}
}