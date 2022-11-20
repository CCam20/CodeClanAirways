import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Andrew Miller", 2);

    }
    @Test
    public void passengerHasName(){
        assertEquals("Andrew Miller", passenger.getName());
    }
    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}


