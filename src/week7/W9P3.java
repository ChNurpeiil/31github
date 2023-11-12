package week7;

public class W9P3 {
//    Create a program with a static method named validatePasswordLength()
//    that takes a password as a String parameter.
//    The program should repeatedly prompt the user to input a password
//    until it meets the following criteria: the password must
//    be more than 8 characters in length. Use a
//    while loop with a boolean condition to enforce this rule.
//
//Example:
//
//Input:
//
//EasyPass
//HardPassword@!#
//
//Return:
//
//Please enter a password:
//Password must be more than 8 characters. Please try again:
//Password is valid
public static void main(String[] args) {
    validatePasswordLength("EasyPass");
}

    public static void validatePasswordLength(String password) {
        while (password.length() <= 8) {
            System.out.println("Password must be more than 8 characters. Please try again:");
            System.out.println("Please enter a password:");
            // You need to update the 'password' variable with the user's input
            // For example:
            // password = sc.nextLine();
        }
        System.out.println("Password is valid");
    }
}
