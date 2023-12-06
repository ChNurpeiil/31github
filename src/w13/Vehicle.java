package w13;

public abstract class Vehicle {
    String brand;
    double fuelCapacity;

    public Vehicle(String brand, double fuelCapacity) {
        this.brand = brand;
        this.fuelCapacity = fuelCapacity;
    }
    abstract void start();
    abstract void stop();

    double fuelEfficiency(double distanceTraveled, double fuelConsumed){
        return distanceTraveled/fuelConsumed;
    }
}
abstract class TwoWheeler extends Vehicle{
    double enginePower;

    public TwoWheeler( double enginePower) {
        super("", 0);
        this.enginePower = enginePower;
    }
    abstract void balance();

    double calculateMaxSpeed(){
        return 2.5 * enginePower;
    }
}
class Bike extends TwoWheeler{
    int gears;
    public Bike(String brand, double fuelCapacity, double enginePower, int gears) {
        super(enginePower);
        this.brand=brand;
        this.fuelCapacity= fuelCapacity;
        this.gears= gears;
    }
    @Override
    void start(){
        System.out.println("Starting the bike...");
    }
    void stop(){
        System.out.println("Stopping the bike...");
    }
    void balance(){
        System.out.println("Balance the bike...");
    }
    @Override
    double calculateMaxSpeed(){
        return super.calculateMaxSpeed();
    }

    public static void main(String[] args) {
        Bike bike = new Bike("Honda", 10.0, 250.0, 5);

        bike.start();
        bike.stop();
        bike.balance();

        double fuelEfficiency = bike.fuelEfficiency(100.0, 5.0);
        System.out.println("Fuel Efficiency: " + fuelEfficiency);

        double maxSpeed = bike.calculateMaxSpeed();
        System.out.println("Max Speed: " + maxSpeed);
    }

}
