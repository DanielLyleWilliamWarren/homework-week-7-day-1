import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setup(){
        visitor = new Visitor(19, 180, 50.00);
    }

    @Test
    public void hasAge(){
        assertEquals(19, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(180, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(50.00, visitor.getMoney(),1);
    }
}

