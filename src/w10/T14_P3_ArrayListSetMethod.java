package w10;

import java.util.ArrayList;
import java.util.List;

public class T14_P3_ArrayListSetMethod {
    //    Description: Write a method called updateCart() that takes an ArrayList of strings, a target element, and a replacement element as input. The method should replace all occurrences of the target element in the ArrayList with the replacement element regardless of the case.
//
//Params: An ArrayList of strings, a target element (string), and a replacement element (string).
//
//Return: Updated List of Strings.
//
//Note: If ArrayList is empty, return the empty List.
    public static void main(String[] args) {
        ArrayList<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("apple");
        shoppingCart.add("Orange");
        shoppingCart.add("Banana");
        shoppingCart.add("APPLE");
        shoppingCart.add("orange");

        String targetElement = "apple";
        String replacementElement = "grape";

        List<String> updatedCart = updateCart(shoppingCart, targetElement, replacementElement);

        System.out.println("Updated Cart:");
        for (String item : updatedCart) {
            System.out.println(item);
        }
    }

    public static List<String> updateCart(ArrayList<String> input, String targetElement, String replacement) {
        ArrayList<String> result = new ArrayList<>();

        if (input.isEmpty()) {
            return result;
        }

        for (int i = 0; i < input.size(); i++) {
            String current = input.get(i);
            if (current.equalsIgnoreCase(targetElement)) {
                input.set(i, replacement);
            }
        }

        return input;
    }
}
