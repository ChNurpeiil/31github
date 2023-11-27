package w12;

public class T6_Computer {
    private String brand;
    private String model;
    private int year;
    private double price;

    public T6_Computer(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static void main(String[] args) {
        T6_Computer computer = new T6_Computer("Dell", "Inspiron", 2021, 1200.0);
        System.out.println(computer.getBrand());
        System.out.println(computer.getModel());
        computer.setYear(2022);
        computer.setPrice(1400.0);
        System.out.println(computer.year);
        System.out.println(computer.price);
    }
}
