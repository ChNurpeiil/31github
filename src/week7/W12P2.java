package week7;

import java.util.Scanner;

public class W12P2 {
    //   Write a method called passwordForm() that simulates a user
//   typing a password. The program should use a while loop to
//   repeatedly prompt the user to enter their password.
//   The program should stop the loop when the user enters the
//   correct password. Solve this exercise using Switch statement.
//
//Correct password is WEDEVX
//
//Input:
//
//String password: The password.
//
//Output:
//
//If password is correct: Correct password. Welcome!
//
//If password is incorrect: Incorrect password. Try again.
//
//Example:
//
//Enter your password:
//Incorrect password. Try again.
//
//Enter your password:
//Incorrect password. Try again.
//
//Enter your password:
//Correct password. Welcome!
    public static void main(String[] args) {
    passwordForm();
    }public static void passwordForm(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password.");
            String password = sc.nextLine();

            switch (password){
                case "WEDEVX":
                    System.out.println("Correct password. Welcome!");
                    return;
                default:
                    System.out.println("Incorrect password. Try again.");

            }




        }

    }

}