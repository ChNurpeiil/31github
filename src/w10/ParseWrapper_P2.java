package w10;

public class ParseWrapper_P2 {
//    Create a static method named sumOfIntegers() that takes two parameters, num1 and num2, both of String data type. Parse these string values as Integer and return their sum as an Integer object.
//
//Your program should follow these steps:
//
//Accept two String values, num1 and num2 as parameters.
//
//Use the Integer.parseInt() method to parse these strings into integer values.
//
//Sum the parsed integer values.
//
//Return the result as an Integer object.
//
//Return Type: Integer
//
//Example #1:
//
//Parameters:
//
//String num1 = "10"
//String num2 = "20"
//
//Return:
//
//30
public static void main(String[] args) {
    String num1 = "10";
    String num2 = "20";

    Integer result = sumOfInteger(num1, num2);
    System.out.println(result);
}
public static Integer sumOfInteger(String num1, String num2){
    int n1 = Integer.parseInt(num1);
    int n2 = Integer.parseInt(num2);
    int sum = n1 + n2;
    return Integer.valueOf(sum);
}
}
