package w10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Description: Write a method called compareWordCollections() in Java that takes two strings as parameters. The method should collect all unique words from each string separately. If the first collection of unique words contains every word from the second collection, the method should return an empty array of strings. Otherwise, it should return an array containing the common elements from each collection.
//
//Params: First String, second String.
//
//Return: An array of Strings.
//
//Example:
//
//String str1 = "Each word here is prepared to practice Collections"
//
//String str2 = "Collections word is here"
//
//compareWordCollections(str1, str2) //Returns []
//
//String str3 = "Some word is here"
//
//compareWordCollections(str1, str3) //Returns [here, is, word]
public class T29_P1_removeAll {
    public static void main(String[] args) {
        String str1 = "Each word here is prepared to practice Collections";
        String str2 = "Collections word is here";
        String[] result1 = compareWordCollections(str1, str2);
        System.out.println(Arrays.toString(result1)); // Returns []

        String str3 = "Some word is here";
        String[] result2 = compareWordCollections(str1, str3);
        System.out.println(Arrays.toString(result2)); // Returns [word, here, is]

    }
    public static String[] compareWordCollections(String str1, String str2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(str1.split("\\s+")));
        Set<String> set2 = new HashSet<>(Arrays.asList(str2.split("\\s+")));

        if (set1.containsAll(set2)) {
            return new String[]{};
        } else {
            set1.retainAll(set2);
            return set1.toArray(new String[0]);
        }
    }

}
