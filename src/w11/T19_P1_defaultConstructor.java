package w11;
//Description: Create a class called "CreditCard" that represents a credit card.
//
//The class should have five public instance variables:
// "cardNumber" (String), "cardHolderName" (String),
// "creditLimit" (double), "currentBalance" (double),
// and "isBlocked" (boolean).
public class T19_P1_defaultConstructor {
//     my class will be another

    String cardNumber;
    String cardHolderName;
    double creditLimit;
    double currentBalance;
    boolean isBlocked;

    public T19_P1_defaultConstructor() {
        System.out.println("Hello from Constructor");

    }
        public static void main(String[] args) {
            T19_P1_defaultConstructor creditCard = new T19_P1_defaultConstructor();

        }



}