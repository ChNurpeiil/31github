package w10;

public class ParseWrapper_P3 {
//    Create a static method named getFirstCharacter() that takes a String parameter firstName. This method should parse the first character of the provided firstName string and return it as a capitalized Character object using String's charAt() method. Use toUpperCase() method to capitalize letters. Return the first capitalized character.
//
//Return Type: Character
//
//Example #1:
//
//Parameter:
//
//String firstName = "gioanii"
//
//Return:
//
//'G'
//
//Hint:
//
//Make sure you use the String methods in the correct order.
//gioanni -> GIOANNI -> G
//Adam -> ADAM -> A
//eUGENE -> EUGENE -> E
public static void main(String[] args) {
    String str = "gionni";
    String str1 = "Adam";
    String str3 = "eUGENE";


    System.out.println(getFirstCharacter(str1));
    System.out.println(getFirstCharacter(str));
    System.out.println(getFirstCharacter(str3));
}
public static Character getFirstCharacter(String firstName){
    char ch = firstName.toUpperCase().charAt(0);
    return ch;
}
}
