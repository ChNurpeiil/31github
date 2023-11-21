package w11;

import java.util.Map;
import java.util.TreeMap;

//Description: Write a method called checkPrimeNumbers() that takes an integer as input and returns a Map object containing each number from 1 to the input value (or from the input value to -1 if the input is negative) as a key and a boolean value indicating whether the number is prime or not.
//
//Params: An integer representing the range of numbers to check.
//
//Return: A Map object with number-prime pairs, where the key is the number (Integer) and the value is a boolean (true for prime, false for non-prime).
//
//Example:
//
//int number = 10;
//
//checkPrimeNumbers(number); // Returns { 1 : false, 2 : true, 3 : true, 4 : false, 5 : true, 6 : false, 7 : true, 8 : false, 9 : false, 10 : false }
//
//Note: use TreeMap to put by natural order.
public class T3_P3_PutMethod {
    public static Map<Integer, Boolean> checkPrimeNumbers(int num){
        Map<Integer, Boolean> primeMap = new TreeMap<>();

        int start;
        int end ;
        int step;

        if (num >0 ){
            start = 1;
            end= num+1;
            step=1;
        }
        else{
            start = num;
            end =0;
            step = -1;
        }
        for (int i=start; i != end; i += step){
            boolean isPrime =isPrimeNumber(i);
            primeMap.put(Math.abs(i), isPrime);

        }
        return primeMap;
    }
    private static boolean isPrimeNumber(int num){
        if (num <= 1){
            return false;
        }
        for (int i= 2; i <=num/2; i++){
            if (num % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 10;
        Map<Integer, Boolean> result = checkPrimeNumbers(number);
        System.out.println(result);
    }
}
