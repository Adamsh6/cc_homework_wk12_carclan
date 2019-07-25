package vehicles;

import vehicles.vehicle_components.Engine;

public class Car extends Vehicle implements Sellable, Rentable{


    public Car(Engine engine, int tyreThickness, String color, double value) {
        super(engine, 4, tyreThickness, color, value);
    }

    public double getPrice() {
        return (value + (value / 10)) - damageCost;
    }

    public double getDailyCost() {
        return value / 50;
    }

    public double getFullRentalCost(int noOfDays) {
        return (noOfDays * getDailyCost()) + 50;
    }
}
