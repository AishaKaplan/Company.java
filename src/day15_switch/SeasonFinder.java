//package day15_switch;
//
//import java.util.Scanner;
//
//public class SeasonFinder {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a number of month between 1-12");
//        int number = input.nextInt();
//        String season = " ";
//        boolean validNumber= true;
//        switch (number){
//            case 1:
//            case 2:
//            case 12:
//                season="Winter";
//                break;
//            case 3:
//            case 4:
//            case 5:
//                season="Spring";
//                break;
//            case 6:
//            case 7:
//            case 8:
//                season="Summer";
//            break;
//            case 9:
//            case 10:
//            case 11:
//                season="Fall";
//                break;
//            default:
//                season="Invalid entry";
//                validNumber=false;
//        }
//            if (validNumber){
//                System.out.println("This month is in " + season + " season.");
//
//            }else {
//                System.out.println("You entered an invalid month.");
//            }
//
//    }
//}
package day15_switch;
import java.util.Scanner;
public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number");
        int month = input.nextInt();
        String season = " ";
        switch (month){
            case 12:
            case 1:
            case 2:
                season="Winter";
                break;
            case 3:
            case 4:
            case 5:
                season="Spring";
                break;
            case 6:
            case 7:
            case 8:
                season= "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season= "Fall";
                break;
            default:
                season="Invalid month given";

        }
        System.out.println(season);


































    }
}