package week7;

import java.util.Scanner;

public class W13P2 {
    //    Create a password guessing game where the user has to
//    guess the correct password. Initially, set a predefined
//    password. The user keeps guessing until they enter the
//    correct password or choose to quit. Use a do-while loop
//    to keep the game running.
//
//Requirements:
//
//Set a predefined password wedevx2023
//
//Prompt the user to enter their password guess.
//
//Use a do-while loop to repeatedly ask for guesses until the
// correct password is guessed or the user chooses to quit.
//
//Provide feedback to the user if their guess is incorrect.
//
//Allow the user to quit the game by typing "quit".
//
//Display a congratulatory message when the correct password is
// guessed.
//
//Display an exit message when user writes "quit".
//
//Example of the outputs:
//
//Welcome to the Password Guessing Game!
//Guess the password:
//> mypassword
//Incorrect password. Try again or type "quit" to exit.
//
//Guess the password:
//> secret
//Incorrect password. Try again or type "quit" to exit.
//
//Guess the password:
//> wedevx2023
//Congratulations! You guessed the correct password.
//
//Welcome to the Password Guessing Game!
//
//Guess the password:
//> Password123
//Incorrect password. Try again or type "quit" to exit.
//
//Guess the password:
//> quit
//Exiting the game.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guessPassword;
        System.out.println("Welcome to the Password Guessing Game!");

        do {
            System.out.println("Guess the password:");
            guessPassword = sc.nextLine();
            if(guessPassword.equalsIgnoreCase("wedevx2023")){
                System.out.println("Congratulation! You guessed the correct password.");
                break;
            } else if (guessPassword.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the game.");
                break;
            } else {
                System.out.println("Incorrect password. Try again or type \"quit\" to the exit.");
            }

        }while (true);
    }
}
