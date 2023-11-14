package week9;

public class W6P5 {
    //    Please note that this exercise is at a Hard level and is not mandatory. You can return to it later if you have difficulty solving it. It is recommended to use for-loop, if-statement and external variables before for-loop to store the index and value of the most expensive item.
//
//Create a static method named findTheMostExpensiveItem() that takes the following arrays with the same length as parameters:
//
//An array of product names (String values).
//
//An array of product prices (double values).
//
//An array of product colors (String values).
//
//An array of product memory capacities (int values).
//
//The method should return the specification of the most expensive inventory's item in format below.
//
//Example:
//
//Parameters:
//
//String[] names = {"Laptop", "Smartphone", "Tablet"}
//double[] prices = {799.99, 399.99, 299.99}
//String[] colors = {"Silver", "Black", "White"}
//int[] storage = {1024, 512, 64}
//
//Return: void
//
//Output:
//
//Product: Laptop
//Price: $799.99
//Color: Silver
//Storage: 1024GB
    public static void main(String[] args) {
        String[] names = {"Laptop", "Smartphone", "Tablet"};
        double[] prices = {799.99, 399.99, 299.99};
        String[] colors = {"Silver", "Black", "White"};
        int[] storage = {1024, 512, 64};

        findTheMostExpensiveItem(names, prices, colors, storage);
    }

    public static void findTheMostExpensiveItem(String[] names, double[] prices, String[] colors, int[] storage) {

        if (names.length == 0 || names.length != prices.length || names.length != colors.length || names.length != storage.length) {
            System.out.println("Invalid input arrays");
            return;
        }

        int mostExpensiveIndex = 0;
        double mostExpensivePrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (mostExpensivePrice < prices[i]) {
                mostExpensiveIndex = i;
                mostExpensivePrice = prices[i];
            }
        }

        System.out.println("Product: " + names[mostExpensiveIndex]);
        System.out.println("Price: $" + mostExpensivePrice);
        System.out.println("Color: " + colors[mostExpensiveIndex]);
        System.out.println("Storage: " + storage[mostExpensiveIndex] + "GB");
    }

}
