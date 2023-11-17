package w10;

import java.util.ArrayList;
import java.util.List;

public class T13_P2_ArrayListSizeMethod {
    //    Description: Write a method called filterWords() that takes a String array as input. The method should filter out the words that meet either of the following conditions:
//
//Words that have a length greater than 5 characters
//
//Words that contain between one and three (inclusive) special characters (non-alphanumeric characters)
//
//Params: A String array.
//
//Return: A List containing the filtered words.
//
//Example:
//
//String[] words = {"Hello", "World!", "JS", "@OpenAI", "Chatbot", "Test123", "$$", "!^$#"};
//
//filterWords(words); // Returns ["World!", "@OpenAI", "Chatbot", "Test123", "$$"]
//
//Note:
//
//Special characters include any non-alphanumeric characters (e.g., symbols, punctuation marks).
//
//The order of elements should be maintained.
//
//If no elements are found, an empty ArrayList should be returned.
//
//The comparison should be case-sensitive.
    public static void main(String[] args) {
        String[] words = {"Hello", "World!", "JS", "@OpenAI", "Chatbot", "Test123", "$$", "!^$#"};
        List<String> filteredWords = filterWords(words);
        System.out.println(filteredWords); // Output the filtered list
    }

    public static List<String> filterWords(String[] words) {
    List<String> filteredList = new ArrayList<>();
        for (String word : words) {
            if (word.length() > 5 || countSpecialCharacters(word) > 0 && countSpecialCharacters(word) <= 3) {
                filteredList.add(word);
            }
        }

        return filteredList;
    }

    private static int countSpecialCharacters(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }
        return count;

    }
}
