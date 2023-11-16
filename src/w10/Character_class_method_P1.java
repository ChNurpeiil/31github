package w10;

public class Character_class_method_P1 {
//    Write a method called countDigitsAndUppercase() that takes a String as parameter and returns the count of digits and uppercase letters in the string as a string in the format: Digits: X, Uppercase: Y.
//
//Return Type: String
//
//Example #1:
//
//Parameter:
//
//String str = "Hello World 123"
//
//Return:
//
//Digits: 3, Uppercase: 2
//
//Example #2:
//
//Parameter:
//
//String str = "AbCdEfGhIjKlM"
//
//Return:
//
//Digits: 0, Uppercase: 7
//
//Example #3:
//
//Parameter:
//
//String str = "Testing 123"
//
//Return:
//
//Digits: 3, Uppercase: 1
public static void main(String[] args) {
    String str1 = "Hello World 123";
    String str2 = "AbCdEfGhIjKlM";
    String str3 = "Testing 123";

    System.out.println(countDigitsAndUppercase(str1));
    System.out.println(countDigitsAndUppercase(str2));
    System.out.println(countDigitsAndUppercase(str3));
}
public static String countDigitsAndUppercase(String input){
    int digitCount = 0;
    int uppercaseCount = 0;

    for (char c : input.toCharArray()){
        if(Character.isDigit(c)){
            digitCount++;
        } else if (Character.isUpperCase(c)) {
            uppercaseCount++;
        }
    }
    return "Digits: " + digitCount+", Uppercase: " + uppercaseCount;
}
}
