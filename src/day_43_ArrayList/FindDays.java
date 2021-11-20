package day_43_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDays {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(getDays(1));
        System.out.println(getDays(7));
        ArrayList<String> days=getDays();
        System.out.println(days.containsAll(Arrays.asList("Monday", "Friday", "Sunday")));
        System.out.println(days.containsAll(Arrays.asList("Monday", "April", "Sunday")));
    }



    public static ArrayList<String> getDays() {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));
        return daysInList;
    }



        public static String getDays(int day) {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));


            return daysInList.get(day-1);

        }



        }

