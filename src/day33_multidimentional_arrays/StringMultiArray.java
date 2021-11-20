package day33_multidimentional_arrays;

import java.util.Arrays;

public class StringMultiArray {
    public static void main(String[] args) {
    //    String [][] cybertek=new String[4][2]; //same with below:(total size 4, each has 2 elements=inner arrays)
     //   String [] groupOne=new String[2];
    //    String[] groupTwo=new String[2];
     //   String[]groupThree=new String[2];
     //   String[] groupFour=new String[2];
    //    System.out.println(Arrays.deepToString(cybertek));

        String [] groupOne = {"Sergii", "Nisso", "Rano"};
        String [] groupTwo = {"Mubarek", "Ibrahim"};
        String [] groupThree = {"Nadir", "Saim"};
        String [] groupFour= {"Nicole", "Tach", "Ailya", "Mohammed"};

        String [][] cybertek = new String[4][];
        cybertek[0] =groupOne;
        cybertek[1]=groupTwo;
        cybertek[2]=groupThree;
        cybertek[3]=groupFour;
        System.out.println(cybertek.length);
        System.out.println(Arrays.deepToString(cybertek));
        for(String [] groups : cybertek){
         //   System.out.println(Arrays.toString(groups));
            System.out.println("Group members:");
            for (String member : groups){
                System.out.println(member);
            }
        }









    }
}
