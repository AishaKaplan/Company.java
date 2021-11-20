package day13_multi_branch;
import java.util.Scanner;

public class OxygenLevelSaim {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

       // int oxygenLevel = 80; without using scanner
        int oxygenLevel = input.nextInt();
        String message = " ";
        if(oxygenLevel >=50 && oxygenLevel<60) {
           message = "Be careful now you are at 50%";

        }else if (oxygenLevel >=60){   // sirasiyla gidersen range koymana gerek yok.

            message = "Start to head back";
        }
        // correct one is like this from the top:
        //if (oxygenLevel >=90){
       // message = "Start to head back";
        System.out.println(message);
    }
}
