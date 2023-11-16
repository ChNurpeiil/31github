package week9;

public class W15P3 {
    // Write a printAllNumbersInArray() method that prints out the
// elements of an array using a for-each loop.
//Parameters:
//int[] array: The array to print.
//Return: void
//Example of parameters:
//array = {1, 2, 3, 4, 5}
//Example of output:
//1
//2
//3
//4
//5
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printAllNumbersInArray(arr);
    }

    public static void printAllNumbersInArray(int[] array) {
        for (int arr : array){
            System.out.println(arr);
        }
    }
}
