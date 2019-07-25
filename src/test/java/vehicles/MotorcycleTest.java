package vehicles;

import org.junit.Before;
import org.junit.Test;
import vehicles.vehicle_components.Engine;

import static org.junit.Assert.assertEquals;

public class MotorcycleTest {

    Engine engine;
    Motorcycle motorcycle;

    @Before
    public void setUp(){
        engine = new Engine(300);
        motorcycle = new Motorcycle(engine, 2, "Blue", 14000);
    }

    @Test
    public void canGetNoOfTyres(){
        assertEquals(2, motorcycle.getNoOfTyres());
    }

    @Test
    public void canGetPrice(){
        assertEquals(16800, motorcycle.getPrice(), 0);
    }
}
