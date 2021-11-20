package generalPractice;

public class ContainsNumber {
    public static void main(String[] args) {
        int[] numbers={3,5,7,0};
        containNumber(numbers);
    }

public static void containNumber(int [] numbers){

    int a=3;
    String result="";
    for(int each : numbers){
        if(each==a) {
            result = "true";
        } else{
            result="false";
        }
        System.out.println(result);
    }
}
}