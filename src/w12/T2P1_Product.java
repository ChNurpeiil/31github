package w12;

public class T2P1_Product {
    String name;
    double price;
    int quantity;

    public T2P1_Product(){
        name = "Unknown";
    }
    public T2P1_Product(String nameParam, double priceParam){
        name= nameParam;
        price= priceParam;
    }
    public T2P1_Product (String nameParam, double priceParam, int quantityParam){
        name= nameParam;
        price=priceParam;
        quantity=quantityParam;
    }
}
class Main{
    public static void main(String[] args) {
        T2P1_Product unknownProduct = new T2P1_Product();
        T2P1_Product laptop = new T2P1_Product("Laptop", 999.99);
        T2P1_Product phone = new T2P1_Product("Phone", 599.99, 10);

        // Displaying product details
        System.out.println("Unknown Product Details:");
        System.out.println("Name: " + unknownProduct.name);
        System.out.println("Price: $" + unknownProduct.price);
        System.out.println("Quantity: " + unknownProduct.quantity);

        System.out.println("\nLaptop Details:");
        System.out.println("Name: " + laptop.name);
        System.out.println("Price: $" + laptop.price);
        System.out.println("Quantity: " + laptop.quantity);

        System.out.println("\nPhone Details:");
        System.out.println("Name: " + phone.name);
        System.out.println("Price: $" + phone.price);
        System.out.println("Quantity: " + phone.quantity);
    }
}
