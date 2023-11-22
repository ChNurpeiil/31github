package w11;

import java.util.*;

//Description: Create a method called classifyAndDeduplicateIntegers() that takes a string of integers as input. The method should parse the string, classify each integer based on its value, and return a map object where each unique integer is the key and the corresponding value is a string indicating its classification.
//
//Params:
//
//A string of integers.
//
//Return:
//
//A map object with integer-classification pairs, where the key is the integer (Integer) and the value is a string indicating its classification (String).
//
//Classifications:
//
//Positive even integers: "Positive Even"
//
//Positive odd integers: "Positive Odd"
//
//Zero: "Zero"
//
//Negative integers: "Negative"
//
//Duplicate Removal:
//
//If a number appears more than once in the input string, remove all occurrences of that number from the map.
//
//Example:
//
//String integers = "1 2 3 4 5 6 7 2 4 6 8 10 -1 -2 -3 -1 -2 -3 -4 0";
//
//classifyAndDeduplicateIntegers(integers); // Returns {-4=Negative, 0=Zero, 1=Positive Odd, 3=Positive Odd, 5=Positive Odd, 7=Positive Odd, 8=Positive Even, 10=Positive Even}
//
//Note: order the map by keys.
public class T6_P1_RemoveMethod {
    public static Map<Integer, String> classifyAndDeduplicateIntegers(String integers) {
        String[] integersArray = integers.split("\\s");

        Map<Integer, String> integerMap = new TreeMap<>();

        Set<Integer> duplicates = new HashSet<>();

        for (String strNum : integersArray) {
            int num = Integer.parseInt(strNum);

            if (!integerMap.containsKey(num)) {
                integerMap.put(num, classifyInteger(num));
            } else {
                duplicates.add(num);
            }
        }
        for (int duplicate : duplicates){
            integerMap.remove(duplicate);
        }
        return  integerMap;
    }
    public static  String classifyInteger(int num) {
        if(num < 0){
            return "Negative";
        }else if (num ==0){
            return "Zero";
        } else if (num %2 ==0) {
            return "Positive Even";
        }else {
            return "Positive Odd";
        }
    }

    public static void main(String[] args) {
        String integers = "1 2 3 4 5 6 7 2 4 6 8 10 -1 -2 -3 -1 -2 -3 -4 0";
        Map<Integer, String> result =classifyAndDeduplicateIntegers(integers);
        System.out.println(result);
    }
}
