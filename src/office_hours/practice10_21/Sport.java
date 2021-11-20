package office_hours.practice10_21;

public class Sport {
   private String name;
    private int numberOfPlayer;
    private boolean isTeamBased;

    public Sport(String name, int numberOfPlayer, boolean isTeamBased){
        this.name=name;
        this.numberOfPlayer=numberOfPlayer;
        this.isTeamBased=isTeamBased;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }
    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }
    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer=numberOfPlayer;
    }
    public boolean isTeamBased() {
        return isTeamBased;
    }
    public void setTeamBased(boolean teamBased) {
        isTeamBased= teamBased;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayer=" + numberOfPlayer +
                ", isTeamBased=" + isTeamBased +
                '}';
    }
}
