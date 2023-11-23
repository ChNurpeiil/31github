package w11;

import java.util.Map;
import java.util.TreeMap;

public class T13_P5_EntrySetMethod {
    public static TreeMap<Integer, String> swapKeysAndValues(TreeMap<String, Integer> input){
        TreeMap<Integer, String> swappedMap = new TreeMap<>();
        for (Map.Entry<String, Integer> var : input.entrySet()){
             swappedMap.put(var.getValue(), var.getKey());
        }
        return swappedMap;
    }
    public static void main(String[] args) {
        // Example usage
        TreeMap<String, Integer> originalMap = new TreeMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);

        TreeMap<Integer, String> swapped = swapKeysAndValues(originalMap);

        System.out.println("Swapped TreeMap:");
        for (java.util.Map.Entry<Integer, String> entry : swapped.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
