package office_hours.day10_06;

public class ZoomMeeting {
int numberOfParticipants;
boolean isRecorded;
String purpose;
long meetingId;

public ZoomMeeting (int people, boolean record, String reason, long id){
    numberOfParticipants=people;
    isRecorded=record;
    purpose=reason;
    meetingId=id;

}
public void joinMeeting(){
    numberOfParticipants++;
    }

    @Override
    public String toString() {
        return "ZoomMeeting{" +
                "numberOfParticipants=" + numberOfParticipants +
                ", isRecorded=" + isRecorded +
                ", purpose='" + purpose + '\'' +
                ", meetingId=" + meetingId +
                '}';
    }

    public void leaveMeeting(){
    numberOfParticipants--;


    }
}
