package week7;

import java.util.Scanner;

public class W9P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I'm building my bright future with WeDevX");
        System.out.println("Do you want to see this message again? (true/false)");
        boolean answer = sc.nextBoolean();

        while (answer) {

            System.out.println("Do you want to see this message again? (true/false)");
            answer = sc.nextBoolean();

            if (answer) {
                System.out.println("I'm building my bright future with WeDevX");
            }
        }
    }
}
