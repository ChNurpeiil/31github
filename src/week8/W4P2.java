package week8;

public class W4P2 {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int sum = calculatePrimeNumbersInRange(start, end);
        System.out.println("Sum of prime numbers in the range: " + sum);
    }

    public static int calculatePrimeNumbersInRange(int start, int end) {
        int sum = 0;
        boolean isPrime;

        for (int i = start; i <= end; i++) {
            isPrime = true;

            if (i <= 1)
                continue;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += i;
            }
        }

        return sum;
    }
}
