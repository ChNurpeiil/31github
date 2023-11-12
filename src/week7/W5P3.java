package week7;

public class W5P3 {
//    Create a static method named reverseCharactersOrder() that takes a
//    String as a parameter and prints the characters of the string in
//    reverse order using a while loop, charAt() and System.out.print() methods.
//    The program should iterate through the characters of the
//    string in reverse order and print the string in reverse order.
//
//Return type: void
//
//Example:
//
//Input:
//
//Hello, World!
//
//Output:
//
//!dlroW ,olleH
public static void main(String[] args) {
    reverseCharactersOrder("Hello, World!");
}
public static String reverseCharactersOrder(String input){
    int length = input.length();
    String reversed="";
    while (length > 0){
        length--;
        char c = input.charAt(length);
        reversed +=c;
    }
    System.out.println(reversed);
return reversed;
}

}
