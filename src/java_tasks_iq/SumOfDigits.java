package java_tasks_iq;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("12345"));
    }

    public static int sumOfDigits(String str){
        int sum=0;
        for(int i=0; i<str.length(); i++){
            sum+=Integer.parseInt(""+str.charAt(i));
        }
        return sum;
    }
}
