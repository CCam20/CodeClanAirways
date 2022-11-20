import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Pilot pilot;
    Passenger passenger;
    FlightManager flightManager;
    Plane plane;

    @Before
    public void setUp() {
        flight = new Flight(Plane.BOEING_727, "074536B", "LHR", "GLA", "13:00");
        pilot = new Pilot("Isobel Davison", "Pilot", "CCA096534A");
        passenger = new Passenger("Megan Miles", 2);
        flightManager = new FlightManager(Plane.BOEING_727);
    }
    @Test
    public void checkAvailableBaggageSpace(){
        assertEquals(750, flightManager.getAvailableBaggageSpace(), 0.00);
    }
    @Test
    public void checkBaggageWeightAllowance(){
        assertEquals(6.25, flightManager.baggageAllowancePerPassenger(), 0.00);
    }
    @Test
    public void calculateTotalBaggageWeight(){
        flightManager.addPassenger(passenger); flightManager.addPassenger(passenger);
        flightManager.addPassenger(passenger); flightManager.addPassenger(passenger);
        flightManager.addPassenger(passenger); flightManager.addPassenger(passenger);

        assertEquals(37.5, flightManager.getTotalBaggageWeight(),0.00);
    }
    @Test
    public void calcutateRemainingBaggageWeight(){
        flightManager.addPassenger(passenger); flightManager.addPassenger(passenger);
        flightManager.addPassenger(passenger); flightManager.addPassenger(passenger);
        flightManager.addPassenger(passenger); flightManager.addPassenger(passenger);

        assertEquals(712.5 ,flightManager.getBaggageWeightRemaining(), 0.00);
    }
}