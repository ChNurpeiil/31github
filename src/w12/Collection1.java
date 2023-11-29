package w12;

import java.util.HashMap;
import java.util.Map;

public class Collection1 {
}
class Kitchen{
    private Map<Veges,Double> vegesInventory;
    private Map<Fruits, Double> fruitInventory;


    public Kitchen(){
        vegesInventory = new HashMap<>();
        fruitInventory = new HashMap<>();
    }

    public void addVegetable(Veges vege, double weight){

        vegesInventory.put(vege, weight);
    }
    public void addFruit(Fruits fruits, double weight){
        fruitInventory.put(fruits, weight);
    }
    public void removeVegetable(Veges vege){
        vegesInventory.remove(vege);
    }
    public void removeFruit(Fruits fruits){
        fruitInventory.remove(fruits);
    }
    public Map<Veges, Double> getVegesInventory(){
        return vegesInventory;
    }
    public Map<Fruits, Double> getFruitInventory(){
        return fruitInventory;
    }
}
class Veges{
    private String name;
    private final String arrivalTime;
    private final String expireDate;

    public Veges(String name, String arrivalTime, String expireDate) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }
    public String getName(){
        return name;
    }
    public String getArrivalTime(){
        return arrivalTime;
    }
    public String getExpireDate(){
        return expireDate;
    }

}
class Fruits{
    private String name;
    private final String arrivalTime;
    private final String expireDate;

    public Fruits(String name, String arrivalTime, String expireDate) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }
    public String getName(){
        return name;
    }
    public String getArrivalTime(){
        return arrivalTime;
    }
    public String getExpireDate(){
        return expireDate;
    }

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        Veges tomato = new Veges("Tomato", "2023-06-24", "2023-06-30");
        Veges cucumber = new Veges("Cucumber", "2023-06-25", "2023-07-01");

        Fruits apple = new Fruits("Apple", "2023-06-24", "2023-07-01");
        Fruits banana = new Fruits("Banana", "2023-06-25", "2023-07-02");


        kitchen.addVegetable(tomato, 2.5);
        kitchen.addVegetable(cucumber, 1.8);
        kitchen.addFruit(apple, 3.0);
        kitchen.addFruit(banana, 2.0);

        System.out.println("Vegetable Inventory:");
        Map<Veges, Double> vegeInventory = kitchen.getVegesInventory();
            for (Map.Entry<Veges, Double> entry : vegeInventory.entrySet()) {
            Veges vege = entry.getKey();
            double weight = entry.getValue();
            System.out.println("- Name: " + vege.getName());
            System.out.println("  Weight: " + weight + " kg");
            System.out.println("  Arrival Time: " + vege.getArrivalTime());
            System.out.println("  Expire Date: " + vege.getExpireDate());
        }
        System.out.println("\nUpdated Fruit Inventory:");
        Map<Fruits, Double> fruitInventory = kitchen.getFruitInventory();
        for (Map.Entry<Fruits, Double> entry : fruitInventory.entrySet()) {
            Fruits fruit = entry.getKey();
            double weight = entry.getValue();
            System.out.println("- Name: " + fruit.getName());
            System.out.println("  Weight: " + weight + " kg");
            System.out.println("  Arrival Time: " + fruit.getArrivalTime());
            System.out.println("  Expire Date: " + fruit.getExpireDate());
        }    
    }
}
