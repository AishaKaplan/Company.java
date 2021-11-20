package office_hours.practice_08_18_2021;

public class OperatorPractice {
    public static void main(String[] args) {
        int numOne=10;
        int numTwo=numOne++ * 3 + ++numOne + numOne++ % 2;

        int biggest =numOne >numTwo ? numOne : numTwo;
                //13>42
        //biggest =numTwo=42
        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(biggest);







    }
}
