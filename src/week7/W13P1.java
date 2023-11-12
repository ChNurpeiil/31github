package week7;

import java.util.Scanner;

public class W13P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int number;
        do {
            System.out.println("Enter a number:");
            number = sc.nextInt();
            if( number !=7){
                System.out.println("Incorrect. Try again.");
            } else{
                System.out.println("Correct!");
                break;
            }

        } while(true);
    }
}
