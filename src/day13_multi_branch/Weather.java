package day13_multi_branch;

public class Weather {
    public static void main(String[] args) {
        /*
        sunny, rainy, windy, snowy, foggy, cloudy
         */

        String weather = "Windy";
        if (weather.equals ("sunny")) {
            System.out.println("It is nice, go outside, ride a bike, code java");
        } else if (weather.equals("rainy")){
            System.out.println("stay home, drink some tea");
        } else if (weather.equals("windy")) {

            System.out.println("fly a kite and code java");
        } else if (weather.equals("snowy")) {
            System.out.println("go skiing, drink hot choco");
        } else {
            System.out.println("not a valid weather type, but code java anyway");
        }


    }
}
