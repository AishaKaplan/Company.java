package office_hours.practice_10_27;

public class Quiz {
    String topic;
    int numberOfQuestions;
    double totalPoints;

    public Quiz(String topic, int numberOfQuestions, double totalPoints) {
        this.topic = topic;
        this.numberOfQuestions = numberOfQuestions;
        this.totalPoints = totalPoints;
    }
    public void takeQuiz(){
        System.out.println("Taking "+ topic+ " quiz");
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "topic='" + topic + '\'' +
                ", numberOfQuestions=" + numberOfQuestions +
                ", totalPoints=" + totalPoints +
                '}';
    }
}
