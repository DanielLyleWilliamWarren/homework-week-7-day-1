package AttractionsTest;

import ThemePark.Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setup(){
        park = new Park("Pirate Park", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Pirate Park", park.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(1, park.getRating());
    }
}
