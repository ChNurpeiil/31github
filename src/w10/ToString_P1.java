package w10;

public class ToString_P1 {
//    Create a Java static method named compareWrapperObjects() that takes two Integer wrapper objects as parameters and compares them for equality. The method should return a boolean value indicating whether the two wrapper objects are equal or not. Use toString() method and compare them using equals() method.
//
//Example #1:
//
//Parameters:
//
//Integer num1 = 323
//Integer num2 = 323
//
//Return: boolean
//
//true
public static void main(String[] args) {
Integer num1 = 323;
Integer num2 = 323;
    System.out.println(compareWrapperObjects(num1,num2));
}
    public static boolean compareWrapperObjects(int num1, int num2){
        String n1 = Integer.toString(num1);
        String n2 = Integer.toString(num2);
        return n1.equals(n2);

    }
}
