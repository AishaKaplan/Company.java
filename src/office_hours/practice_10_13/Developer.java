package office_hours.practice_10_13;

public class Developer {
    String name;
    int employeeId;
    String jobTitle;
    double salary;
   static boolean canCode;
static{
    canCode=true;
}
    public Developer(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Developer(String name, int employeeId, String jobTitle, double salary) {

        this(name, employeeId);//chaining the first method here
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void coding (){
        System.out.println(name+" is coding");
    }
    public void fixingBug(){
        System.out.println(name+ " is fixing a bug");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//    create a class called Developer
//            Attributes:
//    instance: name, employee id, job title, salary
//    static: can code (boolean)
//
//    Constructor:
//            - accepts and sets all instance variables
//                        - overload to also create an object with only the name and employee id
//
//    Actions:
//    coding(),  fixingBug(), toString()
//
//
//    create a class called Tester
//            Attributes:
//    instance: name, employee id, job title, salary
//
//    Constructor:
//            - accepts and sets all instance variables
//                         - overload to also create an object with only the name and employee id
//
//    Actions:
//    smokeTesting(),  creatingTicket(), toString()
//
//    create a class called ScrumTeam
//
//            Attributes:
//    PO, BA, SM,
//    all developers, all testers (ArrayLists)
//    sprintNumber
//
//    static: company name, ceo name
//
//    Constructor:
//            - sets only the sprint number
//                    - overload to set sprint number, the names of PO, BA, SM, and creates ArrayList objects
//
//    Actions:
//
//    addTester(Tester tester): adds the given tester to the testers arraylist
//
//    addTesters(Tester[] testers): adds the given testers to the testers arraylist
//
//    addDeveloper(Developer developer): adds the given developer to the developers arraylist
//
//    addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
//
//    removeTester(long employeeID): removes the given tester from the testers arraylist
//
//    removeDeveloper(long employeeID): removes the developer from the developers arraylist
//
//    toString(): prints number of tester,& developers,  PO name, SM name, BA name
//}
