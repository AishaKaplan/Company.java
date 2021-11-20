package day10_scanner;
import java.util.Scanner;
public class NextLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        input.nextLine(); // accepts the enter input from the line above. bos input koyuyoruz arasina, full name cikmasi icin.Her ne zaman nextLine kullaniyorsak, mutlaka oncesine bos bundan koyacaksin. Bir tane yetiyor.
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter your address");
        String address= input.nextLine();
        System.out.println(number);
        System.out.println(fullName);
        System.out.println(address);
    }
}
