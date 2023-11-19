package w10;

import java.util.LinkedHashSet;

public class T20_P1_Set_addMethod {
    public static LinkedHashSet<Character> uniqueCharacters(String input){
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        char[] chars = input.toCharArray();
        for (char ch : chars){
            uniqueChars.add(ch);
        }
        return uniqueChars;

    }

    public static void main(String[] args) {
        String inputString = "Hello world";
        LinkedHashSet<Character> uniqueChars = uniqueCharacters(inputString);
        System.out.println(uniqueChars);
    }
}
