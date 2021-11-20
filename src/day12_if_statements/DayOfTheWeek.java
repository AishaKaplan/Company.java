package day12_if_statements;

public class DayOfTheWeek {
    public static void main(String[] args) {
        /*
        1-Monday
        2-Tuesday
        .......
        7-Sunday
         */
        // you could add String result = " "; instead of int=day=8
        // and you could remove sout and type result = "wednesday"; instead  and add else { result = "invalid day number"; at the end. no need printing always.
        int day = 8;
        if (day == 1) {
            System.out.println("It is Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");

        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");

        } else if (day == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid day number");
        }

    }
}
