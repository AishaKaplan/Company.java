package office_hours.practice_10_13;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    String productOwner;
    String scrumMaster;
    int sprintNumber;
    ArrayList<Developer> allDevelopers;
    ArrayList<Tester> allTesters;


    static String companyName;
    static String ceo;

    public ScrumTeam(int sprintNumber) {
        this.sprintNumber = sprintNumber;
        allDevelopers = new ArrayList<>();
        allTesters = new ArrayList<>();
    }

    public ScrumTeam(String productOwner, String scrumMaster, int sprintNumber) {
        this(sprintNumber);
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;

    }

    public void addDeveloper(Developer developer) {
        allDevelopers.add(developer);
    }

    public void addDeveloper(Developer[] developers) {
        allDevelopers.addAll(Arrays.asList(developers));
    }

    public void addTester(Tester tester) {
        allTesters.add(tester);
    }
    public void removeTester(int employeeId){
        allTesters.removeIf(each -> each.employeeId==employeeId);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", scrumMaster='" + scrumMaster + '\'' +
                ", sprintNumber=" + sprintNumber +
                ", allDevelopers=" + allDevelopers +
                ", allTesters=" + allTesters +
                '}';
    }
}