package loopPractice3;

public class DuplicateCharacters {
    public static void main(String[] args) {
String word="AAABCCDEEF";
String duplicate="";

for (int i=0; i<word.length(); i++) {
    int count = 0;
    for (int j = 0; j < word.length(); j++) {


        if (word.charAt(i) == word.charAt(j)) {
            count++;


            if (count == 2 && !duplicate.contains(word.substring(j, j + 1))) {
                break;
            }
        }
    }
}System.out.println(duplicate);

    }
}
