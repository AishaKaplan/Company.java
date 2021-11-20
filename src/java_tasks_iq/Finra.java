package java_tasks_iq;

public class Finra {
    public static void main(String[] args) {
        finra(30);
    }

    public static void finra(int num) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.print("Fin");
            }
            if (i % 5 == 0) {
                System.out.print("Ra");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
String result ="";
            for(int i=1; i <= 30; i++) {
                if(i % 5==0 && i %3 ==0)
                    result += "FINRA ";
                else if(i%5 == 0)
                    result += "RA ";
                else if(i%3==0)
                    result+="FIN ";
                else
                    result += i+" ";
            }
            System.out.println(result);
        }

        public static void main(String[] args) {
            Finra();
        }}
 */