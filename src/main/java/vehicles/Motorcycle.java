package vehicles;

import vehicles.vehicle_components.Engine;

public class Motorcycle extends Vehicle implements Sellable{


    public Motorcycle(Engine engine, int tyreThickness, String color, double value) {
        super(engine, 2, tyreThickness, color, value);
    }

    public double getPrice() {
        return (value + value/5) - damageCost;
    }
}
