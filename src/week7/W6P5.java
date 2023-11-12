package week7;

public class W6P5 {
//    Create a static method named removeSpaces() that takes 1
//    parameter String. It should removes all spaces from the
//    string using a while loop and returns the modified String.
//
//Examples:
//
//Params: "NoSpacesHere"
//Return: "NoSpacesHere"
//
//Params: " Java Programming is Fun "
//Return: "JavaProgrammingisFun"
public static void main(String[] args) {
String str = removeSpaces(" noSpace");
    System.out.println(str);
}
public static String removeSpaces(String input){
    String result= "";
    int index = 0;
    while (input.length() > index){
        char currentChar = input.charAt(index);
        if(currentChar != ' '){
            result += currentChar;
        }
        index++;
    }
    return result;
}
}
