//package java_tasks_iq;
//
//import java.util.Arrays;
//
//public class SortDigitsLetters {
//    public static void main(String[] args) {
//        String str = "DBNH661299834";
//        System.out.println(sortDigitsLetters(str));
//    }
//
//    public static String sortDigitsLetters(String str) {
//        String result = "";
//        String str2 = "" + str.charAt(0);
//        for (int i = 0; i < str.length() - 1; i++) {
//            if (Character.isDigit(str.charAt(i)) == Character.isDigit(str.charAt(i + 1))) {
//                str2 += str.charAt(i + 1);
//
//            } else {
//                char[] chars = str2.toCharArray();
//                Arrays.sort(chars);
//
//                for (char each : chars) {
//                    result += "" + each;
//                }
//                str2 = "" + str.charAt(i + 1);
//            }
//            if (i == str.length() - 2) {
//                char[] chars = str2.toCharArray();
//                Arrays.sort(chars);
//                for (char each : chars) {
//                    result += "" + each;
//                }
//            }
//            return result;
//        }
//    }
//}



