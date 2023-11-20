package w10;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

//You are tasked with implementing a password checker for a banking application registration process. The goal is to ensure that the user's chosen password has not been previously compromised by checking against a database of leaked passwords available in the public domain. You should create a static method named isSecurePassword() that takes a Set<String> and a user-provided password as a String parameter and returns a boolean value indicating whether the password is secure.
//
//Your isSecurePassword() method should perform the following checks:
//
//Check if the password contains at least 8 characters.
//
//Verify that the password is not a common password found in the database of known leaked passwords in lowercase.
//
//Example #1:
//
//Parameters:
//
//Set<String> leakedPasswords = {"password123", "qwerty", "12345678"}
//String password = "SecurePassword"
//
//Return: boolean
//
//true
//
//Example #2:
//
//Parameters:
//
//Set<String> leakedPasswords = {"password123", "qwerty", "12345678"}
//String password = "Secure"
//
//Return: boolean
//
//false
//
//Example #3:
//
//Parameters:
//
//Set<String> leakedPasswords = {"password123", "qwerty", "12345678"}
//String password = "pAsSwOrD123"
//
//Return: boolean
//
//false
public class T23_P2_Set_ContainsMethod {
    public static boolean isSecurePassword(Set<String> leakedPasswords, String password){

        if (password.length() < 8){
            return  false;
        }

        Set<String> lowerCaseLeaked = convertToLowerCase(leakedPasswords);

        String lowerCasePasswords = password.toLowerCase();
        if (lowerCaseLeaked.contains(lowerCasePasswords)){
            return false;
        }
        return true;
    }
    private static Set<String> convertToLowerCase (Set<String> password){
        Set<String> lowerCasePasswords = new HashSet<>();
        for (String pass : password){
            lowerCasePasswords.add(pass.toLowerCase());
        }
        return lowerCasePasswords;
    }

    public static void main(String[] args) {
        Set<String> leakedPasswords = Set.of("password123", "qwerty", "12345678");
        String password1 = "SecurePassword";
        String password2 = "Secure";
        String password3 = "pAsSwOrD123";

        System.out.println("Is password1 secure? " + isSecurePassword(leakedPasswords, password1));
        System.out.println("Is password2 secure? " + isSecurePassword(leakedPasswords, password2));
        System.out.println("Is password3 secure? " + isSecurePassword(leakedPasswords, password3));

    }
}
