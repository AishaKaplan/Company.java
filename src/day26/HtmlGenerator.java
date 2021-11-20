package day26;

import java.util.Scanner;

public class HtmlGenerator {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("What html tag ou want to generate");
        String str=input.next();
        String tag=str.substring(0,str.indexOf("^"));
        System.out.println(tag);
        int indexOfCarrot=str.indexOf("^");
String strNum=str.substring(indexOfCarrot+1);
        System.out.println(strNum);
        // this code will turn a number in String format to a number type
        int num=Integer.parseInt(strNum);

            String html="";
        for(int i=0; i<num; i++){
            html+="<"+ tag+ ">"+ "</"+tag+ ">";
        }
        System.out.println(html);
    }
}
