package w10;

import com.sun.source.doctree.SeeTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Create a static method named matchIngredients() that takes two sets of ingredients (Set<String>) as parameters. The method compares the ingredients of two recipes represented by sets. If one set of ingredients contains all the ingredients from the other set, it prints a message indicating which set contains all the ingredients of the other: Recipe [1/2] contains all ingredients from Recipe [2/1]. If neither set contains all the ingredients of the other, it prints a message stating that neither set contains all the ingredients of the other: Neither recipe contains all ingredients from the other.
//
//Return Type: void
//
//Example #1:
//
//Parameter:
//
//Set<String> recipe1 = {Chocolate, Sugar, Flour}
//Set<String> recipe2 = {Chocolate, Flour}
//
//Output:
//
//Recipe 1 contains all ingredients from Recipe 2
//
//Example #2:
//
//Parameter:
//
//Set<String> recipe1 = {Chocolate, Flour}
//Set<String> recipe2 = {Chocolate, Sugar, Flour}
//
//Output:
//
//Recipe 2 contains all ingredients from Recipe 1
//
//Example #3:
//
//Parameter:
//
//Set<String> recipe1 = {Chocolate, Flour, Eggs}
//Set<String> recipe2 = {Chocolate, Sugar, Flour}
//
//Output:
//
//Neither recipe contains all ingredients from the other
public class T26_P1_SetAllMethod {
    public static void main(String[] args) {
        Set<String> recipe1 = new HashSet<>(Arrays.asList("Chocolate", "Flour"));
        Set<String> recipe2 = new HashSet<>(Arrays.asList("Chocolate", "Sugar", "Flour"));
        matchIngredients(recipe1, recipe2);

        Set<String > recipe11 = new HashSet<>(Arrays.asList("Chocolate", "Flour", "Eggs"));
        Set<String> recipe22 = new HashSet<>(Arrays.asList("Chocolate", "Sugar", "Flour"));
        matchIngredients(recipe11,recipe22);
    }

    public static void matchIngredients(Set<String> set1, Set<String> set2) {
        if (set1.containsAll(set2)) {
            System.out.println("Recipe 1 contains all ingredients from Recipe 2");
        } else if (set2.containsAll(set1)) {
            System.out.println("Recipe 2 contains all ingredients from Recipe 1");

        } else {
            System.out.println("Neither recipe contains all ingredients from the other");
        }
    }
}
