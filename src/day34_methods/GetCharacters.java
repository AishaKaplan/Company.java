package day34_methods;

public class GetCharacters {

    public static void printUppercaseAtoZ(){
        for(int i='A'; i<='Z'; i++){
            System.out.print((char) i+ " ");
        }
        System.out.println();
    }
    public static void printLowercaseAtoZ() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }
        public static void print0To9 () {
            for (int i = '0'; i <= '9'; i++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
        public static void printZToA () {
            for (int i = 'Z'; i >= 'A'; i--) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
        public static void printLowerZToA() {
            for (int i = 'z'; i >= 'a'; i--) {
                System.out.print((char) i + " ");


            }
            System.out.println();
        }
    }