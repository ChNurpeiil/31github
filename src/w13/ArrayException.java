package w13;

public class ArrayException {
    public static void findValueAtIndex(int[] array, int index){try {
        if (array == null) {
            throw new NullPointerException("Array is null: Please provide a non-null array");
        } else if (index >= array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Array index out of bounds");
        } else {
            System.out.println("Value at index " + index + ": " + array[index]);
        }
    } catch (NullPointerException e) {
        System.out.println(e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
    }
    }

    public static void main(String[] args) {
        int[] sampleArray = { 1, 4, 7, 9, 12 };

        findValueAtIndex(sampleArray, 2); // Change the index value to test different scenarios

    }
}
