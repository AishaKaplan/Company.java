package java_tasks_iq;

public class ConcatTwoArrSt {
    public static void main(String[] args) {
        String[] arr1 = {"cat", "dog", "monkey"};
        String[] arr2 = {"dolphin", "whale", "shark"};
        System.out.println(concatTwoArr(arr1, arr2));
    }

        public static String concatTwoArr (String [] str1, String []str2){

        String result = "";

        for (String each : str1) {
            result += each + ", ";
        }
        for (String each : str2) {
            result += each + ", ";
        }
        return result.substring(0, result.length()-2);









    }
}