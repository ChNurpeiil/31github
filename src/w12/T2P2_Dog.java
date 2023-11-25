package w12;

import java.util.SplittableRandom;

public class T2P2_Dog {
    String name;
    int age;

    public T2P2_Dog(String nameParam, int ageParam){
        name= nameParam;
        age = ageParam;
    }
    public T2P2_Dog(int ageParam, String nameParam){
        age= ageParam;
        name= nameParam;
    }
}
class Main1 {
    public static void main(String[] args) {

    }

    public static void main() {
        System.out.println("This is the overloaded main method");
        T2P2_Dog dog = new T2P2_Dog("Ak-tosh", 5);
        T2P2_Dog dog1 = new T2P2_Dog(2, "Kireshe");
        System.out.println(dog);
        System.out.println(dog1);

        // come back again
    }


}
