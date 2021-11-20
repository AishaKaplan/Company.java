package office_hours.day10_06;

public class Bank {
    public static void main(String[] args) {

        BankAccount account=new BankAccount("James Bond", 1000, 28675636L, "checking" );
        System.out.println(account);
        System.out.println(account.checkBalance());
        account.withdraw(500);
        System.out.println(account.checkBalance());
        System.out.println(account.withdraw(100));
        System.out.println(account.withdraw(1000));
        System.out.println(account.deposit(40000));




    }
}
