package w10;

import java.util.HashSet;
import java.util.Set;

//Create a static method called organizeShoppingList() that takes two parameters: a set of items (Set<String> shoppingList) representing the current shopping list, and a string (String itemToAdd) representing the item to add to the list. The method should use the contains() method to check if the itemToAdd is already in the shopping list.
//
//If the item is not in the list, add it to the shopping list and return the updated list. If the item is already in the list, print the message: Item 'itemToAdd' is already in the list and return the original list without any modifications.
//
//Example #1:
//
//Parameters:
//
//Set<String> shoppingList = {"Milk", "Bread", "Eggs"}
//String itemToAdd = "Bananas"
//
//Return: Set<String>
//
//{"Milk", "Bread", "Eggs"}
//
//Output:
//
//["Milk", "Bread", "Eggs"]
//
//Example #2:
//
//Parameters:
//
//Set<String> shoppingList = {"Apples", "Oranges", "Bananas"}
//String itemToAdd = "Oranges"
//
//Return: Set<String>
//
//{"Apples", "Oranges", "Bananas"}
//
//Output:
//
//Item Oranges is already in the list
//["Apples", "Oranges", "Bananas"]
public class T23_P4_Set_ContainsMethod {
    public static Set<String> organizeShoppingList(Set<String> shoppingList, String itemToAdd){
        if (!shoppingList.contains(itemToAdd)){
            shoppingList.add(itemToAdd);
            return shoppingList;
        }
        else {
            System.out.println("Item "+ itemToAdd+ " is already in the list");
            return shoppingList;
        }
    }

    public static void main(String[] args) {
        Set<String> shoppingList1 = new HashSet<>(Set.of("Milk", "Bread", "Eggs"));
        String itemToAdd1 = "Bananas";

        Set<String> shoppingList2 = new HashSet<>(Set.of("Apples", "Oranges", "Bananas"));
        String itemToAdd2 = "Oranges";

        Set<String> updatedList1 = organizeShoppingList(shoppingList1, itemToAdd1);
        System.out.println(updatedList1);

        Set<String> updatedList2 = organizeShoppingList(shoppingList2, itemToAdd2);
        System.out.println(updatedList2);
    }
}
