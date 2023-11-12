package week8;

public class W12P2 {
//    Write a method convertString() that replaces all spaces in a string with hyphens and converts all letters to lowercase.
//
//Parameters:
//
//String input: The input string.
//
//Return:
//
//String: The output string
//
//Example of parameters:
//
//input = "This is a test string"
//
//Example of return:
//
//this-is-a-test-string
public static void main(String[] args) {
    System.out.println(convertString("hello hi my name is"));
}
public static String convertString(String str){
    StringBuilder sb = new StringBuilder(str);
    for(int i=0; i<sb.length();i++){
        if (sb.charAt(i) ==' '){
            sb.replace(i, i +1,"-");
        }
    }
    return sb.toString().toLowerCase();
}
}
