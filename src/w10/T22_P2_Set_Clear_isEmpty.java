package w10;

import java.util.HashSet;
import java.util.Set;

//Description: Write a method called sortCharacters() that takes a String as input. The method should iterate through the characters in the string and perform specific operations based on the character type. The operations are as follows:
//
//If the character is an uppercase letter, add it to a set of uppercase letters.
//
//If the character is a lowercase letter, add it to a set of lowercase letters.
//
//If the character is a digit, add it to a set of numbers.
//
//If the character is a special character, add it to a set of characters (skip spaces).
//
//If the character is a '*', return an empty set.
//
//After pe
public class T22_P2_Set_Clear_isEmpty {
    public static void sortCharacters(String input){
        Set<Character> uppercase = new HashSet<>();
        Set<Character> lowercase = new HashSet<>();
        Set<Character> numbers = new HashSet<>();
        Set<Character> specialChar = new HashSet<>();

        for (char ch : input.toCharArray()){
            if (ch=='*'){
                System.out.println(new HashSet<>());
                return;
            } else if (Character.isUpperCase(ch)) {
                uppercase.add(ch);
            } else if (Character.isLowerCase(ch)) {
                lowercase.add(ch);
            } else if (Character.isDigit(ch)) {
                numbers.add(ch);
            } else if (!Character.isWhitespace(ch)) {
                specialChar.add(ch);
            }
        }
        System.out.println(uppercase);
        System.out.println(lowercase);
        System.out.println(numbers);
        System.out.println(specialChar);
    }

    public static void main(String[] args) {
        sortCharacters("Hello, world! 123 ");
        sortCharacters("Hello, world! 123 *");
    }
}
