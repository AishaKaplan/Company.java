package office_hours.practice_08_26;

public class Sandwich {
    public static void main(String[] args) {
        String str="breadjambread";
        int firstBreadEnd=str.indexOf("bread")+5;
        int secondBread=str.lastIndexOf("bread");
        if(firstBreadEnd !=secondBread){
            System.out.println(str.substring(firstBreadEnd+5, secondBread));

        }else{
            System.out.println("nothing");
        }
//        int secondBread=str.indexOf("bread", firstBreadEnd);
//        System.out.println(str.substring(firstBreadEnd,secondBread));
//if(firstBreadEnd>=0 && secondBread>=0){
//    System.out.println(str.substring(firstBreadEnd, secondBread));
//
//}else{
//    System.out.println("nothing");
//}





    }
}
