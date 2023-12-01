package w12;

public class Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Lion");
        animal.setAge(5);

        Cat cat = new Cat();
        cat.setName("Java");
        cat.setAge(1);

        Animal animal2 = new Animal();
        animal2.setName("Elephant");
        animal2.setAge(-2);

        System.out.println();
        System.out.println("Animal 1:");
        animal.makeSound();
        System.out.println();

        System.out.println("Animal 2:");
        animal2.makeSound();
        System.out.println();

        System.out.println("Cat 1:");
        cat.makeSound();
        System.out.println();
    }

    private String name;
    private int age;

//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be less than 0");
        }else {
            this.age = age;
        }
    }
    public void makeSound(){
        System.out.println( getName()+ " at age "+ getAge()+ " makes a sound");
    }
}
class Cat extends Animal{

}

