import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(Plane plane, String flightNum, String destination, String departureAirport, String departureTime){
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = plane;

    }

    public int getPilots() {
        return pilots.size();
    }

    public int getCabinCrew() {
        return cabinCrew.size();
    }

    public int getPassengers() {
        return passengers.size();
    }

    public Plane getPlane() {
        return this.plane;
    }


    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public void addCrew(CabinCrew cabinCrew) {
        this.cabinCrew.add(cabinCrew);
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() < this.plane.getCapacity()) {
            this.passengers.add(passenger);
        }
    }
    public int getAvailableSeats() {
        return Plane.BOEING_777.getCapacity() - this.passengers.size();
    }

}

