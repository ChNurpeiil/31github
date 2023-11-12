package week9;

public class W4P2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 5, 12, 56, 53, 5};
        System.out.println(powerOfTwo(arr1));

        int[] arr2 = new int[]{6, 7, 20, 67};
        System.out.println(powerOfTwo(arr2));

        int[] arr3 = new int[]{-9, 54, 27, -123};
        System.out.println(powerOfTwo(arr3));

        int[] arr4 = new int[]{100, 99};
        System.out.println(powerOfTwo(arr4));
    }

    public static String powerOfTwo(int[] input) {
        if (input.length <= 2) {
            return "Not enough data";
        } else {
            int n1 = input[0];
            int n2 = input[1];
            int n3 = input[2]; // Fix the index here

            if ((n1 * n1) >= (n2 + n3)) {
                return "First is the greatest";
            } else {
                return "There is no power in first";
            }
        }
    }
}