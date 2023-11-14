package week9;

//Create a static method named printValuesUntilIndex() that takes two parameters: an array of integers (int[]) and an index (int).
//
//The method should print all values from the start of the array up to the specified index (inclusive).
//
//Ensure the index is within the bounds of the array. If the index is out of bounds, print an appropriate error message: Index out of bounds
//
//Return: void
//
//Example #1:
//
//Params:
//
//int[] arr = {1, 2, 3, 4, 5}
//int index = 3
//
//Output:
//
//1
//2
//3
//4
//
//Example #2:
//
//Params:
//
//int[] arr = {1, 2, 3, 4, 5}
//int index = 6
//
//Output:
//
//Index out of bounds

public class W6P2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int index1 = 3;
        printValuesUntilIndex(arr1, index1);

        int[] arr2 = {1, 2, 3, 4, 5};
        int index2 = 6;
        printValuesUntilIndex(arr2, index2);
    }
    public static void printValuesUntilIndex(int[] arr, int index){
        if (arr.length < index){
            System.out.println("Index out of bounds");
        } else {
            for (int i =0; i < index; i++){
                System.out.println(arr[i]);

                }
            }
        }

    }

