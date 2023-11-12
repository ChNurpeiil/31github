package week9;

public class W4P4 {
    public static void main(String[] args) {
        int[] arr = new int[]{-3, 2, 3, 4, 5};
        System.out.println(printFirstElement(arr));
//        int el = arr[0];
//        if (el <= 0){
//            System.out.println(new int[]{el});
//        }else {
//            System.out.println(el);
//        }

    }
    public static int printFirstElement(int[] array) {
        if (array.length > 0) {
            int firstElement = array[0];
            if (firstElement > 0) {
                return firstElement;
            }
        }
        return 0;
    }
}
