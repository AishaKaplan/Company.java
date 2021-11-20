package day45_constructors;

public class Employee {

        String name;
        int id;
        String jobTitle;
        double salary;

        public Employee (String employeeName, int idNumber, String title, double employeeSalary){
            name=employeeName;
            id=idNumber;
            jobTitle=title;
            salary=employeeSalary;

        }
        public void goToMeeting(){
            System.out.println(name+ " is going to a meeting");
        }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee person1=new Employee("Aisha", 9885, "SDET", 100000);
        person1.goToMeeting();
        System.out.println(person1);
    }
}

