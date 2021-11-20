package day13_multi_branch;

public class ClassesInAweek {
    /*
    monday, wednesday, thursday, saturday, sunday
    ->java
    tuesday
    ->Soft skills
    friday
    -> off
     */


    public static void main(String[] args) {
        String day= "friday";


        boolean isTechnicalDay=day.equals("monday") || day.equals("wednesday") || day.equals("thursday") || day.equals("saturday") ||day.equals("sunday");
       boolean isSoftSkills =day.equals("tuesday");
       boolean isFriday = day.equals("friday"); // !isTechnicalDay && !isSoftskills
        if(isTechnicalDay){
            System.out.println("java");

        }else if (isSoftSkills){
            System.out.println("Soft skills");

        }else if (isFriday){
            System.out.println("off day");
        } else {
            System.out.println("invalid day given");
        }


    }




    }
