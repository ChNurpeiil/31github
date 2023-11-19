package w10;

import java.util.ArrayList;

//Description: Write a method called countWordsStartingWith() that takes an ArrayList of Strings and a specific letter as input. The method should iterate through the list and count the number of words that start with the given letter (case-insensitive). The method should return the count.
//
//Params:
//
//ArrayList of Strings: The list of words to iterate through.
//
//Specific letter (String): The letter to check for at the beginning of each word.
//
//Return: The count of words that start with the given letter.
//
//Example:
public class T17_P2_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Apple");
        wordList.add("Banana");
        wordList.add("orange");
        wordList.add("Lemon");
        wordList.add("grape");

        String letterToCheck = "a";
        int count = countWordsStartingWith(wordList, letterToCheck);
        System.out.println("Number of words starting with '" + letterToCheck + "': " + count);

    }
    public static int countWordsStartingWith(ArrayList<String> words, String letter){
        int count =0;
        letter= letter.toLowerCase();
        for (String word : words){
            String lowerCaseWord = word.toLowerCase();
            if (lowerCaseWord.startsWith(letter)){
                count++;
            }
        }
        return count;
    }
}
