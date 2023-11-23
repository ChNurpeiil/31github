package w11;

import java.util.*;

public class T15_P1 {
    public static Map<String, List<Integer>> sortAndFilterMap(Map<String, List<Integer>> inputMap) {
        Map<String, List<Integer>> result = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : inputMap.entrySet()) {
            List<Integer> values = entry.getValue();

            // Sort the list in ascending order
            Collections.sort(values);

            // Filter out numbers divisible by 3
            List<Integer> filteredList = new ArrayList<>();
            for (int value : values) {
                if (value % 3 != 0) {
                    filteredList.add(value);
                }
            }

            result.put(entry.getKey(), filteredList);
        }

        return result;
    }

    // Test or example usage
    public static void main(String[] args) {
        Map<String, List<Integer>> inputMap = new HashMap<>();
        inputMap.put("Key1", Arrays.asList(9, 2, 6, 8, 15, 4));
        inputMap.put("Key2", Arrays.asList(3, 12, 5, 7, 10));
        inputMap.put("Key3", Arrays.asList(1, 6, 9, 18, 21, 4));

        Map<String, List<Integer>> result = sortAndFilterMap(inputMap);

        // Print the result
        System.out.println("Filtered and Sorted Map:");
        for (Map.Entry<String, List<Integer>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
