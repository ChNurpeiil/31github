package w10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class T19_P3_SetMethods {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("avocado");

        Set<String> str =returnLinkedHashSet(fruits);
        System.out.println(str);
    }
    public static Set<String> returnLinkedHashSet(ArrayList<String> input){
        Set<String> str = new LinkedHashSet<>(input);
        return str;
    }
}
