package vehicles.vehicle_components;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TyreTest {

    Tyre tyre;

    @Before
    public void setUp(){
        tyre = new Tyre(3);
    }


    @Test
    public void canGetThickness() {
        assertEquals(3, tyre.getThickness());
    }
}