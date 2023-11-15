package week9;

public class W8P3 {
    public static void main(String[] args) {
        int[] quantities1 = {2, 3, 4};
        String[] items1 = {"apple", "banana", "orange"};
        double[] costs1 = {0.5, 0.25, 0.75};

        int[] quantities2 = {1, 0, 2};
        String[] items2 = {"coffee", "tea", "juice"};
        double[] costs2 = {10.0, 8.0, 2.0};

        int[] quantities3 = {1, 2, 3};
        String[] items3 = {"pizza", "burger", "fries"};
        double[] costs3 = {20.0, 10.0, 30.0};



        System.out.println(calculateTotalCost(quantities1, items1, costs1)); // Returns 4.75
        System.out.println(calculateTotalCost(quantities2, items2, costs2)); // Returns 14.0
        System.out.println(calculateTotalCost(quantities3, items3, costs3)); // Returns 0.0

    }
    public static double calculateTotalCost(int[] quantity, String[] names, double[] cost){
        if (quantity.length != names.length || quantity.length != cost.length){
            return -1;
        }
        double totalCost = 0.0;

        for (int i = 0; i < quantity.length; i++){
            if (quantity[i] < 0 || cost[i] <0){
                return -1;
            }
            if (names[i].length() %2 ==0){
                totalCost += quantity[i]* cost[i];
            }

        }
        return totalCost;
    }
}
