package week9;

public class W8P1 {
//  Description: Write a method called isSumOfEvenDivisibleByFive() that takes an array of integers as input and returns true if the sum of all even numbers in the array is divisible by 5, otherwise return false.
//
//Params: An array of integers.
//
//Return: A boolean value representing whether the sum of all even numbers in the array is divisible by 5.
//
//Example:
//
//isSumOfEvenDivisibleByFive([1, 2, 3, 4, 5, 6]); // Returns false, since the sum of even numbers (2 + 4 + 6) is 12, which is NOT divisible by 5.
//
//isSumOfEvenDivisibleByFive([10, 20, 30, 40, 50]); // Returns true (10 + 20 + 30 + 40 + 50) is 150, which is divisible by 5.
//
//isSumOfEvenDivisibleByFive([0, 0, 0, 0, 0, 0]); // Returns true
//
//isSumOfEvenDivisibleByFive([]); // Returns false
public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5, 6};
    int[] arr2 = {10, 20, 30, 40, 50};
    int[] arr3 = {0, 0, 0, 0, 0, 0};
    int[] arr4 = {};

    System.out.println(isSumOfEvenDivisibleByFive(arr1)); // Returns false
    System.out.println(isSumOfEvenDivisibleByFive(arr2)); // Returns true
    System.out.println(isSumOfEvenDivisibleByFive(arr3)); // Returns true
    System.out.println(isSumOfEvenDivisibleByFive(arr4)); // Returns false
}
public static boolean isSumOfEvenDivisibleByFive(int[] arr){
    if(arr.length == 0){
        return false;
    }

    int sum = 0;
    for (int i= 0; i<arr.length; i++){
        if (arr.length %2 ==0){
            sum+=arr[i];
        }


    }
    if(sum / 5 ==0){
        return true;
    } else{
        return false;
    }


}
}
