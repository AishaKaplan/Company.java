package day30_arrays_for_each_loop;

public class Prices {
    public static void main(String[] args) {
        double [] prices={ 90.4, 40.24, 140.41};
        for(int i=0; i< prices.length; i++){
            System.out.println("$ " + prices[i]);//same with below:
        }
        System.out.println();
        for(double each : prices ){
            System.out.println("$ " + each);
        }


    }
}
