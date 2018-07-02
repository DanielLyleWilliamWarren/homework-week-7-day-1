package AttractionsTest;

import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setup(){
        playground = new Playground("Daisy Playground");
    }

    @Test
    public void hasName(){
        assertEquals("Daisy Playground", playground.getName());
    }


}
