package office_hours.practice_09_15;

public class MultipleWords {
    public static void main(String[] args) {
        String str= "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer ";
        String [] words=str.split(", ");
        for(String eachWord : words ){
            if(eachWord.contains(" ")){
                System.out.println(eachWord);
            }
        }
    }
}
