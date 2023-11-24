package week7;

import java.util.Scanner;

public class W14P1 {
    //    Create a program that validates user input to ensure it is
//    a positive integer. You should implement a static method
//    called validateInput() and uses a do-while loop to
//    repeatedly prompt the user until they enter a valid
//    positive integer.
//
//Here are the detailed steps for the validateInput method:
//
//Display a prompt to the user to enter a positive integer.
//
//Use a do-while loop to repeatedly perform the following steps:
//
//Prompt the user for input.
//
//Check if the integer is greater than 0.
//
//If the input is valid, break out of the loop and print the
// message.
//
//If the input is not valid, display an error message and
// continue to the next iteration of the loop.
//
//Example:
//
//Input:
//
//validateInput()
//-10
//0
//5
//
//Output:
//
//Enter a positive integer:
//Error: Please enter a positive integer.
//Error: Please enter a positive integer.
//Valid number: 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = sc.nextInt();
        do {
            if (number <= 0) {
                System.out.println("Error: Enter a positive integer:");
                number = sc.nextInt();
            } else {
                System.out.println("Valid number: " + number);
                break;
            }

        } while (true);
    }
}
