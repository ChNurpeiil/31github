package week9;

import java.util.Arrays;

public class W7P1 {
    //    Create a static method named convertStringArrayToString() that takes an array of strings as a parameter (String[]) and converts it to a string representation using Arrays.toString() method. Print the resulting string, the program shouldn't return anything.
//
//Return Type: void
//
//Example:
//
//Parameters:
//
//String[] arr = ["apple", "banana", "cherry"]
//
//Output:
//
//["apple", "banana", "cherry"]
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry"};
        convertStringArrayToString(arr);
    }

    public static void convertStringArrayToString(String[] param) {
        System.out.println(Arrays.toString(param));
    }
}
