package vehicles;

import vehicles.vehicle_components.Engine;
import vehicles.vehicle_components.Tyre;
import java.util.ArrayList;

public abstract class Vehicle implements Sellable{

    Engine engine;
    ArrayList<Tyre> tyres;
    String color;
    double value;
    double damageCost;

    public Vehicle(Engine engine, int noOfTyres, int tyreThickness, String color, double value) {
        this.engine = engine;
        this.tyres = makeTyres(noOfTyres, tyreThickness);
        this.color = color;
        this.value = value;
        this.damageCost = 0;
    }

    public double getValue() {
        return value;
    }

    private ArrayList<Tyre> makeTyres(int noOfTyres, int tyreThickness){
        ArrayList<Tyre> tyres = new ArrayList<Tyre>();
        for(int i = 0; i < noOfTyres; i++){
            Tyre tyre = new Tyre(tyreThickness);
            tyres.add(tyre);
        }
        return tyres;
    }

    public int getNoOfTyres(){
        return tyres.size();
    }

    public String getColor() {
        return color;
    }

    public double getDamageCost(){
        return damageCost;
    }

    public void addDamage(double damageCost){
        this.damageCost += damageCost;
    }

    public double removeDamage(){
        double cost = this.damageCost;
        this.damageCost = 0;
        return cost;
    }


}
