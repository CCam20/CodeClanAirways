import java.util.ArrayList;

public class FlightManager {

    private Plane plane;
    private ArrayList<Passenger> passengers;

    public FlightManager(Plane plane){
        this.plane = plane;
        this.passengers = new ArrayList<>();

    }
    public double baggageAllowancePerPassenger(){
        double bagWeight = plane.getTotalWeight() / 2;
        double baggageAllowance = bagWeight / plane.getCapacity();
        return baggageAllowance;
    }
    public double getAvailableBaggageSpace(){
        double availableSpace = plane.getTotalWeight() / 2;
        return availableSpace;

    }
    public double getTotalBaggageWeight() {
        return baggageAllowancePerPassenger() * passengers.size();
    }
    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() < this.plane.getCapacity()) {
            this.passengers.add(passenger);
        }
    }
    public double getBaggageWeightRemaining(){
        return getAvailableBaggageSpace() - getTotalBaggageWeight();
    }
}
