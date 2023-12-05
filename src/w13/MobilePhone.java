package w13;

public class MobilePhone {
    static int lastId;
    int id;
    String brand;
    String model;
    double price;
    int year;

    public MobilePhone(String brand, String model, double price, int year) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }
    public String toString(){
        return String.format("MobilePhone: {brand=%s, model=%s, price=%.2f$, year=%d}",
                brand, model, price, year);    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 999.99, 2021);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 12", 1099.99, 2021);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
    }
}
