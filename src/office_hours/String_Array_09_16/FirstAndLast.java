package office_hours.String_Array_09_16;

public class FirstAndLast {
    public static void main(String[] args) {
        String [] arr={"apple", "tree", "shed", "marker", "pen"};
        for(String each : arr){
            System.out.println("First character: "+ each.charAt(0));
            System.out.println("Last character: " + each.charAt(each.length()-1));
            System.out.println();
        }













    }
}
