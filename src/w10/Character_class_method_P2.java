package w10;

public class Character_class_method_P2 {
//    Write a method called countCharacterTypes() that takes a String as a parameter. The method should count the number of alphabetic characters, digits, whitespace characters, and special characters (non-alphabetic, non-digit, and non-whitespace) in the string. The counts should be stored in an array of integers and returned.
//
//To count different types of characters, use Character class with the learned methods:
//
//To count alphabetic characters - isLetter(ch);
//
//To count digit characters - isDigit(ch);
//
//To count whitespace characters - isWhitespace(ch);
//
//To count the number of other types of characters, you can use else statement.
//
//Return Type: int[] - an array of integers representing the count of each character type.
//
//Example #1:
//
//Parameter:
//
//String str = "Hello 123 World!"
//
//Return:
//
//[10, 3, 2, 1]
//// The input string contains 10 alphabetic characters, 3 digits, 2 whitespace characters, and 1 special character.
//
//Example #2:
//
//Parameter:
//
//String str = ""
//
//Return:
//
//[0, 0, 0, 0]
public static void main(String[] args) {
    String str1 = "Hello 123 World!";
    String str2 = "";

    int[] counts1 = countCharacterTypes(str1);
    int[] counts2 = countCharacterTypes(str2);

    displayCounts(counts1);
    displayCounts(counts2);

}
public static int[] countCharacterTypes(String str){
    if (str.isEmpty()) {
        return new int[]{0, 0, 0, 0}; // Return an array of zeros for an empty string
    }else {
        int[] counts = new int[4];
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                counts[0]++; // Increment count for alphabetic characters
            } else if (Character.isDigit(ch)) {
                counts[1]++; // Increment count for digit characters
            } else if (Character.isWhitespace(ch)) {
                counts[2]++; // Increment count for whitespace characters
            } else {
                counts[3]++; // Increment count for special characters
            }
        }

        return counts;
    }

}
    public static void displayCounts(int[] counts) {
        System.out.println("Alphabetic characters count: " + counts[0]);
        System.out.println("Digit characters count: " + counts[1]);
        System.out.println("Whitespace characters count: " + counts[2]);
        System.out.println("Special characters count: " + counts[3]);
        System.out.println();
    }
}
