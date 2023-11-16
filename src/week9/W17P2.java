package week9;

public class W17P2 {
    //    Write a method accessElement2D() that prints out the
//    element at the specified row and column of a 2D array.
//Parameters:
//int[][] array: The 2D array to access.
//int row: The row of the element to access.
//int column: The column of the element to access.
//Example of parameters:
//array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
//row = 2
//column = 1
//        1  2  3
//array = 4  5  6
//        7  8  9
//Example of output:
//5
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = 2;
        int column = 1;
        accessElement2D(array, row, column);
    }

    public static void accessElement2D(int[][] array, int row, int column) {
        if (row >= 0 && row < array.length && column >= 0 && column < array[0].length) {
            int element = array[row][column];
            System.out.println("Element at row " + row + " and column " + column + ": " + element);
        } else {
            System.out.println("Invalid row or column!");
        }
    }
}
