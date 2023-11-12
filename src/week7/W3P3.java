package week7;

import java.util.Scanner;

public class W3P3 {
    public static void main(String[] args) {
//        Write a program that takes an int N as input and
//        prints a number pyramid pattern like the one below,
//        where N is the number of rows. Use a while loop.
//
//Example of input:
//
//5
//
//Example of output:
//
//1
//22
//333
//4444
//55555
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = scanner.nextInt();

            int row = 1; // Initialize the row number

            while (row <= N) {
                int num = 1; // Initialize the number to be printed
                while (num <= row) {
                    System.out.print(row);
                    num++;
                }
                System.out.println(); // Move to the next line for the next row
                row++;
            }
    }
}
