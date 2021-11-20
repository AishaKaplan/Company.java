package java_tasks_iq;

public class Password {
    public static void main(String[] args) {
        String password = "123abc*A";
        System.out.println(isValid(password));
    }

    public static boolean isValid(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        } else {
            int upperCaseCount = 0;
            int lowerCaseCount = 0;
            int specialCharacterCount = 0;
            int digitCount = 0;
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                    upperCaseCount++;
                    if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                        lowerCaseCount++;
                        if (password.charAt(i) >= 33 && password.charAt(i) <= 47) {
                            specialCharacterCount++;
                            if (password.charAt(i) >= 0 && password.charAt(i) <= 9) {
                                digitCount++;
                            }
                        }
                    }
                }
            }
            return upperCaseCount > 0 && lowerCaseCount > 0 && specialCharacterCount > 0 && digitCount > 0;

        }
    }
}
