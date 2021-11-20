package nadir_java;

public class LastThree {
    public static void main(String[] args) {
        System.out.println(lastThree("Softskill"));
    }


    public static boolean lastThree(String str){
        String lastThree=str.substring(str.length()-3);
        if(lastThree.equals("ill")){
            return true;
        } else {
            return false;
        }

    }

}
