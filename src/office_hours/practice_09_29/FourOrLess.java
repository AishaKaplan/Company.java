package office_hours.practice_09_29;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
public static void main(String[]args) {
    ArrayList<String> list=new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
    System.out.println(getWordsLessThanFour(list));
    //System.out.println(getWordsLessThanFour2(list);
}

    public static ArrayList<String> getWordsLessThanFour(ArrayList<String>list){
        ArrayList<String> validWords=new ArrayList<>();
        for(String each : list){
            if(each.length() <=4){
                validWords.add(each);
            }
        }
        return validWords;

       // other way with lambda
      //  public static ArrayList<String> getWordsLessThanFour2(ArrayList<String> list){
        //list.removeIf (str ->str.length()>4 );
       // return list;


    }
}
