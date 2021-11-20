//package day15_switch;
//
//import java.util.Scanner;
//
//public class DaysInWeek {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a number between 1-7");
//        int dayNumber = input.nextInt();
//        switch (dayNumber) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day number");
//
//
//
//        }
//
//    }
//}
package day15_switch;
public class DaysInWeek {
    public static void main(String[] args) {
        int day=4;
        String dayInWords = " ";
        switch  (day){
            case 1: dayInWords = "Monday"; break;
            case 2: dayInWords = "Tuesday"; break;
            case 3: dayInWords = "Wednesday"; break;
            case 4: dayInWords = "Thursday"; break;
            case 5: dayInWords = "Friday"; break;
            case 6: dayInWords = "Saturday"; break;
            case 7: dayInWords = "Sunday"; break;
            default: dayInWords="Invalid day. Words to be between 1-7";

        }
        System.out.println(day);
        System.out.println(dayInWords);
    }
}