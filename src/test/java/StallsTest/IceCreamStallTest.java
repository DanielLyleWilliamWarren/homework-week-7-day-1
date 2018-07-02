package StallsTest;

import ThemePark.Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setup(){
        iceCreamStall = new IceCreamStall("Luca's", "Giovani Luca", "2");
    }

    @Test
    public void hasName(){
        assertEquals("Luca's", iceCreamStall.getName());
    }
    @Test
    public void hasOwnerName(){
        assertEquals("Giovani Luca", iceCreamStall.getOwnerName());
    }
    @Test
    public void hasParkingSpot(){
        assertEquals("2", iceCreamStall.getParkingSpot());
    }
}
