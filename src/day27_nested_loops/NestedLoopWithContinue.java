package day27_nested_loops;

public class NestedLoopWithContinue {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            //       if(i==2) { this breaks the outer loop so it only has one iteration; that means we only see first, second, second
            break;
        }
        System.out.println("first");
        for (int j=1; j<=3; j++){
            if (j==2) {
                continue;
            }
            System.out.println("second");
            //          if(j==2){  this breaks the inner loop, so only one iteration of the inner loop is run.
          //  break;
        }
    }
}


