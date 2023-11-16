package w10;

public class Wrapper_example_P2 {
    //    Description: Write a method called countOccurrences() that takes an array of integers and a string representation of a number as input, and returns the number of occurrences of the given number in the array.
//
//Params: An array of integers. A string representation of a number.
//
//Return: A string representing the number of occurrences of the given number in the array.
//
//Example:
//
//countOccurrences([1, 2, 3, 4, 5, 4, 3, 2, 1], "4") // Returns "2"
//
//countOccurrences([1, 2, 3], "4") // Returns "0"
//
//countOccurrences([], "4") // Returns "0"
//
//Note:
//
//You should use Integer.parseInt() to parse the input string into an integer.
//
//You should use a loop to iterate over the array and count the number of occurrences of the given number.
//
//The output should be returned as a string, not an integer.
    public static void main(String[] args) {
        int[] str = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        String num = "4";
        System.out.println(countOccurrences(str, num));
        int[] str1 = {1, 2, 3};
        String num1 = "4";
        System.out.println(countOccurrences(str1, num1));
        int[] str3 = {};
        String num3 = "4";
        System.out.println(countOccurrences(str3, num3));
    }

    public static String countOccurrences(int[] input, String number) {
        int num = Integer.parseInt(number);

        if (input.length == 0 || input == null) {
            return "0";
        }

        int findNum = 0;
        for (int i = 0; i < input.length; i++) {
            if (num == input[i]) {
                findNum++;
            }


        }
        return Integer.toString(findNum);

    }
}
