package day22_loops;
import java.util.Scanner;
public class ColorPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pickedColors = "";
        int colorsPicked = 0;
        while (colorsPicked < 3) {
            System.out.println("Enter a color");
            String color = input.nextLine();
            if(pickedColors.contains(color)){
                System.out.println("pick a different color");
            }
            pickedColors += color + " ";
            colorsPicked++;


        }
        System.out.println(pickedColors);
    }
}