package week7;

import java.util.Scanner;

public class W10P2 {
//    Description: The program should repeatedly prompt the user
//    to enter their name until a valid input is entered. The
//    program should only accept a non-empty String as a valid
//    input. A String which contains only spaces is considered
//    invalid as well. You can get rid of white spaces and turn
//    the String into an empty String using .trim()
//
//Input: The user should input their name.
//
//Output: The program should output a message indicating that
// the input is invalid and prompt the user to input their
// name again until a valid input is entered.
//
//Sample Output Format:
//
//Input:
//
//[User enters an empty string] [User enters another empty string] Sophia
//
//Please enter your name:
//Invalid input. Please enter your name:
//Invalid input. Please enter your name:
//Welcome, Sophia!
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name:");
    String name = sc.nextLine();

    while (name.trim().length() >0){

        System.out.println("Invalid input,");
        System.out.println("Please enter your name:");
        name = sc.nextLine();
        if(name.length() > 0){
            System.out.println("Welcome, "+name+ "!");
        } break;
    }

}
}
