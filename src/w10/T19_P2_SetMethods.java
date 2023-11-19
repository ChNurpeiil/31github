package w10;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class T19_P2_SetMethods {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("avocado");

        Set<String> str =returnTreeSet(fruits);
        System.out.println(str);
    }
    public static Set<String> returnTreeSet(ArrayList<String> input){
        TreeSet<String > str = new TreeSet<>(input);
        return str;
    }
}
