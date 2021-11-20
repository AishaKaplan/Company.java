package my_utilities;

public class StringUtil {
    /*
    Reverse method

     */
    public static String reverse(String original) {

        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        return reverse;
    }


    public static int frequencyOfLetter(String word, char letter) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                counter++;

            }
        }
        return counter;
    }

    public static String getDuplicateCharacters(String str) {
        String allDuplicate = "";
        for (int i = 0; i < str.length(); i++) {
            if (!allDuplicate.contains("" + str.charAt(i))) {
                int count = frequencyOfLetter(str, str.charAt(i));
                if (count > 1) {
                    allDuplicate += str.charAt(i);
                }
            }
        }
            return allDuplicate;
        }
    }




