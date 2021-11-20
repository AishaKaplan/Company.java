package day20_string;

public class LongestWithA {
    public static void main(String[] args) {
    String wordOne="java";
    String wordTwo="computer";
    String wordThree="apples";

    String biggest="";
    if(wordOne.contains("a") && wordOne.length()>biggest.length()){
        biggest=wordOne;

    } if (wordTwo.contains("a") && wordTwo.length()> biggest.length()){
        biggest=wordTwo;
        }if (wordThree.contains("a") && wordThree.length()>biggest.length()){
        biggest=wordThree;
        }

        System.out.println(biggest.isEmpty() ? "None are valid" : "Biggest: " + biggest);


















    }
}
