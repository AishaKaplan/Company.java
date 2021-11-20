package day28_nested_loops;

public class PrimeNumber {
    public static void main(String[] args) {
int number=7;
boolean isPrime=true;
for(int i=2; i<number; i++){
    if(number %i==0){
        isPrime=false;
        break;
    }
}
        System.out.println(isPrime);




    }
}
