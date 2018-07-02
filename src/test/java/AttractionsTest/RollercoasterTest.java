package AttractionsTest;

import ThemePark.Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void setup(){
        rollercoaster = new Rollercoaster("Dragon Khan", 10);
        visitor = new Visitor(22, 144, 20.00);
    }

    @Test
    public void hasName(){
        assertEquals("Dragon Khan", rollercoaster.getName());
    }

    @Test
    public void canVisitorGoOnRollercoaster(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasRating(){
        assertEquals(10, rollercoaster.getRating());
    }


}
