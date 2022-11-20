import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before public void setUp(){
        pilot = new Pilot("Jamie Green", "Senior Pilot", "CCA096534A");
    }
    @Test public void pilotHasName(){
        assertEquals("Jamie Green", pilot.getName());
    }
    @Test public void pilotHasRank(){
        assertEquals("Senior Pilot", pilot.getRank());
    }
    @Test public void pilotHasPilotNum(){
        assertEquals("CCA096534A", pilot.getPilotNum());
    }
    @Test public void pilotCanFlyPlane(){
        assertEquals("Take Off!", pilot.flyPlane());
    }



    }



