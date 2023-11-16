package week9;

public class W17P3 {
    public static void main(String[] args) {
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            String rowOrColumn = "column";
            int index = 3;

            int result = calculateSum(matrix, rowOrColumn, index);
            System.out.println("Sum: " + result); // Print the calculated sum
    }
        public static int calculateSum(int[][] matrix, String rowOrColumn, int index) {
            int sum = 0;

            // Checking if the index is out of bounds
            if (index < 0 || (rowOrColumn.equals("row") && index >= matrix.length) || (rowOrColumn.equals("column") && index >= matrix[0].length)) {
                return 0; // Return 0 if the index is out of bounds
            }

            if (rowOrColumn.equals("row")) {
                // Calculate sum of the specified row
                for (int i = 0; i < matrix[index].length; i++) {
                    sum += matrix[index][i];
                }
            } else if (rowOrColumn.equals("column")) {
                // Calculate sum of the specified column
                for (int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][index];
                }
            }

            return sum;
        }


}
