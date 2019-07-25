import vehicles.Vehicle;

public class Customer {

    private double money;
    private Vehicle vehicle;
    private Vehicle bookedVehicle;

    public Customer(double money) {
        this.money = money;
        this.vehicle = null;
        this.bookedVehicle = null;
    }

    public void loseMoney(double amount){
        this.money -= amount;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setBookedVehicle(Vehicle bookedVehicle) {
        this.bookedVehicle = bookedVehicle;
    }

    public Vehicle getBookedVehicle() {
        return bookedVehicle;
    }

    public double getMoney() {
        return money;
    }
}
