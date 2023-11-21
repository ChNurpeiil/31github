package w10;

import java.util.HashSet;
import java.util.Set;

//Create a Java static method findCommonWords() that takes as parameters two sets of words (Set<String>) as input and determines and prints the words that appear in both sets using the retainAll() method. The program should return the common words found in both sets as a Set<string>.
//
//Example:
//
//Parameters:
//
//Set<String> set1 = {"apple", "banana", "cherry", "date"}
//Set<String> set2 = {"banana", "date", "grape", "kiwi"}
//
//Return: Set<String>
//
//{"banana", "date"}
public class T27_P1_retainAllMethod {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("orange");
        set1.add("banana");

        Set<String> set2 = new HashSet<>();
        set2.add("orange");
        set2.add("kiwi");
        set2.add("banana");

        Set<String> commonWords = findCommonWords(set1, set2);
        System.out.println("Common words: " + commonWords);
    }
    public static Set<String> findCommonWords(Set<String> set1, Set<String> set2){
        Set<String>  result= new HashSet<>(set1);

        result.retainAll(set2);
        return result;

    }
}
