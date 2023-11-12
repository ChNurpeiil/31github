package week8;

import java.util.Scanner;

public class W9P2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your last name:");
        String lastname = sc.nextLine();
        StringBuilder sb = new StringBuilder(lastname);
        System.out.println("Enter your first name:");
        String firstname = sc.nextLine();

        sb.insert(0, firstname + " ");
        System.out.println("Full Name: " + sb.toString());
    }
    }

