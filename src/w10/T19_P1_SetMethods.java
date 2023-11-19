package w10;

import java.util.ArrayList;
import java.util.HashSet;

public class T19_P1_SetMethods {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("avocado");

        HashSet<String> str =returnHash(fruits);
        System.out.println(str);
    }
    public static HashSet<String> returnHash(ArrayList<String> input){
        HashSet<String> str = new HashSet<>(input);
        return str;
    }
}
