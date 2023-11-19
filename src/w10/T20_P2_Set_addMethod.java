package w10;

import java.util.LinkedHashSet;

//Write a method called parseUniqueDigits() that takes a String. The method should iterate through the given string and sequentially add the numbers encountered to a new set in the order they appear.
//
//Param: String
//
//Return: LinkedHashSet<Integer>
//
//Example:
//
//// Returns [123, 456, 789]
//parseUniqueDigits("Hello 123 world! This is a test string 456 containing both words and numbers 789.")
//
//Note:
//
//one number can take more than 1 digit. Check whether the number is ending on the next coming index or not.
//
//add check for negative numbers as well.
public class T20_P2_Set_addMethod {
    public static LinkedHashSet<Integer> parseUniqueDigits(String input){
        LinkedHashSet<Integer> uniqueDigits = new LinkedHashSet<>();


        int index =0;
        int length = input.length();
        boolean isParsingNUmber = false;

        StringBuilder currentNumber = new StringBuilder();

        while (index < length) {

            char currentChar = input.charAt(index);
            if (Character.isDigit(currentChar)){
                isParsingNUmber = true;
                currentNumber.append(currentChar);
            }else {
                if (isParsingNUmber){
                    uniqueDigits.add(Integer.parseInt(currentNumber.toString()));
                    currentNumber.setLength(0);
                    isParsingNUmber= false;
                }
            }
            index++;
        }
        if (isParsingNUmber){
            uniqueDigits.add(Integer.parseInt(currentNumber.toString()));
        }
        return uniqueDigits;
    }

    public static void main(String[] args) {
        String inputString = "Hello 123 world! This is a test string 456 containing both words and numbers -789.";
        LinkedHashSet<Integer> uniqueDigits = parseUniqueDigits(inputString);
        System.out.println(uniqueDigits); // Output: [123, 456, -789]

    }

}
