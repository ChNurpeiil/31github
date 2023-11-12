package week7;

import java.util.Scanner;

public class W12P3 {
    //    Create a Java program for a simple calculator with a
//    menu-driven interface. The program should use a
//    while loop and a switch statement to repeatedly display a
//    menu of options to the user. The menu should include the
//    following choices:
//
//Addition
//
//Subtraction
//
//Multiplication
//
//Division
//
//Exit
//
//The program should prompt the user to select an option by
// entering the corresponding number as double. Based on the
// user's choice, the program should then prompt the user
// to input two numbers (operands). After receiving the operands, perform the selected arithmetic operation and display the result to the user. Continue displaying the menu and performing calculations until the user chooses to exit.
//
//Example:
//
//Input:
//
//1 // for addition
//5 // first number
//3 // second number
//0 // exit
//
//Output:
//
//Calculator Menu:
//1. Addition
//2. Subtraction
//3. Multiplication
//4. Division
//0. Exit
//Choose an option:
//Enter first number:
//Enter second number:
//Result: 5 + 3 = 8
//Calculator Menu:
//1. Addition
//2. Subtraction
//3. Multiplication
//4. Division
//0. Exit
//Exiting the calculator. Goodbye!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;

        while (true) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.println("Choose an option:");
            choose = sc.nextInt();
            if (choose == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
            }


            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();
            double result;

            switch (choose) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

}

