package week8;

import java.util.Scanner;

public class W3P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns= sc.nextInt();

        int i = 1;

        while (i <= rows){
            int j = 1;
            while (j <= columns){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
