package w11;

import java.util.HashMap;
import java.util.Map;

public class T13_P3_EntrySetMethod {
    public static void printDictionary(Map<String, String> dictionary){
        for(Map.Entry<String, String> map : dictionary.entrySet()){
            System.out.println(map.getKey() + " - " + map.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Apple", "A fruit with a red or yellowish skin and flesh");
        dictionary.put("Sun", "The star around which the Earth orbits");

        printDictionary(dictionary);
    }
}
