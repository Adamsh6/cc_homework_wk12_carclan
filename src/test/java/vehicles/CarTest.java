package vehicles;

import org.junit.Before;
import org.junit.Test;
import vehicles.vehicle_components.Engine;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Engine engine;
    Car car;

    @Before
    public void setUp(){
        engine = new Engine(50);
        car = new Car(engine, 3, "Red", 3000);
    }

    @Test
    public void canGetTyreCount(){
        assertEquals(4, car.getNoOfTyres());
    }

    @Test
    public void canGetPrice(){
        assertEquals(3300, car.getPrice(), 0);
    }

    @Test
    public void canGetDailyRentalCost(){
        assertEquals(60, car.getDailyCost(), 0);
    }

    @Test
    public void canGetRentalPrice(){
        assertEquals(350, car.getFullRentalCost(5), 0);
    }

    @Test
    public void canGetDamageCost(){
        assertEquals(0, car.getDamageCost(), 0);
    }

    @Test
    public void canAddDamage(){
        car.addDamage(40);
        assertEquals(40, car.getDamageCost(), 0);
    }

    @Test
    public void canRemoveDamage(){
        car.addDamage(40);
        assertEquals(40, car.removeDamage(), 0);
    }

    @Test
    public void canGetDamagedPrice(){
        car.addDamage(500);
        assertEquals(2800, car.getPrice(), 0);
    }

}
