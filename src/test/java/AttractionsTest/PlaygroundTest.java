package AttractionsTest;

import ThemePark.Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;

    @Before
    public void setup(){
        playground = new Playground("Daisy Playground", 4);
        visitor = new Visitor(14, 145, 5.00);
    }


    @Test
    public void hasName(){
        assertEquals("Daisy Playground", playground.getName());
    }

    @Test
    public void canVisitorEnterCarPark(){
        assertEquals(false, playground.isAllowedTo(visitor));
    }
    @Test
    public void hasRating(){
        assertEquals(4, playground.getRating());
    }
}
