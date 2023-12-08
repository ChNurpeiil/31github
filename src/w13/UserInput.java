package w13;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a number: ");
            double number = sc.nextDouble();
            System.out.println("YOu entered: "+ number);
        }catch (InputMismatchException e){
            System.out.println("Please enter a valid ");
        }
    }
}
