package day20_string;

public class UsernameAndPassword {
    public static void main(String[] args) {
        String username="jamesbond4";
        String password="abcajamesbond";
        if(password.length() >=5 && !password.contains(username)){
            System.out.println("Valid password");

        }else{
            System.out.println("Invalid password");

            if(password.length()<5){
                System.out.println("Password cannot be less than 5 characters");
            }if (password.contains(username)){
                System.out.println("Password cannot contain the username");
            }
        }























    }
}
