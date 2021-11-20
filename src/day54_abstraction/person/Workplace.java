package day54_abstraction.person;

public class Workplace {
    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.work();
        tester.sleep(30);
        tester.jobTitle="Tester";

        Developer developer=new Developer();
        developer.work();
        developer.sleep(20);

        Chef chef=new Chef();
        chef.work();
        chef.sleep(60);
    }
}
