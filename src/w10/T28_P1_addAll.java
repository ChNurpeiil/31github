package w10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Create a static method named filterDuplicates() that takes a Set<String> as a first parameter of a first set of words and a Set<String> as a second parameter of a second set of words. This method should remove duplicate entries using addAll() method, leaving only unique elements of them. After processing, return the modified Set<String>.
//
//Example #1:
//
//Parameters:
//
//Set<String> set1 = {"apple", "banana", "cherry"}
//Set<String> set2 = {"apple", "blueberry", "carrot"}
//
//Return: Set<String>
//
//{"banana", "apple", "cherry", "blueberry", "carrot"}
public class T28_P1_addAll {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "banana", "cherry"));
        Set<String> set2 = new HashSet<>(Arrays.asList("apple", "blueberry", "carrot"));
        System.out.println(filterDuplicates(set1,set2));
    }

    public static Set<String> filterDuplicates(Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
