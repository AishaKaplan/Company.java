package day09_scanner_logical;

public class ReviewOperators {
    public static void main(String[] args) {
        double budget = 1000;
        budget -= 200;
        boolean stillInBudget = budget >= 0;
        System.out.println("Still in budget : " + stillInBudget);
        System.out.println("Budget after purchase : " + budget);
        budget -=500;
        System.out.println(budget !=300);
        System.out.println(budget != 300.5);
        System.out.println(budget--==300);// 300=300 true, budget = 299
        System.out.println(--budget ==299);// 298 ==299 budget = budget-1
        System.out.println(budget++==299);//false because its value is 298, it becomes 299 after
        System.out.println(budget ==299); //true in this line

    }
}
