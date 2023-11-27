package w12;

public class T5P2_Furniture {
    public  String type;
    public  double price;
    private  String material;
    private  String brand;

    public T5P2_Furniture(String type, double price, String material, String brand) {
        this.type = type;
        this.price = price;
        this.material = material;
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }
    public String getBrand(){
        return brand;
    }
}
class Main5{
    public static void main(String[] args) {
        T5P2_Furniture chair = new T5P2_Furniture("Chair", 59.99, "Wood", "ABC Furniture");
        System.out.println(chair.type);
        System.out.println(chair.price);
        System.out.println(chair.getMaterial());
        System.out.println(chair.getBrand());
    }
}
