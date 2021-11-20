package day50_inheritance;

public class FlightTicket {
    private String type;
    private String departureLocation;
    private String arrivalLocation;

    public FlightTicket(String type, String departureLocation, String arrivalLocation){
        setType(type);
        this.departureLocation=departureLocation;
        this.arrivalLocation=arrivalLocation;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("first") || type.equals("business") || type.equals("economy")) {
            this.type = type;
        }
    }
    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
}
