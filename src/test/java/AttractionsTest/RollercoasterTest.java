package AttractionsTest;

import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;

    @Before
    public void setup(){
        rollercoaster = new Rollercoaster("Dragon Khan");
    }

    @Test
    public void hasName(){
        assertEquals("Dragon Khan", rollercoaster.getName());
    }


}
