package day27_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String s = "java";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(s.charAt(i));
            }
        }
    }
}