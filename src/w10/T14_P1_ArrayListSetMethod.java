package w10;

import java.util.ArrayList;
import java.util.List;

public class T14_P1_ArrayListSetMethod {
    //    Description: Write a method called checkPalindromeWords() that takes an ArrayList of strings as input. The method should iterate through the list and check if each string is a palindrome (reads the same forward and backward). The method should return a list with corresponding boolean value indicating whether the string from the list is palindrome or not.
//
//Params: An ArrayList of Strings.
//
//Return: A List of boolean values indicating whether strings in the list are palindromes.
//
//Example:
//
//ArrayList<String> words = {"level", "radar", "solar", "hello"}
//
//checkPalindromeWords(words) // Return {true, true, false, false}
//
//Note:
//
//A palindrome is a word that reads the same forward and backward.
//
//Empty strings and single-character strings are considered palindromes.
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("level");
        words.add("radar");
        words.add("solar");
        words.add("hello");

        List<Boolean> palindromeResults = checkPalindromeWords(words);
        System.out.println(palindromeResults);
    }

    public static List<Boolean> checkPalindromeWords(ArrayList<String> words) {
        List<Boolean> palindromeList = new ArrayList<>();

        for (String word : words) {
            boolean isPalindrome = isPalindrome(word);
            palindromeList.add(isPalindrome);
        }

        return palindromeList;
    }

    private static boolean isPalindrome(String word) {
        if (word.isEmpty() || word.length() == 1) {
            return true;
        }

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
}
