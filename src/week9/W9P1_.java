package week9;

public class W9P1_ {
    public static void main(String[] args) {
        int[] intArray = {2, 6, 8, 24, 12};

        double[] doubleArray = {0.5, 1.25, 0.75, 2.5, 0.1};

        findAndCalculate(intArray, doubleArray); // Returns 23.5
    }

    public static void findAndCalculate(int[] intNum, double[] doubleNum) {
        int right = intNum[1];
        int left = intNum[0];

        double right1 = doubleNum[1];
        double left1 = doubleNum[0];

        int highest = 0;
        double small = 0.0;

        for (int i = 0; i < intNum.length; i++) {


            if (left < right) {
                right1 = doubleNum[i];
            } else {
                left = right;
                right1 = doubleNum[i];
            }


            small = right1;


            if(left>right){
                right = intNum[i];
            }
            else{
                left = right;
                right = intNum[i];
            }
            highest= left;
        }


        double betweeen = highest -small;

        System.out.println(highest);
        System.out.println(small);
        System.out.println(betweeen);



    }

}


//    public static double findAndCalculate(int[] intNum, double[] doubleNum){
//        int right = intNum[1];
//        int left = intNum[0];
//
//        double right1 = doubleNum[1];
//        double left1 = doubleNum[0];
//
//        int highest = 0;
//        double small = 0.0;
//
//        for (int i =0; i < intNum.length; i++){
//
//
//            if (left <right){
//                right1 = doubleNum[i];
//            }else {
//                left = right;
//                right1= doubleNum[i];
//            }
//
//
//            small =right1;
//
//
//
//
//
//            if (left > right) {
//                right= intNum[i];
//            }else {
//                left=right;
//                right = intNum[i];
//            }
//
//            highest =left;
//
//        }
//
//        return small;
//
//
//    }
//
//}