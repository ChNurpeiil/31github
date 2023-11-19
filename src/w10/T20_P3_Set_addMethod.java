package w10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

//Create a Java program that allows users to manage the ingredients for their recipes. Implement a static method named addIngredient() that takes a Set of ingredients (LinkedHashSet<String>) and a new ingredient (String) as parameters. The method should add the new ingredient to the set and return the modified set (LinkedHashSet<String>).
//
//Return Type: Set<String>
//
//Parameters:
//
//LinkedHashSet<String> ingredients
//String newIngredient
//
//Example:
//
//Calling command:
//
//addIngredient(ingredients, "Flour");
//
//Return:
//
//{"Flour"}
//
//Calling command:
//
//addIngredient(ingredients, "Sugar");
//
//Return:
//
//{"Flour", "Sugar"}
//
//Output:
//
//{"Flour"}
//{"Flour", "Sugar"}
public class T20_P3_Set_addMethod {
    public static LinkedHashSet<String> addIngredient(LinkedHashSet<String> ingredients, String newIngredient){
        ingredients.add(newIngredient);
        return ingredients;
    }

    public static void main(String[] args) {
        LinkedHashSet<String> ingredient = new LinkedHashSet<>();
        String newIngredient = "Flour";
        System.out.println(addIngredient(ingredient, newIngredient));

        String newIngredient1 = "Sugar";
        System.out.println(addIngredient(ingredient, newIngredient1));

    }
}
