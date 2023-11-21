package w11;

import java.util.HashMap;
import java.util.Map;

//Description: Write a method called countVowels() that takes a string as input and returns a Map object containing each word as a key and the count of vowels in the word as the corresponding value.
//
//Params: A String sentence with words.
//
//Return: A Map object with word-vowelCount pairs, where the key is the word (String) and the value is the count of vowels (Integer) in the word.
//
//Example:
//
//String sentence = "I have an apple and a banana";
//
//countVowels(sentence); // Returns { "I" : 1, "have" : 2, "an" : 1, "apple" : 2, "and" : 1, "a" : 1, "banana" : 3 }
//
//Note: use HashMap as the order is not requested by the task.
public class T3_P1_PutMethod {
    public static Map<String, Integer> countVowels(String input){
        Map<String, Integer> vowelsCountMap = new HashMap<>();

        if (input != null && !input.isEmpty()){
            String[] words = input.split("\\s");

            for (String word :words) {
                int count =countVowelsInWord(word);
                vowelsCountMap.put(word, count);
            }
        }
        return vowelsCountMap;
    }

    private static int countVowelsInWord(String word){
        int vowelCount = 0;
        String lowerCaseWord  = word.toLowerCase();
        for (int i =0; i< lowerCaseWord.length(); i++){
            char ch = lowerCaseWord.charAt(i);
            if (ch == 'a' || ch == 'e' || ch =='o' ||ch == 'u' ||ch =='i'){
                vowelCount++;
            }
        }
        return vowelCount;
    }
    public static void main(String[] args) {
        String sentence = "I have an apple and a banana";
        Map<String, Integer> result = countVowels(sentence);
        System.out.println(result);
    }
}
