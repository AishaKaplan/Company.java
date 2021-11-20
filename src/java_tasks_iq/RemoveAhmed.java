package java_tasks_iq;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList(Arrays.asList("Ahmed", "John", "Eric", "Hernan", "Ahmed"));
       // names.removeAll(Arrays.asList("Ahmed"));
       System.out.println(names);

       //with lambda expression:
       names.removeIf(arrayElement ->arrayElement.equals("Ahmed"));
        System.out.println(names.toString());





















    }
}
