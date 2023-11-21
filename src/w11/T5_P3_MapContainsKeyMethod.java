package w11;

import java.util.HashMap;
import java.util.Map;

//Create a static method called isProductAvailable().You are tasked with creating a product availability checker that determines whether a given product is available in stock. You will use a Map to store product names as keys and the quantity available as values, where the value is an integer representing the number of units in stock.
//
//Method Name: isProductAvailable()
//
//Parameters:
//
//productAvailability(Type: Map<String, Integer>): A map containing product names as keys and their availability status as values.
//
//productName (Type: String): The name of the product you want to check.
//
//Return Type: int
//
//Functionality:
//
//The isProductAvailable() method should take the productAvailability Map and a String parameter productName, representing the name of the product you want to check.
//
//This method should use the containsKey() method to check if the productName exists in the map. If the product name is found, it should return the quantity of the product available (the value associated with that key). If the product name is not found in the map, it should return 0 to indicate that the product is not available. If the product is not found, it should return 0
//
//Example #1:
//
//Parameters:
//
//Map<String, Integer> productAvailability = {"Laptop":5, "Phone":0, "Tablet":10}
//String productName = "Phone"
//
//Return: int
//
//0
//
//Example #2:
//
//Parameters:
//
//Map<String, Integer> productAvailability = {"Laptop":5, "Phone":0, "Tablet":10}
//String productName = "Tablet"
//
//Return: int
public class T5_P3_MapContainsKeyMethod {
    public static int isProductAvailable(Map<String, Integer> productAvailability, String productName){
        Map<String, Integer> newMap = new HashMap<>();
        if (productAvailability.containsKey(productName)){
            return productAvailability.get(productName);
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> productAvailability  = new HashMap<>();
        productAvailability.put("Laptop",5);
        productAvailability.put("Phone",0);
        productAvailability.put("Tablet",10);

        String productName = "Phone";
        String name2 = "Tablet";
        String name3 = "Iphone";

        System.out.println(isProductAvailable(productAvailability,productName));
        System.out.println(isProductAvailable(productAvailability, name2));
        System.out.println(isProductAvailable(productAvailability, name3));
    }
}
