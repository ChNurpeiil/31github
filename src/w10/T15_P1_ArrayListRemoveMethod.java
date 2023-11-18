package w10;

import java.util.ArrayList;
import java.util.List;

public class T15_P1_ArrayListRemoveMethod {
    //    Description: Write a method called removeNegativeNumbers() that takes an ArrayList of integers as input. The method should remove all negative numbers from the list and return the updated list.
//
//Params: An ArrayList of integers.
//
//Return: An ArrayList of integers with negative numbers removed.
//
//Example:
//
//ArrayList<Integer> numbers = {10, -5, 7, -2, 0}
//
//removeNegativeNumbers(numbers) // Return [10, 7, 0]
//
//Note:
//
//The removeNegativeNumbers() method should iterate through the list, check each number, and remove any negative numbers encountered.
//
//After removing negative numbers, the method should return the updated list.
//
//If the input list is empty or doesn't contain any negative numbers, the method should return the same list without any changes.
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-5);
        numbers.add(7);
        numbers.add(-2);
        numbers.add(0);

        List<Integer> updatedNumbers = removeNegativeNumbers(numbers);

        System.out.println("Updated Numbers:");
        for (Integer num : updatedNumbers) {
            System.out.println(num);
        }
    }

    public static List<Integer> removeNegativeNumbers(ArrayList<Integer> input) {
        ArrayList<Integer> resultList = new ArrayList<>();

        if (input.isEmpty()){
            return new ArrayList<>();
        }

        for (int i = 0; i < input.size(); i++) {
            int num = input.get(i);

            if (num >= 0) {
                resultList.add(num);

            }
        }
        return resultList;
    }
}
