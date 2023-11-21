package w10;

import java.util.Set;

public class T25_P2 {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("apple", "application", "aptitude");
        Set<String> set2 = Set.of("application", "apple", "appium", "appointment");
        Set<String> set3 = Set.of("Disrupt", "Disable", "Disapprove", "Dismiss");
        Set<String> set4 = Set.of("Disrupt", "Disable", "Disapprove", "dismiss");

        System.out.println("Longest common prefix in set1: " + findLongestCommonPrefix(set1));
        System.out.println("Longest common prefix in set2: " + findLongestCommonPrefix(set2));
        System.out.println("Longest common prefix in set3: " + findLongestCommonPrefix(set3));
        System.out.println("Longest common prefix in set4: " + findLongestCommonPrefix(set4));

    }
    public static String findLongestCommonPrefix(Set<String> set) {
        if (set.isEmpty()) {
            return ""; // If the set is empty, return an empty string
        }

        String[] strings = set.toArray(new String[0]);
        String firstString = strings[0];

        for (int i = 0; i < firstString.length(); i++) {
            char currentChar = firstString.charAt(i);

            // Check if the current character is common among all strings
            for (int j = 1; j < strings.length; j++) {
                if (i >= strings[j].length() || strings[j].charAt(i) != currentChar) {
                    return firstString.substring(0, i); // Return the common prefix found so far
                }
            }
        }

        return firstString; // If no differences found, return the entire first string
    }
}
