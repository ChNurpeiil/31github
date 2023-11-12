package week7;

public class W4P4 {
//    Write a static method called reverseString() that accepts
//    a String as a parameter. The method should return a
//    String that is the reverse of the specified string.
//
//Example of result:
//
//Input: "Hello"
//Output: "olleH"
//
//Input: "World"
//Output: "dlrow"
//
//Input: "12345"
//Output: "54321"
public static void main(String[] args) {
   reverseString("Hello");
}
public static String reverseString(String input){
    int length = input.length();
    String reversed= "";
    while (length > 0){
        length--;
        char c = input.charAt(length);
        reversed += c;
    }
    System.out.println(reversed);
    return reversed;
}
}
