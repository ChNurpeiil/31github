package w10;

import java.util.Set;

//10.24.1 Finding the Last Element in a Set *
//
//Easy
//
//Write a method called findLast() that takes a set of Strings as a parameter and returns the last element in the set as String.
//
//Parameters:
//
//Set<String> set: The set to find the last element in.
//
//Return:
//
//String: The last element in the set.
//
//Example:
//
//Input:
//
//1, 2, 3, 4, 5, Last Element
//Output:
//
//5
public class T24_P1_LoopSet {
    public static String findLast(Set<String> set){
        String last = null;
         for (String element : set){
             last= element;
         }
         return  last;
    }

    public static void main(String[] args) {
        Set<String> inputSet = Set.of("1", "2", "3", "4", "5", "Last Element");
        String lastElement = findLast(inputSet);
        System.out.println("Last element: " + lastElement);
    }
}
