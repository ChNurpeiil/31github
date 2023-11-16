package week9;

import java.util.ArrayList;
import java.util.List;

//Description: Write a method called findStringsContainingSpecialChars()
// that takes an array of Strings as input. The method should
// loop through each element of the array and check if it
// contains any of the special characters specified below. If
// the element contains any of the special characters, add it
// to a new array. The method should then return the new array.
//(',', '.', '!', '?', ';', ':', '-', "&", "#")
//Params: An array of Strings.
//Return: An array of Strings containing elements from the input array that contain special characters.
//Example:
//String[] inputArray = {"Hello!", "This is a test", "1234", "#$%^&*", "Goodbye!"};
//findStringsContainingSpecialChars(inputArray); // Returns {"Hello!", "#$%^&*", "Goodbye!"}
public class W15P1 {
    public static void main(String[] args) {
        String[] inputArray = {"Hello!", "This is a test", "1234", "#$%^&*", "Goodbye!"};
        String[] result = findStringsContainingSpecialChars(inputArray);

        for (String str : result) {
            System.out.print(str + " ");
        }
    }
    public static String[] findStringsContainingSpecialChars(String[] input){
        if (input.length==0 || input ==null){
            return new String[0];
        }

        char[] charElements ={',', '.', '!', '?', ';', ':', '-', '&', '#'};
        List<String> stringsWithSpecialChars = new ArrayList<>();

        // Loop through each element in the input array
        for (String str : input) {
            // Check if the current element contains any special characters
            for (char c : charElements) {
                if (str.contains(String.valueOf(c))) {
                    stringsWithSpecialChars.add(str); // Add the element to the list
                    break; // Break the loop as soon as a special character is found in the string
                }
            }
        }

        // Convert the list of strings to an array and return it
        return stringsWithSpecialChars.toArray(new String[0]);
    }
    }

