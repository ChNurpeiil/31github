package w11;

import java.util.HashMap;
import java.util.Map;

//Description: Create a method called checkDuplicateWords() that takes a string as input and returns a map object where each unique word is the key, and a boolean value indicates whether the word is a duplicate or not. If a word appears more than once in the input string, it will be stored in the map with the value false. Otherwise, if a word is unique, it will be stored with the value true.
//
//Params: A string representing a sentence or text.
//
//Return: A map object with word-duplicate pairs, where the key is the word (String) and the value is a boolean (true for unique, false for duplicate).
//
//Example:
//
//String text = "The cat is on the mat. The dog is on the mat.";
//
//checkDuplicateWords(text); // Returns { "The" : false, "cat" : true, "is" : false, "on" : false, "the" : false, "mat" : false, "dog" : true }
//
//Note: use HashMap as the order is not requested by the task.
public class T5_P1_MapContainsKeyMethod {
    public static Map<String, Boolean> checkDuplicateWords(String input){
        Map<String , Boolean> result = new HashMap<>();

        if (!input.isEmpty() && input !=null){
            String[] words = input.split("\\s");

            for (String word : words){
                String lowerCaseWord = word.toLowerCase();

                if (result.containsKey(lowerCaseWord)){
                    result.put(lowerCaseWord, false);

                }
                else {
                    result.put(lowerCaseWord, true);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "The cat is on the mat. The dog is on the mat.";
        Map<String, Boolean> result = checkDuplicateWords(text);
        System.out.println(result);
    }

}
