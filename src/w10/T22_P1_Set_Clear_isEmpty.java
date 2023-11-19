package w10;

import java.util.LinkedHashSet;

//Write a method called addUniqueChars() that takes a String as parameter. The method should iterate through the characters in the string and add unique characters to a set until it encounters a special character. If the special character is found, the method should return an empty set (LinkedHashSet<String>). If the string contains any numerical characters, the method should return a set (LinkedHashSet<String>) containing the string 0 (zero).
//
//Return Type: void
//
//Example #1:
//
//Parameter:
//
//String str = "Hello, world!"
//
//Return:
//
//[]
//
//Example #2:
//
//Parameter:
//
//String str = "Abc12345"
//
//Return:
//
//["0"]
//
//Example #3:
//
//Parameter:
//
//String str = "Wedevx"
//
//Return:
//
//["W", "e", "d", "v", "x"]
//
//Note:
//
//The comparison for uniqueness should be case-sensitive, meaning "a" and "A" are considered different characters.
//
//The order of the characters in the set should be preserved based on their appearance in the input string.
//
//If the input string is empty, the method should return an empty set.
//
//Skip spaces.
//
//To initialize an empty LinkedHashSet, use next command:
//LinkedHashSet<String> uniqueChars = new LinkedHashSet<>();
public class T22_P1_Set_Clear_isEmpty {
    public static void addUniqueChars(String input) {
        LinkedHashSet<String> uniqueChars = new LinkedHashSet<>();
        if (input.isEmpty()){
            System.out.println(uniqueChars);
        return;
        }
        for (Character ch : input.toCharArray()){
            if (Character.isLetter(ch)){
                String character = String.valueOf(ch);
                if (!uniqueChars.contains(character)){
                    uniqueChars.add(character);
                }

            } else if (Character.isDigit(ch)) {
                uniqueChars.clear();
                uniqueChars.add("0");
                System.out.println(uniqueChars);
                return;

            }else {
                uniqueChars.clear();
                System.out.println(uniqueChars);
                return;
            }
        }
        System.out.println(uniqueChars);
    }

    public static void main(String[] args) {
        addUniqueChars("Hello, world!"); // Example 1
        addUniqueChars("Abc12345");    // Example 2
        addUniqueChars("Wedevx");      // Example 3

    }
}
