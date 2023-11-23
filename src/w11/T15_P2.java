package w11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T15_P2 {

        public static Map<Integer, Integer> groupAndCountMapValues(Map<String, List<String>> inputMap) {
            Map<Integer, Integer> result = new HashMap<>();

            for (List<String> valueList : inputMap.values()) {
                for (String str : valueList) {
                    int length = str.length();
                    result.put(length, result.getOrDefault(length, 0) + 1);
                }
            }

            return result;
        }

        // Test or example usage
        public static void main(String[] args) {
            Map<String, List<String>> map1 = new HashMap<>();
            map1.put("first", Arrays.asList("apple", "banana", "car"));
            map1.put("second", Arrays.asList("cat", "dog", "elephant"));
            map1.put("third", Arrays.asList("orange", "pear", "grape", "lemon", "kiwi"));

            Map<Integer, Integer> result = groupAndCountMapValues(map1);

            // Print the result
            System.out.println("Grouped and Counted Map Values:");
            System.out.println(result);
        }
}
