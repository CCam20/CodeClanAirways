import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void setUp(){
        cabinCrew = new CabinCrew("Liam Marshall", "Cabin Service Director");
    }

    @Test
    public void cabinCrewHasName(){
        assertEquals("Liam Marshall", cabinCrew.getName());
    }
    @Test
    public void cabinCrewHasRank(){
        assertEquals("Cabin Service Director", cabinCrew.getRank());
    }
    @Test public void cabinCrewCanMessage(){
        assertEquals("Please fasten your seatbelts", cabinCrew.message());
    }


}
