package StallsTest;

import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setup(){
        tobaccoStall = new TobaccoStall("Fags R Us", "Hamlet Cigarrillo", "1");
    }

    @Test
    public void hasName(){
        assertEquals("Fags R Us", tobaccoStall.getName());
    }
    @Test
    public void hasOwnerName(){
        assertEquals("Hamlet Cigarrillo", tobaccoStall.getOwnerName());
    }
    @Test
    public void hasParkingSpot(){
        assertEquals("1", tobaccoStall.getParkingSpot());
    }


}
