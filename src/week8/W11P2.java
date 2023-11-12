package week8;

public class W11P2 {
//   Description: Write a method called removeDuplicates() that
//   takes a string as input and removes all consecutive
//   duplicate characters using a StringBuilder. The method
//   should return the resulting string.
//
//Params: A string.
//
//Return: A string with all consecutive duplicate characters
// removed.
//
//Example:
//
//removeDuplicates("aaabbcdddefffg"); // Returns "abcdefg"
//
//removeDuplicates("122333444455555666666"); // Returns "123456"
//
//removeDuplicates("1112233311445"); //Returns "123145"
public static void main(String[] args) {
    System.out.println(removeDuplicates("aaabbcdddefffg")); // Output: "abcdefg"
    System.out.println(removeDuplicates("122333444455555666666")); // Output: "123456"
    System.out.println(removeDuplicates("1112233311445"));
}
public  static String removeDuplicates(String input){
    if (input == null || input.isEmpty()) {
        return input;
    }

    StringBuilder result = new StringBuilder();
    char currentChar = input.charAt(0);

    result.append(currentChar);

    for (int i = 1; i < input.length(); i++) {
        char nextChar = input.charAt(i);

        if (nextChar != currentChar) {
            result.append(nextChar);
            currentChar = nextChar;
        }
    }

    return result.toString();
        }
    }



