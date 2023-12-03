package w13;

public class OverridingMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.getNumberOfLegs();
        dog.eat();

        Animal animal = new Animal();
        animal.makeSound();
    }
}
class Animal{
    public void makeSound(){
        System.out.println("Animal is making sound");
    }
    public void getNumberOfLegs(){
        System.out.println("4 legs");
    }
    public void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog is barking");
    }
}
