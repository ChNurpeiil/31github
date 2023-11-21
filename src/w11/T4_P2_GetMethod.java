package w11;

import java.util.HashMap;
import java.util.Map;

//Description: Write a method called checkWordCharacters() that takes a string as input and returns a Map object containing each word as a key and a boolean value indicating whether the word contains uppercase letters, numeric digits, or special characters. The value will be false only if the word consists of lowercase letters only. Whitespace characters should be ignored.
//
//Params: A String representing the sentence.
//
//Return: A Map object with word-character type pairs, where the key is the word (String) and the value is a boolean (true if the word contains uppercase, numeric, or special characters; false if the word consists of lowercase letters only).
//
//Example:
//
//String sentence = "I have 2 apples and 3 bananas!";
//
//checkWordCharacters(sentence); // Returns { "I" : true, "have" : false, "2" : true, "apples" : false, "and" : false, "3" : true, "bananas!" : true }
//
//N
public class T4_P2_GetMethod {
    public static void main(String[] args) {
        String sentence = "I have 2 apples and 3 bananas!";
        Map<String, Boolean> result = checkWordCharacters(sentence);
        System.out.println(result);
    }
    public static Map<String, Boolean> checkWordCharacters(String input){
        Map<String, Boolean> result = new HashMap<>();
        if (!input.isEmpty() && input != null){
            String[] words = input.split("\\s");

            for (String word :words){
                boolean hasSpecial = false;

                for (char ch : word.toCharArray()){
                    if (!Character.isLowerCase(ch) && !Character.isWhitespace(ch)){
                        hasSpecial= true;
                        break;
                    }
                }
                result.put(word, hasSpecial);
            }
        }
        return result;
    }

}
