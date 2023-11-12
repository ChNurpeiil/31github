package week8;

import java.util.Scanner;

public class W9P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        char character = sc.next().charAt(0);

        if (input.isEmpty()){
            System.out.println(input);
        }
        StringBuilder sb = new StringBuilder(input);
        int length = input.length();

        for (int i= 0;i < length -1; i++){
            sb.append(input.charAt(i)).append(character);
        }
        sb.append(input.charAt(length -1));

        System.out.println(sb.toString());
    }
}
