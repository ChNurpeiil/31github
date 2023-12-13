package w14;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNull;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ArrayManipulator {
    public int[] sortArray(int[] arr) {
        if (arr == null) {
            return null;
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] reverseArray(int[] arr) {
        if (arr == null) {
            return null;
        }

        int n = arr.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - i - 1];
        }
        return reversed;
    }
}

class MainTest111 {
    //write your tests here
    @Test
    public void testSortArray(){
        ArrayManipulator arrayM = new ArrayManipulator();
        int[] inputArray = {9, 3, 6, 1, 4, 7, 5, 8, 2};
        int[] sortArray = arrayM.sortArray(inputArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectedArray, sortArray);
    }
    @Test
    public void testReverseArray(){
        ArrayManipulator arrayM = new ArrayManipulator();
        int[] inputArray = {9, 3, 6, 1, 4, 7, 5, 8, 2};
        int[] reverseArray = arrayM.reverseArray(inputArray);
        int[] expectedArray = {2, 8, 5, 7, 4, 1, 6, 3, 9};
        assertArrayEquals(expectedArray, reverseArray);
    }
    @Test
    public void testEmptyArray(){
        ArrayManipulator arrayM = new ArrayManipulator();
        int[] emptyArray = {};
        int[] sortArray = arrayM.sortArray(emptyArray);
        int[] reverseArray = arrayM.reverseArray(emptyArray);
        assertArrayEquals(emptyArray, sortArray);
        assertArrayEquals(emptyArray, reverseArray);
    }
    @Test
    public void testNullArray(){
        ArrayManipulator arrayM = new ArrayManipulator();

        int[] nullArray = null;
        int[] sortArray = arrayM.sortArray(nullArray);
        int[] reverseArray = arrayM.reverseArray(nullArray);

        assertNull(sortArray);
        assertNull(reverseArray);
    }

}
