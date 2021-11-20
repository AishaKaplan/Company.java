package day21_loops;

public class SmsParts {
    public static void main(String[] args) {
        String msg= "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        int indexOfSenderBegin= msg.indexOf("<");
        int indexOfSenderClose=msg.indexOf(">");
        int indexOfNumberBegin=msg.indexOf("[");
        int indexOfNumberClose=msg.indexOf("]");
        int indexOfMsgBegin=msg.indexOf("{");
        int indexOfMsgClose=msg.indexOf("}");

        String sender=msg.substring(indexOfSenderBegin +1, indexOfSenderClose);
        String number=msg.substring(indexOfNumberBegin +1, indexOfNumberClose);
        String message=msg.substring(indexOfMsgBegin +1,indexOfMsgClose);
        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);












    }





}
