package week8;

public class W5P3 {
    public static void main(String[] args) {
        int row = 3;
        int column = 4;
        int result = calculateSumInTable(row, column);
        System.out.println("Sum at Row " + row + " and Column " + column + " is: " + result);
    }

    public static int calculateSumInTable(int row, int column) {
        if (row < 1 || column < 1 || row > 15 || column > 15) {
            return -1; // Invalid input
        }

        int sum = 0;
        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j <= 15; j++) {
                if (i == row || j == column) {
                    sum += i * j;
                }
            }
        }
        return sum;
    }
}


