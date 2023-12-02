package w12;

public class Building {
    private String name;
    private int floors;

    public Building(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    public Building(String name) {
        this(name, 1);
    }

    public String getName() {
        return name;
    }

    public int getFloors() {
        return floors;
    }
}
class House1 extends Building{
    private int bedrooms;

    public House1(String name, int floors, int bedrooms) {
        super(name, floors);
        this.bedrooms = bedrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }
}
class Skyscraper extends Building{
    private int elevators;

    public Skyscraper(String name, int floors, int elevators) {
        super(name, floors);
        this.elevators = elevators;
    }

    public int getElevators() {
        return elevators;
    }

    public static void main(String[] args) {
        // Creating multiple instances and testing behavior
        Building building = new Building("boz yi");
        Building building2 = new Building("Warehouse");
        House1 house2 = new House1("Cottage", 2, 2);
        House1 house = new House1("yi", 1,3);
        Skyscraper skyscraper2 = new Skyscraper("Business Tower", 40, 15);
        Skyscraper skyscraper = new Skyscraper("Oy-bulak",50,2);

        System.out.println();
        System.out.println("Building1:");
        System.out.println("Name: " + building.getName());
        System.out.println("Floors: " + building.getFloors());
        System.out.println();

        System.out.println("Building2:");
        System.out.println("Name: " + building2.getName());
        System.out.println("Floors: " + building2.getFloors());
        System.out.println();

        System.out.println("House1:");
        System.out.println("Name: " + house.getName());
        System.out.println("Floors: " + house.getFloors());
        System.out.println("Bedrooms: " + house.getBedrooms());
        System.out.println();

        System.out.println("House2:");
        System.out.println("Name: " + house2.getName());
        System.out.println("Floors: " + house2.getFloors());
        System.out.println("Bedrooms: " + house2.getBedrooms());
        System.out.println();

        System.out.println("Skyscraper1:");
        System.out.println("Name: " + skyscraper.getName());
        System.out.println("Floors: " + skyscraper.getFloors());
        System.out.println("Elevators: " + skyscraper.getElevators());
        System.out.println();

        System.out.println("Skyscraper2:");
        System.out.println("Name: " + skyscraper2.getName());
        System.out.println("Floors: " + skyscraper2.getFloors());
        System.out.println("Elevators: " + skyscraper2.getElevators());
    }
}
