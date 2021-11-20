package day35_methods;

public class PersonInformation {

    public static void main(String[] args) {
        buildEmail("james bond", "gmail");
        buildEmail("adam smith", "yahoo");
        login("jbond007", "bond007");
    }


    public static void buildEmail(String name, String domain){
        name=name.replace(" ", "_");
        System.out.println(name+ "@" + domain + ".com");
    }
    public static void login(String username, String password){
        if(username.equals("jbond007") && password.equals("bond007")){
            System.out.println("Logged In");
        }else {
            System.out.println("Invalid Credentials");
        }


    }











}


