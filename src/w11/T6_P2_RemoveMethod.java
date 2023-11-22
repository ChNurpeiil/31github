package w11;

import java.util.HashMap;
import java.util.Map;

//Create a static method named removePhonebookEntry() that takes two parameters: a Map<String, String> representing a phonebook (with names as keys and phone numbers as values), and a String representing the name of the person whose phone number should be removed. The method should remove the entry for the specified name from the phonebook and return the updated phonebook.
//
//Return type: Map<String, String>
//
//Example:
//
//Parameters:
//
//Map<String, String> phonebook = {"Alice": "123-456-7890", "Bob": "987-654-3210", "Charlie": "555-123-4567"}
//String deleteContact = "Bob"
//
//Return:
//
//{"Alice": "123-456-7890", "Charlie": "555-123-4567"}
public class T6_P2_RemoveMethod {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Alice", "123-456-7890");
        phonebook.put("Bob", "987-654-3210");
        phonebook.put("Charlie", "555-123-4567");

        String deleteContact ="Bob";

        System.out.println(removePhonebookEntry(phonebook,deleteContact));
    }
    public static Map<String, String> removePhonebookEntry(Map<String, String> phonebook, String name){
        Map<String, String> phone = new HashMap<>();
        phonebook.remove(name);
        return phonebook;
    }
}
