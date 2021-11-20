package day17_string;

public class CreateStrings {
    public static void main (String[] args){
      String first="java"; // String literal
      // create a String object in the String pool

        String second =new String ("java");
        // creates a String object in the heap, Not the String pool

        System.out.println(first==second);// == with String does not check the value
        //It checks the memory location and compares them

        System.out.println(first.equals(second)); // .equals compares the values, not memory location

        String third="java";
        System.out.println(first==third); //it only checks the location of both which are same

        String fourth= third;
        System.out.println(third);
       /*_______________________________________________________
                     HEAP
        -------------------------------------------------------
                    STRING POOL
        first ->   "java"   <- third
                      ^
                   fourth
        five ->    "Java"
        ------------------------------------------------------
        second -> [ "java"   ]
         ________________________________________________________
          */
        String five="Java"; // this one joins to the String pool later because it is literal

























    }
}
