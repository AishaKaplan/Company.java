package day_36_methods;

public class DaysInAweek {
    /*
    make a method that will accept a number
    i want to see which day of the week it is
     */
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(2));
        String day=getDayOfWeek(1);
        System.out.println(day.charAt(0));
        String day2=getDayOfWeek(10);
        System.out.println(day2.equals("Not a valid day"));
        String day3=getDayOfWeek(6);
        if(day3.equals("Saturday") || day3.equals("Sunday")){
            System.out.println("It is the weekend");
        }
    }
    public static String getDayOfWeek(int number){

        String day="";
        switch (number){
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
            default:
                day="Not a valid day";
        }
        return day;
    }
}