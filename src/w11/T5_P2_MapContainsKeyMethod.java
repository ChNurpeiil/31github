package w11;

import java.util.HashMap;
import java.util.Map;

public class T5_P2_MapContainsKeyMethod {
    public static String searchContact(Map<String,String> phoneBook , String name){
        Map<String,String> result = new HashMap<>();
        if (phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }else {
            return "Contact not found";
        }
    }

    public static void main(String[] args) {
        Map<String, String> phoneBook =new HashMap<>();
        phoneBook.put("John Doe","123-456-7890");
        phoneBook.put("Alice Smith","987-654-3210");

        String name = "Bob Jhonson";
        String name1 = "Alice Smith";

        System.out.println(searchContact(phoneBook, name));
        System.out.println(searchContact(phoneBook, name1));
    }
}
