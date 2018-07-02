package AttractionsTest;

import ThemePark.Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setup(){
        dodgems = new Dodgems("Car Smash", 9);
    }

    @Test
    public void hasName(){
        assertEquals("Car Smash", dodgems.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(9, dodgems.getRating());
    }

}
