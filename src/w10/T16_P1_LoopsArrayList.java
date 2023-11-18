package w10;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//Write a method called manipulateStrings() that takes an ArrayList of Strings (ArrayList<String>) as parameter. The method should iterate through each string in the list and perform a specific operation based on the length of the string. The operations are as follows:
//
//For strings with length less than 5, convert them to uppercase.
//
//For strings with length between 5 and 10 (inclusive), reverse the string.
//
//For strings with length greater than 10, remove the vowels from the string. You can use String's replaceAll() method, for example: str.replaceAll("[aeiouAEIOU]", "") or any other convenient way.
//
//The method should print the each manipulated string.
//
//Return Type: void
//
//Example #1:
//
//Parameter:
//
//ArrayList<String> words = {"air", "world", "programming", "java", "openai"}
//
//Output:
//
//AIR
//dlrow
//prgrmmng
//JAVA
//ianepo
//
//Note:
//
//You can assume that the input ArrayList will not be null.
//
//The operations are applied in the order described above. Use if-else statements to complete them.
public class T16_P1_LoopsArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("air");
        words.add("world");
        words.add("programming");
        words.add("java");
        words.add("openai");

        manipulateStrings(words);
    }

    public static void manipulateStrings(ArrayList<String> words) {
        for (String word : words){
            int length = word.length();

            if (length < 5){
                System.out.println(word.toUpperCase());
            } else if (length >= 5 || length <= 10) {
                System.out.println(reverseString(word));
            }else {
                System.out.println(removeVowels(word));
            }
        }
    }

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static String removeVowels(String str){
        return  str.replaceAll("[aeiouAEIOU]", "");
    }
}
