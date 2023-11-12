package week8;

import java.util.Scanner;

public class W4P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String pattern = sc.next();

        for (int i = 1;i <= n; i++){
            System.out.print(i+" ");
            for (int j= 1; j <=i ;j++){
                System.out.print( pattern+ " ");
            }
            System.out.println();
        }
    }
}
