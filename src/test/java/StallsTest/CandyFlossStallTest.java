package StallsTest;

import ThemePark.Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    CandyFlossStall candyFlossStall;

    @Before
    public void setup(){
        candyFlossStall = new CandyFlossStall ("Flossy", "Flossy McFloss", "3");
    }

    @Test
    public void hasName(){
        assertEquals("Flossy", candyFlossStall.getName());
    }
    @Test
    public void hasOwnerName(){
        assertEquals("Flossy McFloss", candyFlossStall.getOwnerName());
    }
    @Test
    public void hasParkingSpot(){
        assertEquals("3", candyFlossStall.getParkingSpot());
    }
}
