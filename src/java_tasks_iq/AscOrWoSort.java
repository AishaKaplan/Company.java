package java_tasks_iq;

public class AscOrWoSort {
    public static void main(String[] args) {

        int [] arr = {48, 45, 10, 0, -90, 3};
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(arr);
    }
}