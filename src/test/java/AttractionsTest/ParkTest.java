package AttractionsTest;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setup(){
        park = new Park("Pirate Park");
    }

    @Test
    public void hasName(){
        assertEquals("Pirate Park", park.getName());
    }


}
