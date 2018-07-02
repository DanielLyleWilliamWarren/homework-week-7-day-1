package StallsTest;

import ThemePark.Stalls.TobaccoStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setup(){
        tobaccoStall = new TobaccoStall("Fags R Us", "Hamlet Cigarrillo", "1");
        visitor = new Visitor(19, 185, 20.00);
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

    @Test
    public void canSellTobaccoToThisVisitor(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

}
