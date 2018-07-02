package AttractionsTest;

import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setup(){
        dodgems = new Dodgems("Car Smash");
    }

    @Test
    public void hasName(){
        assertEquals("Car Smash", dodgems.getName());
    }

}
