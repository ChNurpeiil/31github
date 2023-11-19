package w10;

import java.util.HashSet;
import java.util.Set;

//Create a static method named manageCart() that takes three parameters: a Set<String> shoppingCart, a boolean variable isAdd, and a String variable item. If isAdd is true, add the item to the shopping cart. If isAdd is false, remove the item from the shopping cart. Return the updated shopping cart as a Set<String>.
//
//Example #1:
//
//Parameters:
//
//Set<String> shoppingCart = {"carrot", "water", "potato"}
//boolean isAdd = true
//String item = "chocolate"
//
//Return: Set<String>
//
//{"carrot", "water", "potato", "chocolate"}
//
//Example #2:
//
//Parameters:
//
//Set<String> shoppingCart = {"carrot", "water", "potato"}
//boolean isAdd = false
//String item = "carrot"
//
//Return: Set<String>
//
//{"water", "potato"}
public class T21_P2_Set_removeMethod {
    public static Set<String> manageCart(Set<String> shoppingCart, boolean isAdd, String item) {
        if (isAdd) {
            shoppingCart.add(item);
        } else {
            shoppingCart.remove(item);
        }
        return shoppingCart;
    }

    public static void main(String[] args) {
        Set<String> shoppingCart = new HashSet<>();
        shoppingCart.add("carrot");
        shoppingCart.add("water");
        shoppingCart.add("potato");

        boolean isAdd = true;
        String item = "chocolate";
        System.out.println(manageCart(shoppingCart, isAdd, item));

        Set<String> shoppingCart1 = new HashSet<>();
        shoppingCart1.add("carrot");
        shoppingCart1.add("water");
        shoppingCart1.add("potato");
        boolean isAdd1 = false;
        String item1 = "carrot";
        System.out.println(manageCart(shoppingCart1, isAdd1, item1));


    }
}
