package week7;

import java.util.Scanner;

public class W16_do_while_and_while {
    public static void main(String[] args) {
//        while loop
        System.out.println("=====WHILE LOOP==========");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        while (!validatePassword(password)) {
            System.out.println("Password must be at least 8 characters long.");
            System.out.print("Enter a password: ");
            password = scanner.nextLine();
        }

        System.out.println("Registration successful!");



        System.out.println("=========DO WHILE LOOP=====");

        do {
            System.out.print("Enter a password: ");
            password = scanner.nextLine();

            if (!validatePassword(password)) {
                System.out.println("Password must be at least 8 characters long.");
            }
        } while (!validatePassword(password));

        System.out.println("Registration successful!");
    }









    public static boolean validatePassword(String password) {
        return password.length() >= 8;



    }
}
