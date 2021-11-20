package day19_string;

public class MultipleIndexes {
    public static void main(String[] args) {
        String word="definition";
        System.out.println("First i pos: " + word.indexOf('i'));
        System.out.println("Last i pos: " + word.lastIndexOf('i'));

        int secondIHardCoded=word.indexOf('i', 3);
        System.out.println(secondIHardCoded);

        int firstPos=word.indexOf('i');
        int secondPos=word.indexOf('i', firstPos + 1); // it //starts to look for from position 4
        int thirdPos=word.indexOf('i', secondPos + 1);
        System.out.println("First pos" + firstPos);
        System.out.println("Second pos" + secondPos);
        System.out.println("Third " + thirdPos);

        String a="aaa";
        System.out.println(a.indexOf('a'));
        System.out.println(a.indexOf('a', a.indexOf('a') + 1));





























    }
}
