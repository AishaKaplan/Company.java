package day35_methods;

public class ArrayMethods {
    public static void main(String[] args) {

        int [] a={50, 4, 100, 90, 32};
        getLastArrayElement(a);
        getFirstArrayElement(a);
        getMiddleArrayElement(a);
    }



    public static void getFirstArrayElement(int [] nums){
        System.out.println(nums[0]);
    }
    public static void getLastArrayElement(int [] nums){

        System.out.println(nums[nums.length-1]);
    }
    public static void getMiddleArrayElement(int [] nums){
        if(nums.length %2==1){
            //odd length 12345   5/2 :  2
            System.out.println(nums[nums.length/2]);
        }else{
            // even length 012345    6/2  : 3
            System.out.println(nums[nums.length/2-1]); //gives the first middle character/we need to get next left as well
            System.out.println(nums[nums.length/2]);// gives the second(last) middle character always

        }
    }




}
