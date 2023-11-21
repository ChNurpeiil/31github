package w11;

import java.util.*;

public class T2_P1 {
    public static void main(String[] args) {
        Map<Character, String> myMap = createMap();
        System.out.println(myMap);

        Map<Integer, Double> myMap1 = createMap1();
        System.out.println(myMap1);

        Map<String, Boolean> myMap2 = createMap2();
        System.out.println(myMap2);
    }

    public static Map<Character, String> createMap() {
        return new HashMap<>();
    }
    public static LinkedHashMap<Integer, Double> createMap1(){
        return new LinkedHashMap<>();
    }
    public static TreeMap<String , Boolean> createMap2(){
        return new TreeMap<>();
    }

}
