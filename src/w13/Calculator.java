package w13;

public class Calculator {
    public static int divide(int dividend, int divisor) throws ArithmeticException{

        if (divisor == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return dividend/divisor;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            int result1 = calculator.divide(10, 5);
            System.out.println("Result1: " + result1);
            int result2 = calculator.divide(10, 0);
            System.out.println("Result2: " + result2);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
