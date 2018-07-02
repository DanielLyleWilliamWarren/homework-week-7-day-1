import ThemePark.Attractions.Rollercoaster;
import ThemePark.Interfaces.IReviewed;
import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ArrayList<IReviewed> reviews;
    ThemePark themePark;
    Rollercoaster rollercoaster;

    @Before
    public void setup(){
        rollercoaster = new Rollercoaster("Space Mountain", 10);
    }
//    @Test
//    public void hasReviews(){
//        themePark.addRating(rollercoaster);
//        assertEquals(1, themePark.reviews.size());
//    }


}
