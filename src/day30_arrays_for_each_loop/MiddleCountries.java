package day30_arrays_for_each_loop;

public class MiddleCountries {
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
                "Philippines",
                "Palestine",
                "Colombia",
                "Honduras",
                "Indonesia",
                "United States",
                "Arabia"};
        for(String country : countries){
            int mid=country.length()/2;
            if(country.length() % 2==0){

                System.out.println(country.substring(mid-1, mid+1));
        //two ways  System.out.println(country.charAt(mid-1) + ""+country.charAt(mid));
            }else {
                System.out.println(country.charAt(mid));
            }
        }
            }
        }









