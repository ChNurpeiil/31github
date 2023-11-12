package week7;

import java.util.Scanner;

public class W11P1 {
//   Description: The static method called countCharOccurrences()
//   that takes a String and a character as a param and count
//   the number of occurrences of that character in the given
//   string using a while loop. if the character doesn't occur
//   in the string then return out -1;
//
//Params: The user should input a String and a character.
//
//Return: Integer. The method should return the number of
// occurrences of the character in the given string.
//
//Sample Input/Output 1:
//
//hello world l
//
//Output:
//
//3
//
//Sample Input/Output 2:
//
//programming is fun Enter a character to count: z
//
//Output:
//
//-1
//
//Sample Input/Output 3:
//
//Enter a string: hello Enter a character to count: o
//
//Output:
//
//1
//
//Note: The program should be case-sensitive. For example,
// if the user inputs 'H' to search for occurrences of the
// uppercase letter 'H', it should not count occurrences of the
// lowercase letter 'h'.
public static void main(String[] args) {
    System.out.println("Enter a string: ");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();


    char character = sc.next().charAt(0);
//    System.out.println("");
    int count = countCharOccurrences(input,character);
    if(count < 0){
        System.out.println("-1");
    } else {
        System.out.println(count);
    }

}
public static int countCharOccurrences(String input, char character){
    int count = 0;
    int index = 0;
    while (index <input.length()){
        if(input.charAt(index) == character){
            count++;
        }
        index++;
    }
    if(count == 0){
        return -1;
    }
    return  count;


}
}
