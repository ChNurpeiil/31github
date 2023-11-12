package week8;

import java.util.Scanner;

//Description: Write a method called removeSubstrings() that
// takes two strings as input, and removes all occurrences of
// the second string from the first string using a StringBuilder.
// The method should return the resulting string.
//Params: Two strings.
//Return: A string with all occurrences of the second string
// removed from the first string.
//
//Call a method: removeSubstrings("this is a test string", "test");
//Return: "this is a string"
//
//Call a method: removeSubstrings("another example", "e");
//Return: "anothr xampl"
public class W11P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ch = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);

        int index = sb.indexOf(ch);
        while (index != -1){
            sb.delete(index, index +ch.length());
            index = sb.indexOf(ch);
        }
        System.out.println(sb.toString());
    }
}
