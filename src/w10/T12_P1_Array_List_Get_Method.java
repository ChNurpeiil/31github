package w10;

import java.util.ArrayList;
import java.util.List;

public class T12_P1_Array_List_Get_Method {
    /*
    Description: Write a method called getListElement() that takes an ArrayList of integers and an index as input. The method should return the element at the specified index in the list.

Params: An ArrayList of integers, an index (int). (For testing: enter numbers in one line separated by space to create a List of numbers. Enter index on new line)

Return: The element at the specified index in the List.

Example:

getListElement([1, 2, 3, 4, 5], 2) // Returns 3

getListElement([10, 20, 30, 40], 3) // Returns 40

getListElement([5, 10, 15, 20], 0) // Returns 5

Note: The index is zero-based, so the first element is at index 0. If the index is negative return -1.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4,5));
        System.out.println(getListElement(list1,2));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(10, 20, 30, 40));
        System.out.println(getListElement(list2, 3)); // Returns 40

        ArrayList<Integer> list3 = new ArrayList<>(List.of(5, 10, 15, 20));
        System.out.println(getListElement(list3, 0)); // Returns 5
    }
    public static int getListElement(ArrayList<Integer> input, int index){
        if (index < 0){
            return -1;
        }
        int list1 = input.get(index);
        return list1;


    }
}
