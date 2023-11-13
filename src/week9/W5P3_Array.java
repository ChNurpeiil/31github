package week9;

public class W5P3_Array {
    public static void main(String[] args) {
        System.out.println(checkMiddle(new boolean[]{true, false, false, false, true, false})); // Returns -1
        System.out.println(checkMiddle(new boolean[]{false, false, false, true, false, false, false})); // Returns 1
        System.out.println(checkMiddle(new boolean[]{false, true})); // Returns -1
        System.out.println(checkMiddle(new boolean[]{})); // Returns -1

    }
    public static int checkMiddle(boolean[] input){
        if (input.length ==0){
            return  -1;
        } else if (input.length %2 ==1) {
            return number1(input);
        }else {
            return number2(input);
        }
    }
    public static int number1(boolean[] input){
        int n1 = input.length/2;
        if (input[n1]){
            return 1;
        } else {
            return -1;
        }

    }
    public static int number2(boolean[] input){
        int n2 = input.length /2 -1;
        int n3 = input.length/2;
        if (input[n2] && input[n3]){
            return 1;
        }else {
            return -1;
        }
    }
}
