package w11;

import java.util.HashMap;
import java.util.Map;

//Description: Write a method called countWordFrequency() that takes a String as input and returns a Map object containing each word as a key and its frequency as the corresponding value.
//
//Params: A String sentence with words.
//
//Return: A Map object with word-frequency pairs where the key is String and the value is Integer.
//
//Example:
//
//String words = "apple banana apple orange banana apple"
//
//countWordFrequency(words); // Returns { "apple" : 3, "banana" : 2, "orange" : 1 }
//
//Note: Use HashMap to store the result as the ordering is not requested by the task.
public class T4_P1_GetMethod {
    public static Map<String, Integer> countWordFrequency(String input){
        Map<String, Integer> countWord = new HashMap<>();

        if (input != null && !input.isEmpty()){
            String[] words = input.split("\\s");

            for (String word : words){
                countWord.put(word, countWord.getOrDefault(word,0) +1);
            }

        }
        return countWord;
    }

    public static void main(String[] args) {
        String words = "apple banana apple orange banana apple";
        Map<String, Integer> result = countWordFrequency(words);
        System.out.println(result);
    }
}
