package w10;

public class ToString_P2 {
//    Create a static method named convertIntegerToString that takes an Integer as a parameter and converts it to a String using the toString() method. Return the converted string.
//
//Example #1:
//
//Parameters:
//
//Integer num = -123
//
//Return: String
//
//Output:
//
//-123
public static void main(String[] args) {
Integer num = -123;
    System.out.println(convertIntegerToString(num));
}
public static String convertIntegerToString(Integer num){
    return num.toString();
}
}
