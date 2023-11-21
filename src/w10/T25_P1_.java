package w10;

import java.util.*;

//Description: Write a method called commonEl() that takes two sets of Strings. The method should return an array with common elements.
//
//
//
//Params: A Set of Strings, a Set of Strings.
//
//Return: An array of Strings.
//
//
//
//Example:
//
//Set1 = [word1, word3, word5]
//
//Set2 = [word2, word3, word4]
//
//commonEl(Set1, Set2) //Returns [word3]
//
//
//Ex1
//
//Input:
//
//word1 word2 word3 word4
//
//word2 word4 word5 word6
//
//Output: [word2, word4]
public class T25_P1_ {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("word1", "word3", "word5"));
        Set<String> set2 = new HashSet<>(Arrays.asList("word2", "word3", "word4"));

        String[] common = commonEl(set1, set2);
        System.out.println(Arrays.toString(common));
    }
    public static String[] commonEl(Set<String> set1, Set<String> set2) {
        List<String> commonElementsList = new ArrayList<>();

        for (String str : set1) {
            if (set2.contains(str)) {
                commonElementsList.add(str);
            }
        }

        // Convert the List to an array
        String[] commonElements = new String[commonElementsList.size()];
        return commonElementsList.toArray(commonElements);
    }
}
