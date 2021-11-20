package day_37_methods;

public class NumberReturnMethod {
    public static void main(String[] args) {
        System.out.println(convertNumberToWord(5));


    }


    public static String convertNumberToWord(int num) {
        if(num<=0 || num> 10){
            return "Out of Range";
        }
        String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        return words[num - 1];

    }
}