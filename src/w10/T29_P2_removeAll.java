package w10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Create a Java program with a static method called filterUniqueElements() that takes two Set<String> as parameters: one set containing a list of words and another set containing stop words (common words to be excluded). The method should use the retainAll() method to filter out containing only the unique words that are not present in the stop words set and removeAll() method. Return the filtered Set<String>.
//
//Example:
//
//Parameters:
//
//Set<String> setOfWords = {"apple", "banana", "cherry", "date", "fig"}
//Set<String> setOfStopWords = {"apple", "banana", "date", "grape"}
//
//Return: Set<String>
//
//{"cherry", "fig"}
public class T29_P2_removeAll {
    public static void main(String[] args) {
        Set<String> setOfWords= new HashSet<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        Set<String> setOfStopWords= new HashSet<>(Arrays.asList("apple", "banana", "date", "grape"));
        System.out.println(filterUniqueElements(setOfWords, setOfStopWords));
    }
    public static Set<String> filterUniqueElements(Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
