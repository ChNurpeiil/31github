package w10;

import java.util.ArrayList;
import java.util.List;

//Description: Write a method called removeDuplicates() that takes an ArrayList of integers. If the element is present more than one time in a list, all occurrences of that element should be removed.
//
//Params: An ArrayList of integers.
//
//Return: An ArrayList with duplicates removed.
//
//Example:
//
//removeDuplicates([1, 2, 3, 4, 5]) // Returns [1, 2, 3, 4, 5]
//
//removeDuplicates([10, 20, 10, 35, 22, 40, 10]) // Returns [20, 35, 22, 40]
//
//removeDuplicates([5, 1, 5, 20, -99, 0, 1, 6, 5, 1]) // Returns [20, -99, 6]
public class T15_P2_ArrayListRemoveMethod {
public static List<Integer> removeDuplicates(ArrayList<Integer> input){
    ArrayList<Integer> removeList = new ArrayList<>();

    for (int i=0; i<input.size();i++){
        int num =input.get(i);
        while (removeList.lastIndexOf(num) != i){
            removeList.remove((Integer) num);
        }

    }
    return removeList;
}

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(-5);
        numbers.add(7);
        numbers.add(-2);
        numbers.add(0);

        List<Integer> updatedNumbers = removeDuplicates(numbers);

        System.out.println("Unique Numbers:");
        for (Integer num : updatedNumbers) {
            System.out.println(num);
        }
    }
}
// this no work , I come back soon!