package w12;

public class Animal20 {
    private String species;

    public Animal20(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}
class Mammal extends Animal20{
    private int numOfLegs;

    public Mammal(String species, int numOfLegs) {
        super(species);
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }
}
class Dog20 extends Mammal{
    private String name;

    public Dog20(String species, int numOfLegs, String name) {
        super(species, numOfLegs);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Animal20 animal = new Animal20("Unknown");
        Mammal mammal = new Mammal("Horse", 4);
        Dog20 dog = new Dog20("Canine", 4,"Buddy");

        System.out.println("Animal Species: " + animal.getSpecies());
        System.out.println();
        System.out.println("Mamal Species: "+ mammal.getSpecies());
        System.out.println("Number of legs: "+ mammal.getNumOfLegs());
        System.out.println();
        System.out.println("Dog Species: " + dog.getSpecies());
        System.out.println("Dog of Legs: "+ dog.getNumOfLegs());
        System.out.println("Dog Name: "+ dog.getName());
    }
}
