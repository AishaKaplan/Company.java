package day49_encapsulation;

public class Car {
    Driver driver;

    public Car(String name, String licenceNumber, int age) {
        driver = new Driver(name, licenceNumber, age);

    }

    /*
    String driver; //name, licnum, age,
    String engine; //cylinder, horsepower
}
*/
    class Driver{
        String name;
        String licenceNumber;
        int age;

        public Driver(String name, String licenceNumber, int age) {
            this.name = name;
            this.licenceNumber = licenceNumber;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Driver{" +
                    "name='" + name + '\'' +
                    ", licenceNumber='" + licenceNumber + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
