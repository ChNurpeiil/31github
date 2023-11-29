package w12;

import java.util.ArrayList;
import java.util.List;

public class Collection {

}
class Bar{
    private String name;
    private List<Beverage> beverages;
    private static int totalBars = 0;
    private final int MAX_CAPACITY = 100;

    public Bar(String name, List<Beverage> beverages) {
        this.name = name;
        this.beverages = beverages;
        totalBars++;
    }
    public void addBeverage(Beverage beverage){
        if (beverages.size() < MAX_CAPACITY) {
            beverages.add(beverage);
            System.out.println(beverage.getName() +" added to "+ this.name);
        }else{
            System.out.println("Bar at full capacity, cannot add more beverages.");

        }
    }
    public void serveBeverages(){
        System.out.println("Beverages available at " + name+":");
        for (Beverage beverage : beverages){
            System.out.println("- "+ beverage.getName()+" ($"+beverage.getPrice()+")");
        }
    }
    public String getName(){
        return name;
    }
    public static int getTotalBars(){
        return totalBars;
    }


}
class Beverage{
    private String name;
    private double price;
    private static int totalBeverages = 0;
    private final double MAX_PRICE = 100.0;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
        totalBeverages++;
    }
    public String getName(){
        return name;

    }
    public double getPrice(){
        return price;
    }
    public static int getTotalBeverages(){
        return totalBeverages;
    }

    public static void main(String[] args) {
        List<Beverage> beverages = new ArrayList<>();
        Beverage juice = new Beverage("Orange juice", 7.49);
        beverages.add(juice);

        Bar bar = new Bar("ABC Bar", beverages);

        Beverage beverage1 = new Beverage("Bozo", 5.99);
        Beverage beverage2 = new Beverage("Kymyz", 9.99);

        Bar bar1 = new Bar("XYZ Bar", new ArrayList<>());
        bar1.addBeverage(beverage1);
        bar1.addBeverage(beverage2);

        System.out.println("Bar 1 Name: " + bar.getName());
        System.out.println("Bar 2 Name: "+ bar1.getName());
        System.out.println("Total Bars: "+ Bar.getTotalBars());
        System.out.println("Total Beverages: "+ Beverage.getTotalBeverages());

        bar.addBeverage(beverage2);
        System.out.println();
        bar.serveBeverages();
        System.out.println();
        bar1.serveBeverages();
    }
}
