package week7;

import java.util.Scanner;

public class W18P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;

            if(n1 <= 0 && n2 <=0){
                System.out.println("0");

            } else {
                for (int i = n1; i < n2; i+=2 ){
                    sum+=i;
                    System.out.println(sum);
            }

        }
    }
}
