package day45_constructors;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean isPersian;


    public Carpet (double carpetWidth, double carpetLength, double carpetUnitP, boolean persianOrNot) {
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitP;
        isPersian = persianOrNot;
        totalPrice=width*length*unitPrice;
        if(isPersian){
            totalPrice+=200;
        }

    }
        @Override
        public String toString() {
            return "Carpet{" +
                    "width=" + width +
                    ", length=" + length +
                    ", unitPrice=" + unitPrice +
                    ", isPersian=" + isPersian +
                    ", totalPrice=" + totalPrice +
                    '}';
        }

        }



