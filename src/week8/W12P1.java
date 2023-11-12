package week8;

public class W12P1 {
//    Description: Write a method called replaceSubstring() that takes a string, a substring to be replaced, and a replacement substring as input and returns the resulting string with all occurrences of the first substring replaced with the second substring using a StringBuilder.
//Params:
//
//A string representing the original string.
//
//A string representing the substring to be replaced.
//
//A string representing the replacement substring.
//
//Return: A string with all occurrences of the first substring replaced with the second substring.
//
//Call a method: replaceSubstring("Hello, world!", "world", "everyone");
//Return: "Hello, everyone!"
public static void main(String[] args) {
    System.out.println(replaceSubstring("Hello, world!", "world", "everyone"));
}
    public static String replaceSubstring(String original, String toReplace, String replacement) {
        if (original == null || toReplace == null || replacement == null) {
            return original;
        }

        StringBuilder result = new StringBuilder(original);

        int index = result.indexOf(toReplace);
        while (index != -1) {
            result.replace(index, index + toReplace.length(), replacement);
            index = result.indexOf(toReplace, index + replacement.length());
        }

        return result.toString();
 }
}
