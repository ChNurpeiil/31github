package w11;

import java.util.*;

public class T12_P5_ValuesMethod {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "grapefruit");
        map.put(5, "Orange");
        map.put(6, "Pineapple");
        String[] result1 = searchValue(map, "an");
        System.out.println(Arrays.toString(result1)); // Output: [Banana, Orange]

        String[] result2 = searchValue(map, "E");
        System.out.println(Arrays.toString(result2)); // Output: [Apple, Cherry, grapefruit, Orange, Pineapple]

        String[] result3 = searchValue(map, "kiwi");
        System.out.println(Arrays.toString(result3)); // Output: [] }

    }

    public static String[] searchValue(Map<Integer, String> map, String value) {
        List<String> resultList = new ArrayList<>();

        for (String entryValue : map.values()) {
            if (entryValue.toLowerCase().contains(value.toLowerCase())) {
                resultList.add(entryValue);
            }
        }
        return resultList.toArray(new String[0]);
    }
}
