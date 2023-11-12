package week7;

import java.util.Scanner;

public class W17P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters ="abcdefghiklmnopqrstuvwxyz";
        System.out.print("Enter a number: ");
        int numberOfLetters = sc.nextInt();
        if (numberOfLetters <= 26 && numberOfLetters >=1){
            String result = "";
            for (int i = 0; i < numberOfLetters; i++){
                result += letters.charAt(i);
            }
            System.out.println("Result: " + result);
        }else {
            System.out.println("Result: Error! Invalid number");
        }
    }
}
