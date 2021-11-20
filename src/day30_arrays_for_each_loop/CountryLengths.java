package day30_arrays_for_each_loop;

public class CountryLengths {

    public static void main(String[] args) {
        String[] countries = {
                "Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "Turkey",
                "UAE",
                "Philippines",
                "Palestine",
                "Colombia",
                "Honduras",
                "Indonesia",
                "United States",
                "Arabia"};

        String smallest = countries[0];
        String largest = countries[0];
        for (String each : countries) {
            if (each.length() < smallest.length()) {
                smallest = each;
            }

            if (each.length() > largest.length()) {
                largest = each;
            }

        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);


        for (int i = 0; i < countries.length; i++) { //traditional loop:
            String each = countries[i];
            if (each.length() < smallest.length()) {
                smallest = each;
            }

            if (each.length() > largest.length()) {
                largest = each;
            }

        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}