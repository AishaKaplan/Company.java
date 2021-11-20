package day20_string;

public class AccountNumber {
    public static void main(String[] args) {
        String accountNumber="2334145";
        /*
        3 ways to check if it starts with 2
        startsWith("2")
        chartAt(0) =='2'
        substring (0,1).equals("2")

         */
        if(accountNumber.startsWith("2")){
            if(accountNumber.length()==7){
                System.out.println("Valid 7 digit account number");

            }else{
                System.out.println("Invalid 7 digit account number");

            }
        }else if(accountNumber.startsWith("7")){
            if(accountNumber.length()==10){
                System.out.println("Valid 10 digit account number");
            }else {
                System.out.println("Invalid account number");
            }
        }else{
            System.out.println("Invalid account number. Need to start with 2 or 5");
        }


















    }
}
