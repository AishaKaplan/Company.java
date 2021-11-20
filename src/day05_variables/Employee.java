package day05_variables;

public class Employee {
    public static void main(String[] args) {
        String employeeFirstName= "Aisha";
        String employeeLastName = "Kaplan";
        String companyName = "Atlas";
        int salary = 100_000;
        int startDay = 01;
        int startMonth = 2;
        String startYear = "2021";
        boolean fullTime = true;
        String jobTitle = "Nurse";
        String officeAddress = "103 Main Street Clifton";

        String fullName = employeeFirstName + employeeLastName;
        String fullStartDate = startMonth + startYear;
        String email = employeeFirstName + startDay + "@" + companyName + "com";
        int salaryAfter3Years = (salary + (startMonth * 1000));

        System.out.println(fullName);
        System.out.println(fullStartDate);
        System.out.println(companyName);
        System.out.println(salary);
        System.out.println(startDay + "/" + startMonth + "/" + startYear);
        System.out.println(jobTitle);
        System.out.println(fullTime);
        System.out.println(officeAddress);
        System.out.println(email);
        System.out.println(salaryAfter3Years);
        System.out.println(" My name is " + employeeFirstName + " " + employeeLastName + " and I work at " + companyName + ".\n" + " My salary is " + salary + ".\n"
+ " I started working here on " + startDay + "/" + startMonth + "/" + startYear + ".\n" + " My work status is full time :" + fullTime + ".\n" + "My job title is " + jobTitle + ".\n" + "My office address is " + officeAddress + " and my email is " + email
+ ".\n" + "My salary after 3 years will be " + salaryAfter3Years + ".");










    }
}
