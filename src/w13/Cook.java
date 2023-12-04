package w13;

public class Cook {
    String name;
    int time;

    public Cook(String name, int time) {
        this.name = name;
        this.time = time;
    }
    public void cookFood(){
        System.out.println("Cooking "+ name+" for "+ time+" minutes.");

    }
}
class Chef extends Cook{
    public Chef(String name, int time) {
        super(name, time);
    }

    public void cookFood(){
    }
}
class Baker extends Cook{
    public Baker(String name, int time) {
        super(name, time);
    }

    public void cookFood(){
    }

    public static void main(String[] args) {
        // Create instances and test cookFood() method
        System.out.println("\nTesting cookFood() method:");
        Cook chef = new Chef("Pasta", 90);
        chef.cookFood(); // Output: Cooking Pasta for 90 minutes.
        System.out.println("Chef's dish: " + chef.name + ", Time: " + chef.time);

        Cook baker = new Baker("Cake", 180);
        baker.cookFood(); // Output: Baking Cake for 180 minutes.
        System.out.println("Baker's dish: " + baker.name + ", Time: " + baker.time);
    }
}
