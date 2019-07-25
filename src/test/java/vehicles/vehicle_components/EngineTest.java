package vehicles.vehicle_components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine(3);
    }

    @Test
    public void canGetHorsepower(){
        assertEquals(3, engine.getHorsepower());
    }
}
