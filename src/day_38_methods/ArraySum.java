package day_38_methods;

public class ArraySum {

    public static void main(String[] args) {
        int [] myArray={3,5,1,5};
        System.out.println(sumOfElements(myArray));
    }



    public static int sumOfElements(int [] array){
        int sum=0;
        for(int num : array){
            sum+=num;
        }
        return sum;
    }
}