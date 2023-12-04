package w13;

public class Cloth {
    String brand;
    double price;

    public Cloth(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price:" + price);
    }

    public final void wash() {
        System.out.println("Washing instructions: Gentle cycle, cold water");
    }
}

class TShirt extends Cloth {
    String size;

    public TShirt(String brand, double price, String size) {
        super(brand, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }

    public static void main(String[] args) {
        Cloth cloth1 = new Cloth("Generic Brand", 19.99);
        TShirt tShirt1 = new TShirt("Nike", 29.99, "M");
        TShirt tShirt2 = new TShirt("Adidas", 39.99, "L");

        cloth1.displayInfo();
        tShirt1.displayInfo();
        tShirt2.displayInfo();
        cloth1.wash();
        tShirt1.wash();
        tShirt2.wash();
    }
}