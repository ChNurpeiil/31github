package w10;
//Write a method called calculate() that takes three wrapper classes (Double, Integer, and Boolean) as params. If Boolean is true, return product of Double and Integer, otherwise return quotient between Double and Integer.
//
//Params:
//
//Double value1: The first double value.
//
//Integer value2: The second integer value.
//
//Boolean isMultiplication: A boolean value indicating whether to calculate the sum or difference.
//
//Return:
//
//A Double representing the product or quotient of the two wrapper classes.
//
//Example:
//
//calculate(5.0, 10, true) // Returns 50.0
//
//Note: Use arithmetic operations to calculate the sum or difference, and do not convert the wrapper classes to primitive types.
public class Wrapper_10P2 {
    public static void main(String[] args) {
            Double value1 = 5.0;
            Integer value2 = 10;
            Boolean isMultiplication = true;

            Double result = calculate(value1, value2, isMultiplication);
            System.out.println("Result: " + result);
        }
    public static Double calculate(Double value1, Integer value2, Boolean isMultiplication) {
        if (isMultiplication) {
            return value1 * value2;
        } else {
            return value1 / value2;
        }
    }
    }

