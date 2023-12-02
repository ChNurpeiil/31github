package w12;

public class Device {
    private String brand;
    private String model;
    private double price;

    public Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Device(String brand, String model ) {
        this.brand = brand;
        this.model = model;
        this.price= 0.0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
class Laptop extends Device{
    private double screenSize;

    public Laptop(String brand, String model, double price, double screenSize) {
        super(brand, model, price);
        this.screenSize = screenSize;
    }

    public Laptop(String brand, String model, double screenSize) {
        super(brand, model);
        this.screenSize = screenSize;

    }

    public double getScreenSize() {
        return screenSize;
    }
}
class Smartphone extends Device{
    private String operatingSystem;

    public Smartphone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }

    public Smartphone(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public static void main(String[] args) {
        // Create instances of Device, Laptop, and Smartphone
        Device device = new Device("Brand", "Model", 100.0);
        Laptop laptop = new Laptop("Brand", "Model", 200.0, 15.6);
        Smartphone smartphone = new Smartphone("Brand", "Model", 300.0, "Android");


        // Testing constructors and methods
        System.out.println();
        System.out.println("Device:");
        System.out.println("Brand: " + device.getBrand());
        System.out.println("Model: " + device.getModel());
        System.out.println("Price: " + device.getPrice());

        System.out.println();
        System.out.println("Laptop:");
        System.out.println("Brand: " + laptop.getBrand());
        System.out.println("Model: " + laptop.getModel());
        System.out.println("Price: " + laptop.getPrice());
        System.out.println("Screen Size: " + laptop.getScreenSize());

        System.out.println();
        System.out.println("Smartphone:");
        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Model: " + smartphone.getModel());
        System.out.println("Price: " + smartphone.getPrice());
        System.out.println("Operating System: " + smartphone.getOperatingSystem());
    }
}
