package w10;

public class Wrapper_P1 {
    //    Description: Write a method called calculateAverage() that takes an array of integers as input and returns the average value of the array as a double.
//
//Params: An array of integers.
//
//Return: A double representing the average value of the array.
//
//Example:
//
//calculateAverage([1, 2, 3, 4, 5]) // Returns 3.0
//
//calculateAverage([10, 25]) // Returns 17.5
//
//calculateAverage([-5, 0, 5]) // Returns 0.0
//
//Note: Use wrapper methods to perform arithmetic operations, and do not convert the array elements to primitive types.
    public static void main(String[] args) {
        int[] str = {1, 2, 3, 4, 5};//3.0
        int[] str1 = {10, 25};//17.5
        int[] str2 = {-5, 0, 5};//0.0

        System.out.println(calculateAverage(str));
        System.out.println(calculateAverage(str1));
        System.out.println(calculateAverage(str2));
    }

    public static double calculateAverage(int[] input) {

        double sum = 0;
        for (int i=0; i<input.length;i++){
            sum+=input[i];
        }
        double average = sum / input.length;
        return average;
    }
}
