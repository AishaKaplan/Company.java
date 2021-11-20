package iq_old;

public class GetUnique {
    public static void main(String[] args) {

        System.out.println(getUnique("AAABBBCCCDEF"));
    }

    public static String getUnique(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
        int counter =0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    counter++;
                }
            }
            if (counter == 1) {
                result += "" + s.charAt(i);
            }
        }
        return result;

    }
}

