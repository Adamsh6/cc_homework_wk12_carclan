import vehicles.Car;
import vehicles.Rentable;
import vehicles.Vehicle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Dealership {

    private int till;
    private ArrayList<Vehicle> stock;
    private HashMap<Rentable, Customer> rentals;

    public Dealership(int till) {
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
        this.rentals = new HashMap<Rentable, Customer>();
    }

    public void buyVehicle(Vehicle vehicle){
        this.till -= vehicle.getValue();
        this.stock.add(vehicle);
    }

    public int getTill() {
        return till;
    }

    public int getStockAmount(){
        return this.stock.size();
    }

    public int getRentedAmount(){
        return this.rentals.size();
    }

    public void sellVehicle(Customer customer, Vehicle vehicle) {
        customer.loseMoney(vehicle.getPrice());
        this.till += vehicle.getPrice();
        this.stock.remove(vehicle);
        customer.setVehicle(vehicle);
    }

    public void rentVehicle(Customer customer, Vehicle vehicle, int days){
        Rentable rental = (Rentable) vehicle;
        customer.loseMoney(rental.getFullRentalCost(days));
        this.till += rental.getFullRentalCost(days);
        this.stock.remove(vehicle);
        customer.setBookedVehicle(vehicle);
        rentals.put(rental, customer);
    }

    public void repair(Vehicle vehicle) {
        this.till -= vehicle.removeDamage();
    }
}
