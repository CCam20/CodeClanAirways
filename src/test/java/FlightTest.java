import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot1;
    Pilot pilot2;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;
    CabinCrew cabinCrew4;

    Passenger passenger1;
    Passenger passenger2;
    Flight flight;
    Flight flight2;

    @Before
    public void setUp(){
        flight = new Flight(Plane.BOEING_777, "074536B", "LHR", "GLA", "13:00");
        flight2 = new Flight(Plane.CESSNA_172, "074536B", "LHR", "GLA", "13:00");
        pilot1 = new Pilot("Isobel Davison","Pilot","CCA096534A");
        pilot2 = new Pilot("Sam Akhtar","Co-Pilot","CCA639564M");
        cabinCrew1 = new CabinCrew("Alisha Gardner", "Head Steward");
        cabinCrew2 = new CabinCrew("Bethany Bennett", "In Flight Manager");
        cabinCrew3 = new CabinCrew("Kyle Woods", "Steward");
        cabinCrew4 = new CabinCrew("Joshua Gray", "Steward");
        passenger1 = new Passenger("William Archer", 1);
        passenger2 = new Passenger("Megan Miles", 2);
    }
    @Test public void flightHasPilots(){
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        assertEquals(2, flight.getPilots());

    }
    @Test public void flightHasCrew(){
        flight.addCrew(cabinCrew1);
        flight.addCrew(cabinCrew2);
        flight.addCrew(cabinCrew3);
        flight.addCrew(cabinCrew4);
        assertEquals(4, flight.getCabinCrew());

    }
    @Test public void flightHasPassengers(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(2, flight.getPassengers());
    }
    @Test public void flightHasPlane(){
        assertEquals(Plane.BOEING_777, flight.getPlane());
    }
    @Test public void flightHasFlightNum(){
        assertEquals("074536B", flight.getFlightNum());
    }
    @Test public void flightHasDestination(){
        assertEquals("LHR", flight.getDestination());
    }
    @Test public void flightHasDepartureAirort(){
        assertEquals("GLA", flight.getDepartureAirport());
    }
    @Test public void flightHasDepartureTime(){
        assertEquals("13:00", flight.getDepartureTime());
    }
    @Test public void canReturnNumberOfAvailableSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);

        assertEquals(97, flight.getAvailableSeats());
    }
    @Test public void cantAddMorePassengersWhenPlaceIsFull(){
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger1);
        assertEquals(4, flight2.getPassengers());
    }

}
