//package day15_switch;
//import java.util.Scanner;
//public class DaysInMonth {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a month name and start with capital letter");
//        String monthName = input.next();
//        switch (monthName){
//            case "April":
//            case "June":
//            case "September":
//            case "November":
//                System.out.println("This month has 30 days.");
//                break;
//            case "January":
//            case "March":
//            case "May":
//            case "July":
//            case "August":
//            case "October":
//            case "December":
//                System.out.println("This month has 31 days.");
//            break;
//            case "February":
//                System.out.println("This month has 28 days.");
//                break;
//            default:
//                System.out.println("It is invalid month name.");
//
//        }
//
//    }
//}
package day15_switch;
import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String month = input.next(); same with the below. we cannot print the value though.
        int days = 0;
   switch (input.next()){
       case "February":
           days=28;
           break;
       case "April":
       case "June":
       case "September":
       case "November":
           days=30;
           break;
       case "January":
       case "March":
       case "May":
       case "July":
       case"August":
       case "October":
       case "December":
           days=31;
           break;
       default:
           System.out.println("Invalid month entered");

   } if(days !=0) {

            System.out.println(days + " days ");
        }

//we don't need boolean here. we added if at the end not to write the number of days if not valid on console.


















    }




}