package office_hours.practice08_25_2021;

public class MoveFirst {
    public static void main(String[] args) {
        String str="Java is a fun language";
        int indexOfSpace=str.indexOf(" ");
        String remaining=str.substring(indexOfSpace).trim();
        String firstWord=str.substring(0,indexOfSpace);
remaining=remaining.substring(0,1).toUpperCase()+remaining.substring(1);
firstWord=firstWord.toLowerCase();
        System.out.println(remaining+" "+firstWord);











    }


}
