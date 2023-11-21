package w10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Create a static method named countNonUniqueElements() that takes a Set<String> as a first parameter of a first set of words and a Set<String> as a second parameter of a second set of words and returns the count as Int of elements that appear more than once (i.e., non-unique elements). Your program should efficiently identify and count non-unique elements in the given sets.
//
//Example #1:
//
//Parameters:
//
//Set<String> set1 = {"apple", "banana", "cherry", "pear"}
//Set<String> set2 = {"apple", "blueberry", "pear", "carrot"}
//
//Return: int
//
//2
public class T28_P2_addAll {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "banana", "cherry", "pear"));
        Set<String> set2 = new HashSet<>(Arrays.asList("apple", "blueberry", "pear", "carrot"));
        System.out.println(countNonUniqueElements(set1, set2));
    }

    public static int countNonUniqueElements(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result.size();
    }
}
