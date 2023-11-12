package week7;

import java.util.Scanner;

public class W16P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;




        while (continueCalc) {
            System.out.println("Enter first number:");
            double num1 = sc.nextInt();

            System.out.println("Enter second number:");
            double num2 = sc.nextInt();

            System.out.println("Enter operator(+, -, *, /)");
            char oper = sc.next().charAt(0);

            double result = 0.0;

            switch (oper) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero.");
                        continueCalc = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continueCalc = false;
            }

            if (continueCalc) {
                System.out.println("Result: " + result);
                System.out.print("Do you want to continue? (y/n) ");
                char choice = sc.next().charAt(0);

                if (choice == 'n') {
                    continueCalc = false;
                }
            }

            // Empty line after each iteration
            System.out.println();
        }

    }
}

