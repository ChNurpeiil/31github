package week8;

import java.util.Scanner;

public class W6P2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1;i <= input; i++){
            for (int j = 1; j <= input; j++){
                int celValue = i+j-1;
                System.out.print(celValue + "\t");
            }
            System.out.println();
        }
    }
}
