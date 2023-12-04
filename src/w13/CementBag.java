package w13;

public class CementBag {
    private String productName;
    private double price;

    public CementBag(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public void displayInfo(){
        System.out.println("Brand: "+ productName +"\nPrice per Bag: $"+price);
    }
    public void use(){
        System.out.println("Usage instructions: Mix with water and other materials for construction.");
    }
}
class ConcreteMix{
    private String productName;
    private double price;
    private String grade;

    public ConcreteMix(String productName, double price, String grade) {
        this.productName = productName;
        this.price = price;
        this.grade = grade;
    }
    public void displayInfo(){
        System.out.println("Brand: "+ productName+ "\nPrice per Bag: $"+ price+"\nStrength Grade: "+ grade);
    }
    public void use(){
        System.out.println("Usage instructions: Mix with water and other materials for construction.");
    }

    public static void main(String[] args) {
        CementBag cementBag1 = new CementBag("Generic Cement", 7.99);
        ConcreteMix concreteMix1 = new ConcreteMix("StrongMix", 14.99, "Grade A");
        ConcreteMix concreteMix2 = new ConcreteMix("SuperStrength", 19.99, "Grade B");

// Display information using displayInfo() method
        cementBag1.displayInfo();
        concreteMix1.displayInfo();
        concreteMix2.displayInfo();
        cementBag1.use();
        concreteMix1.use();
        concreteMix2.use();
    }
}