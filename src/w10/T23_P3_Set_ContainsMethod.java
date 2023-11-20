package w10;

import java.util.Set;

//Create a static method named calculateDiscount() that takes two parameters: a Set<String> representing a database of phone numbers and a String representing a phone number. The method should check if the provided phone number is not present in the database.
//
//If the phone number is not found, return a discount of 15 as an int;
//
//If the phone number is already registered, return 0 as an int.
//
//Example #1:
//
//Parameters:
//
//Set<String> phonesDataBase = {"+1234567890", "+1987654321", "+17778889999"}
//String newPhone = "+1555555555"
//
//Return: int
//
//15
//
//Example #2:
//
//Parameters:
//
//Set<String> phonesDataBase = {"+1234567890", "+1987654321", "+17778889999"}
//String newPhone = "+17778889999"
//
//Return: int
//
//0
public class T23_P3_Set_ContainsMethod {
    public static void main(String[] args) {
        Set<String> phonesDataBase = Set.of("+1234567890", "+1987654321", "+17778889999");
        String newPhone1 = "+1555555555";
        String newPhone2 = "+17778889999";

        int discount1 = calculateDiscount(phonesDataBase, newPhone1);
        int discount2 = calculateDiscount(phonesDataBase, newPhone2);

        System.out.println("Discount for newPhone1: " + discount1);
        System.out.println("Discount for newPhone2: " + discount2);
    }
    public static int calculateDiscount (Set<String> phoneNumbers, String number){
        if (!phoneNumbers.contains(number)){
            return 15;
        }else{
            return 0;
        }
    }
}
