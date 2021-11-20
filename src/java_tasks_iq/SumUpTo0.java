package java_tasks_iq;

import java.util.Arrays;

public class SumUpTo0 {

    public static void main(String[] args) {
        int n=3;
        System.out.println(Arrays.toString(sumUpTo0(n)));
    }

    public static int[] sumUpTo0(int n){
        int [] result=new int[n];
        int sum=0;
        if(result.length==1){
            result[0]=0;

        }else {
            for(int i=1; i<n-1; i++){
                result[i]=i;
                sum+=i;
            }
            result[0]=-sum;
        }
        return result;
    }
}
