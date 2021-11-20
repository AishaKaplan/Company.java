package java_tasks_iq;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveValues {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(5,9,14,100,68,190,289,-45,333,1000,39));
        ArrayList<Integer>list2=new ArrayList<>();
        for(int each:list1){
            if(each<100){
                list2.add(each);
            }
            list1=list2;
        }System.out.println(list1);
    }
}
