package office_hours.practice_08_19_2021;

public class ArmyQualification {


    public static void main(String[] args) {
    String citizenship = "canada";
    boolean resident = true;
    boolean hasHighSchoolDiploma=true;
    int age=35;

    if(citizenship.equalsIgnoreCase("us") || resident){
        if (age>=18 && age <= 35){
            if (hasHighSchoolDiploma){
                System.out.println("You are qualified for the US Army");
            }else {
                System.out.println("You must have a high school diploma");
            }
        }else {
            System.out.println("Your age must be between 18 to 35 years old");
        }
    } else {
        System.out.println("You must be a U.S citizen or a resident");
    }

































    }
}