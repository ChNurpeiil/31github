package week7;

import java.util.Scanner;

public class W11P3 {
    //    Write a program that uses a while loop to print all the
//    square numbers from 1 to a given number (int).
//    You can use the Compound Operator to find the square
//    of the number. If the given number is less than 1, then
//    print out the message The number should be positive.
//
//Example of output (don't print the given number into the
// first line):
//
//Enter a number: 10
//The square numbers from 1 to 10 are:
//1
//4
//9
//16
//25
//36
//49
//64
//81
//100
//
//Enter a number: -5
//The number should be positive
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("The number should be positive");
        }else {
            System.out.println("The square numbers from 1 to "+num+" are:");
            int i = 1;
        while (i <=num){
             int square = i*i;
                System.out.println(square);
                i++;
            }

        }

    }

}
