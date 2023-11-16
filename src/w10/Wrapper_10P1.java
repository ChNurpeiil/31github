package w10;

public class Wrapper_10P1 {
    //    Description: Write a method called calculate() that takes
//    three wrapper classes (Integer, Double, and Boolean) as
//    params. If Boolean is true, return sum of Integer and
//    Double, otherwise return difference between Integer and
//    Double.
//
//Params: Integer, Double, and Boolean.
//
//Return: A Double representing the sum or difference of the two wrapper classes.
//
//Example:
//
//calculateSum() // Returns the sum of the two wrapper classes.
//
//Note: Use arithmetic operations to calculate the sum or difference, and do not convert the wrapper classes to primitive types.
    public static void main(String[] args) {
        Integer intValue = 5;
        Double doubleValue = 3.5;
        Boolean isSum = true;

        Double result = calculate(intValue, doubleValue, isSum);
        System.out.println("Result: " + result);
    }

    public static double calculate(Integer num, Double num2, Boolean num3) {
        if (num3 == true) {
            return (double) num + num2;
        } else {
            return (double) num - num2;
        }
    }
}
