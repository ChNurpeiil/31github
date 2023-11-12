package week7;

import java.util.Scanner;

public class W10P1 {
//    Description: The program should repeatedly prompt the user to enter
//    an email address until a valid input is entered. A valid
//    email address should be in the format of
//    username@domain.com. For the sake of making this exercise
//    straightforward. Your program should only check if the
//    email ends with @domain.com
//
//Input: The user should input their email address.
//
//Output: The program should output a message indicating that
// the input is invalid and prompt the user to input their
// email address again until a valid input is entered.
//
//Sample output format:
//
//Inputs:
//abc.domain.com (no @ sign)
//
//abc@domaincom (no . before com)
//
//abc.def@domain.com (valid)
//
//Enter your email address:
//Invalid input. Please enter a valid email address in the format of username@domain.com.
//Enter your email address:
//Invalid input. Please enter a valid email address in the format of username@domain.com.
//Enter your email address:
//Valid input. Thank you!
//don't solve , just problem
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your email address:");
    String answer = sc.nextLine();
    while (!answer.endsWith("@domain.com")){
        System.out.println("Invalid input. Please enter a valid email address in the format of username@domain.com.");
        System.out.println("Enter your email address:");
        answer = sc.nextLine();
        if(answer.endsWith("@domain.com")){
            System.out.println("Valid input. Thank you!");
        }
    }


}
}
