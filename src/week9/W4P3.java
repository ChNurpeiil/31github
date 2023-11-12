package week9;

public class W4P3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 1};
        System.out.println(subtractFromArray(arr));

        int[] arr1 = new int[]{2,3,5,12,56,53,5};
        System.out.println(subtractFromArray(arr1));

        int[] arr2 = new int[]{100, -1};
        System.out.println(subtractFromArray(arr2));

        int[] arr3 = new int[]{18};
        System.out.println(subtractFromArray(arr3));

        int[] arr4 = new int[]{0,0};
        System.out.println(subtractFromArray(arr4));
    }
    public static  int subtractFromArray(int[] input){
//        int[] first = new int[0];
//        int[] second = new int[1];
//        if (first.length > second.length){
//            return first.length-second.length;
//        } else if (first.length < second.length) {
//            return second.length - first.length;
//        }else {
//            return 777;
//        }
        if (input.length <= 1){
            return 777;
        }else {
            int first = input[0];
            int second = input[1];
            if (first > second){
                return first-second;
            } else {
                return second - first;
            }
        }
    }
}
