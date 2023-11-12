package week9;

public class W4P1 {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 5, 1};
        System.out.println(calculateArray(arr));

    }

    public static int calculateArray(int[] input) {
        int length = input.length;
        if (length > 1){
            return input[0]+input[input.length-1];
        }else {
            return 1;
        }
    }
}