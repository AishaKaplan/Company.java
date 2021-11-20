package nadir_java;

public class Contains {

    public static void main(String[] args) {

        System.out.println(contains("Nadir", "Nad"));
    }

    public static boolean contains(String str1, String str2){
        if(str1.contains(str2) || str1.equals(str2)){
            return true;
        }else{
            return false;
        }

    }
}
