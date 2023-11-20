package w10;
////Create a Java program with a static method named findPrimesInRange() that takes two Integers, start and end, as input parameters. The method should find and return all prime numbers within the specified range, inclusive of both start and end, as a Set<Integer>. The method should have the following signature:
////
////Parameters:
////
////start (Integer): The starting value of the range (inclusive).
////
////end (Integer): The ending value of the range (inclusive).
////
////Return:
////
////Set<Integer> containing all prime numbers within the specified range or empty Set if no prime number in the range.
////
////public static Set<Integer> findPrimesInRange(int start, int end)
////
////Example:
////
////Parameters:
////
////Integer start = 1
////Integer end = 10
////
////Return: Set<Integer>
////
////[2, 3, 5, 7]
import java.util.HashSet;
import java.util.Set;

public class T24_P3_LoopSet {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        Set<Integer> primesInRange = findPrimesInRange(start, end);
        System.out.println("Prime numbers between " + start + " and " + end + ": " + primesInRange);

    }
    public static Set<Integer> findPrimesInRange(int start, int end) {
        Set<Integer> primes = new HashSet<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int divisor = 5;
        int step = 2; // Skipping even numbers

        while (divisor * divisor <= num) {
            if (num % divisor == 0) {
                return false;
            }
            divisor += step;
            step = 6 - step; // Alternating step between 2 and 4 (6 - current step)
        }

        return true;
    }
}
