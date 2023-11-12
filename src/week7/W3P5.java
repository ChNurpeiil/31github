package week7;

public class W3P5 {
//    Create a Java program with a static method named
//    calculateFactorial() that takes an int as parameter and
//    calculates the factorial of that number using a while loop.
//    The factorial of a non-negative integer n (denoted as n!)
//    is the product of all positive integers less than or
//    equal to n. For example, the factorial of 5 is
//    5! = 5 x 4 x 3 x 2 x 1 = 120.
//    Your program should return the factorial value as an int.
//    Use while loop to calculate a factorial.
//
//Example:
//
//calculateFactorial(5) // 1 * 2 * 3 * 4 * 5 = 120
//
//Return: int
//
//120
public static void main(String[] args) {
  calculateFactorial(5);

}
public static int calculateFactorial(int n){
    int result = 1;
    int i = 1;
    while (i <= n){
        result *= i;

        i++;
    }
    System.out.println(result);

    return result;
}
}
