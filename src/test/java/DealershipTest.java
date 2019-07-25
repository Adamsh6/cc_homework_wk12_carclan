import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.vehicle_components.Engine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Motorcycle motorcycle;
    Customer customer;
    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine(500);
        dealership = new Dealership(40000);
        car = new Car(engine, 2, "Blue", 10000);
        motorcycle = new Motorcycle(engine, 4, "Red", 20000);
        customer = new Customer(25000);
    }

    @Test
    public void dealershipStartsWithNoStock(){
        assertEquals(0, dealership.getStockAmount());
    }

    @Test
    public void dealershipCanBuyCar(){
        dealership.buyVehicle(car);
        assertEquals(1, dealership.getStockAmount());
        assertEquals(30000, dealership.getTill(), 0);
    }

    @Test
    public void customerCanBuyCar(){
        dealership.buyVehicle(car);
        dealership.sellVehicle(customer, car);
        assertEquals(0, dealership.getStockAmount());
        assertNotNull(customer.getVehicle());
        assertEquals(14000, customer.getMoney(), 0);
        assertEquals(41000, dealership.getTill(), 0);
    }

    @Test
    public void customerCanRentCar(){
        dealership.buyVehicle(car);
        dealership.rentVehicle(customer, car, 2);
        assertEquals(24550, customer.getMoney(), 0);
        assertEquals(30450, dealership.getTill(), 0);
        assertEquals(0, dealership.getStockAmount());
        assertEquals(1, dealership.getRentedAmount());
        assertNotNull(customer.getBookedVehicle());
    }

    @Test
    public void dealerCanRepairCar(){
        dealership.buyVehicle(car);
        car.addDamage(1000);
        dealership.repair(car);
        assertEquals(29000, dealership.getTill(), 0);
        assertEquals(0, car.getDamageCost(), 0);
    }
}
