package w10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class T13_P1_ArrayListSizeMethod {
  /*
  Description: Write a method called filterAnimals() that takes an array of animal names and a specific letter as input. The method should filter out the animal names that start with the given letter and return them as a List of type String regardless of the case.

Params: An array of animal names (strings) and a specific letter (string).

Return: A List of animal names (strings) that start with the given letter.

Example:

String[] animalNames = {"Lion", "Elephant", "Tiger", "Giraffe", "Leopard", "Zebra"};

filterAnimals(animalNames, "L"); // Returns ["Lion", "Leopard"]

filterAnimals(animalNames, "E"); // Returns ["Elephant"]

filterAnimals(animalNames, "G"); // Returns ["Giraffe"]

Note: If no elements are found, return an empty list. Enter names with space and a letter on a new line for testing. If the input letter is not alphabetic return list with 'Not allowed' text.
   */
  public static void main(String[] args) {
    List<String> animalNames = new ArrayList<>(List.of("Lion", "Elephant", "Tiger", "Giraffe", "Leopard", "Zebra"));

    System.out.println(filterAnimals(animalNames, "L")); // Returns ["Lion", "Leopard"]
    System.out.println(filterAnimals(animalNames, "E")); // Returns ["Elephant"]
    System.out.println(filterAnimals(animalNames, "G")); // Returns ["Giraffe"]
    System.out.println(filterAnimals(animalNames, "")); // Returns []
    System.out.println(filterAnimals(animalNames, "5")); // Returns ["Not allowed"]

  }
  public static List<String> filterAnimals(List<String> animalNames, String letter){
    List<String> result = new ArrayList<>();
    if (letter.isEmpty()){
      return result;
      }
    char c = letter.charAt(0);
    if (!Character.isLetter(c)){
      return List.of("No allowed");
    }
    letter=letter.toLowerCase();
    for (String name : animalNames){
      if (name.toLowerCase().startsWith(letter)){
        result.add(name);
      }
    }
    return result;
  }
}
