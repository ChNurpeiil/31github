package week9;
// Description: Write a method called calculateSum() that takes
// an array of doubles and a double as input. The method should
// loop through each element of the array and perform the
// following operation: if the current element is less than the
// input double, subtract the current element from the running
// sum; if the current element is greater than the input double,
// add the current element to the running sum. The method should
// then return the final sum.
//
//Params: An array of doubles and a double.
//
//Return: A double representing the calculated sum.
public class W15P2 {
    public static void main(String[] args) {
        double[] nums1 = {1.2, 3.4, 5.6, 7.8, 9.0};
        double num1 = 5.0;
        System.out.println(calculateSum(nums1, num1)); // Returns 17.8

        double[] nums2 = {1.2, 3.4, 5.6, 7.8, 9.0};
        double num2 = 2.3;
        System.out.println(calculateSum(nums2, num2)); // Returns 24.6
    }
    public static double calculateSum( double[] nums, double num){

        if (nums.length == 0 || nums == null){
            return 0.0;
        }
        double sum = 0.0;
        for (double n : nums){
            if (n<num){
                sum-= n;
            } else if (n > num){
                sum += n;
            }
        }
        return sum;
    }
}
