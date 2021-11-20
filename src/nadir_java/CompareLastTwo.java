package nadir_java;
public class CompareLastTwo {
public static void main(String[]args){
String str1="October";
String str2="Novemb";
System.out.println(compareLastTwo(str1, str2));
        }

    public static boolean compareLastTwo(String str1, String str2){
        if(str2.length()<3 || str2.length()<3){
            return false;
        }
        return(str1.substring(str1.length()-2).equals(str2.substring(str2.length()-2)));
    }
}
