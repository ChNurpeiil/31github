package week8;

import java.util.Scanner;

public class W6P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char symbol = sc.next().charAt(0);
        if (n % 2 == 0 || n <= 0 || n >= 50) {
            System.out.println("Invalid input! n must be a positive odd integer less than 50.");

        }

        int spaces = n / 2;
        int stars = 1;
        for (int i = 1; i <= n /2 +1; i++){
            for (int j= 1; j < spaces;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print(symbol);
            }

            System.out.println();

            spaces--;
            stars += 2;

        }
        spaces = 1;
        stars = n - 2;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print(symbol);
            }

            System.out.println();

            spaces++;
            stars -= 2;
        }
    }
}
