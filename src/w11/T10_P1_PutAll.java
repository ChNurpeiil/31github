package w11;

import java.util.HashMap;
import java.util.Map;

public class T10_P1_PutAll {
    public static Map<String, Boolean> palindromeCheck(String sentence) {
        Map<String, Boolean> palindromeMap = new HashMap<>();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            palindromeMap.put(word, isPalindrome(word));
        }

        return palindromeMap;
    }

    public static Map<String, Boolean> capitalCheck(String sentence) {
        Map<String, Boolean> capitalMap = new HashMap<>();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            capitalMap.put(word, Character.isUpperCase(word.charAt(0)));
        }

        return capitalMap;
    }

    public static Map<String, Boolean> checkWords(String sentence1, String sentence2) {
        Map<String, Boolean> result = new HashMap<>();
        result.putAll(palindromeCheck(sentence1));
        result.putAll(capitalCheck(sentence2));
        return result;
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence1 = "level eye Radar";
        String sentence2 = "OpenAI language model";

        Map<String, Boolean> result = checkWords(sentence1, sentence2);
        System.out.println("Result: " + result);
    }

}
