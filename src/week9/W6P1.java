package week9;

import java.util.Arrays;

public class W6P1 {
    public static void main(String[] args) {
        int[] result1 = countChar(new String[]{"hello", "world", "how", "are", "you"}, 'o');
        int[] result2 = countChar(new String[]{"apple", "banana", "cherry", "date"}, 'a');

        // Print the results
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    public static int[] countChar(String[] arr, char ch) {
        if (arr.length == 0) {
            return new int[]{-1};
        }

        int[] charCountArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // Convert both the character in the string and the specified character to lowercase
            charCountArray[i] = countCharInString(arr[i].toLowerCase(), Character.toLowerCase(ch));
        }

        return charCountArray;
    }

    private static int countCharInString(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}