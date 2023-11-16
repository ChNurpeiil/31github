package w10;

public class ParseWrapper_P1 {
    //    Description: Write a method called calculateSum() that takes two String as input and returns their sum as a int using the parse method.
//
//Params: Two String.
//
//Return: An int representing the sum of the two integers.
//
//Example:
//
//calculateSum("5", "10") // Returns 15
//
//Note: The parse method should be used to calculate the sum.
    public static void main(String[] args) {
        String num1 = "10";
        String num2 = "5";

        int result = calculateSum(num1, num2);
        System.out.println("Result: " + result);
    }

    public static int calculateSum(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        return n1+n2;
    }
}
