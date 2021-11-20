package java_tasks_iq;

public class CodilityTesters {
    public static void main(String[] args) {
        codility(20);

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        */

    }
    public static void codility(int N){
        for(int i=1; i<=N; i++){
            if(i%2==0){
                System.out.print("Codility");
            }if(i%3==0){
                System.out.print("Test");
            }if(i%5==0){
                System.out.print("Coders");
            }if(i%2!=0 && i%3!=0 && i%5!=0){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
