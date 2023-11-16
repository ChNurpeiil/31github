package week9;

public class W17P1 {
    public static void main(String[] args) {
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            int[][] transposed = transposeMatrix(matrix);

            // Display the transposed matrix
            for (int[] row : transposed) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }

    public static int[][] transposeMatrix(int[][] matrix) {
        // Check if the matrix is empty or not square
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return new int[0][0]; // Return an empty 2D array
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j]; // Swap rows and columns
            }
        }

        return transposedMatrix;
    }
}
