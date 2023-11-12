package week7;

public class W4P5 {
//    Write a static method called isPalindrome() that accepts a
//    String as a parameter and returns true if the string is a
//    palindrome and false otherwise.
//
//A palindrome is a word or phrase that reads the same backward
// as forward.
//
//Example:
//
//Input: "racecar"
//Output: true
//
//Input: "madam"
//Output: true
//
//Input: "hello"
//Output: false
public static void main(String[] args) {
isPalindrome("tyuyth");
}
public static boolean isPalindrome(String input){
    int left = 0;
    int right = input.length()-1;

    while (left < right ){
        if(input.charAt(left) != input.charAt(right)){
            System.out.println(false);
            return  false;
        }
        left++;
        right--;

    }
    System.out.println(true);
    return true;
}
}
