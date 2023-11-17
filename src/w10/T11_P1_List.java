package w10;

import java.util.ArrayList;
import java.util.List;

public class T11_P1_List {
    //Description: Write a method called lastVowelAndConsonant() that takes a string as input and returns a List of characters containing the first vowel and the last consonant found in the input string.
//
//Params: A string.
//
//Return: A List of characters containing the first vowel and the last consonant found in the input string. If no vowel or consonant is found, return an empty List.
//
//Example:
//
//lastVowelAndConsonant("hello world") // Returns ['e', 'd']
//
//lastVowelAndConsonant("programming") // Returns ['o', 'g']
//
//lastVowelAndConsonant("12345") // Returns []
//
//Note: The vowels are "aeiouAEIOU" and all other alphabetic characters are considered consonants. If the input string is empty, return an empty List.
    public static void main(String[] args) {
        System.out.println(lastVowelAndConsonant("hello world")); // Returns ['e', 'd']
        System.out.println(lastVowelAndConsonant("programming")); // Returns ['o', 'g']
        System.out.println(lastVowelAndConsonant("12345")); // Returns []

    }

    public static List<Character> lastVowelAndConsonant(String input) {
        List<Character> result = new ArrayList<>();
        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        if (input.isEmpty()) {
            return result;
        }

        char lastConsonant = 0;
        for (int i= input.length()-1;i >= 0; i--) {
            char c = input.charAt(i);
            if (Character.isLetter(c) && consonants.indexOf(c) != -1) {
                lastConsonant = c;
                break;
            }
        }
        char firstVowel = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) && vowels.indexOf(c) != -1) {
                firstVowel = c;
                break;
            }
        }
        if (firstVowel != 0) {
            result.add(firstVowel);
        }
        if (lastConsonant != 0) {
            result.add(lastConsonant);
        }
        return result;
    }
}
