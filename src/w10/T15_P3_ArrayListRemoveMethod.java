package w10;

import java.util.ArrayList;
import java.util.List;

//Create a program that manages the guest list in a hotel represented using an ArrayList<String>.
//
//Implement a static method named checkOutGuests() that takes two parameters: the guest list (ArrayList<String>) and a parameter guest name to check out (String).
//
//This method should remove the specified guest from the guest list and return the updated guest list.
//
//If the provided guest name is not found in the list, return the ArrayList without changes (need to try remove the element from the list).
//
//Return Type: ArrayList<String>
//
//Example #1:
//
//Parameters:
//
//LinkedHashSet<String> guests = {"Alice", "Bob", "Charlie"}
//String checkedOutGuest = "Bob"
//
//Calling command:
//
//checkOutGuests(guests, checkedOutGuest);
//
//Return:
//
//{"Alice", "Charlie"}
//
//Example #2:
//
//Parameters:
//
//LinkedHashSet<String> guests = {"Alice", "Bob", "Charlie"}
//String checkedOutGuest = "David"
//
//Calling command:
//
//checkOutGuests(guests, checkedOutGuest);
//
//Return:
//
//{"Alice", "Bob", "Charlie"}
public class T15_P3_ArrayListRemoveMethod {
    public static void main(String[] args) {
        ArrayList<String> guests1 = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        String checkedOutGuest1 = "Bob";

        ArrayList<String> updatedGuests1 = checkOutGuests(guests1, checkedOutGuest1);
        System.out.println("Updated Guest List 1:");
        System.out.println(updatedGuests1);

        ArrayList<String> guests2 = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        String checkedOutGuest2 = "David";

        ArrayList<String> updatedGuests2 = checkOutGuests(guests2, checkedOutGuest2);
        System.out.println("\nUpdated Guest List 2:");
        System.out.println(updatedGuests2);
    }
    public static ArrayList<String> checkOutGuests (ArrayList<String> guest, String checkOut){
        boolean removed = guest.remove(checkOut);
        if (!removed) {
            return guest;
        }
        return guest;
    }
}
