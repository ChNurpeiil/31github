package w11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Description: Implement a method called sortWordsIntoCategories() that takes a string as input. The method should sort the words in the input string into four different categories based on certain criteria. The categories are: "Has Uppercase", "All Lowercase", "Has Special Character", and "Has Digit". Each word in the input string should be checked against these criteria and assigned to the appropriate category. The method should return a Map object where the keys represent the category names and the values are lists of strings containing the words that belong to each category.
//
//Params: A string representing the input.
//
//Return: A Map object where the keys are the category names (strings) and the values are lists of strings containing the words that belong to each category.
//
//Example:
//
//Input: "Hello, World! OpenAI 2023"
//
//Output: { "Has Uppercase" : ["Hello", "World", "OpenAI"], "All Lowercase" : [], "Has Special Character" : ["Hello,", "World!"], "Has Digit" : ["2023"] }
//
//Note:
//
//Each word should be considered individually and categorized based on the provided criteria.
//
//A word can belong to multiple categories if it meets the criteria for multiple categories.
//
//The order of the words within each category is not important.
//
//The words should be considered case-sensitive, meaning "Hello" and "hello" would be treated as different words.
public class T14_P2_MapList {
    public static Map<String, List<String>> sortWordsIntoCategories(String input) {
        Map<String, List<String>> categorizedWords = new HashMap<>();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Initialize categories
        categorizedWords.put("Has Uppercase", new ArrayList<>());
        categorizedWords.put("All Lowercase", new ArrayList<>());
        categorizedWords.put("Has Special Character", new ArrayList<>());
        categorizedWords.put("Has Digit", new ArrayList<>());

        // Categorize words based on criteria
        for (String word : words) {
            if (word.matches(".*[A-Z].*")) {
                categorizedWords.get("Has Uppercase").add(word);
            }
            if (word.matches("[a-z]+")) {
                categorizedWords.get("All Lowercase").add(word);
            }
            if (word.matches(".*[^a-zA-Z0-9\\s].*")) {
                categorizedWords.get("Has Special Character").add(word);
            }
            if (word.matches(".*\\d.*")) {
                categorizedWords.get("Has Digit").add(word);
            }
        }

        return categorizedWords;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "Hello, World! OpenAI 2023";
        Map<String, List<String>> result = sortWordsIntoCategories(input);

        System.out.println("Output:");
        for (Map.Entry<String, List<String>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
