package java_tasks_iq;

public class PassWordMatches {
    public static void main(String[] args) {
        String password="AYSe-20?";
        System.out.println(isValid(password));
    }
    public static boolean isValid(String password){
        String upperCase="(.*[A-Z].*)";
        String lowerCase="(.*[a-z].*)";
        String number="(.*[0-9].*)";
        String specialChar="(.*[-/,:@].*)";

        boolean hasUpper=password.matches(upperCase),
                hasLower=password.matches(lowerCase),
                hasNumber=password.matches(number),
                hasSpecialChar=password.matches(specialChar),
                isValid=false;

        if(password.length()>=6 && !password.contains(" "))
            if(hasLower && hasUpper && hasNumber && hasSpecialChar)
                isValid=true;
            return isValid;
    }
}
