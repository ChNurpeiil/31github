package week9;

public class W8P2 {
//    Description: Write a method called calculateTotalCost() that takes three
//    arrays as input: an array of integers representing the quantity of each item,
//    an array of strings representing the name of each item, and an array of doubles
//    representing the cost of each item. The method should calculate and return the
//    total cost of all items.
//
//Params: Three arrays of equal size: an array of integers representing the quantity
// of each item, an array of strings representing the name of each item, and an array
// of doubles representing the cost of each item.
//
//Return: A double value representing the total cost of all items. If the arrays are
// not of equal size, the method should return -1.0. If one of the costs or
// quantities is negative return 0.0.
//
//Example:
//
//calculateTotalCost([2, 3, 4], ["apple", "banana", "orange"], [0.5, 0.25, 0.75]); // Returns 4.75 (2 apples at $0.5 each + 3 bananas at $0.25 each + 4 oranges at $0.75 each)
//
//calculateTotalCost([1, 0, 2], ["pizza", "spaghetti", "soda"], [10.0, 8.0, 2.0]); // Returns 14.0 (1 pizza at $10.0 each + 2 sodas at $2.0 each)
//
//calculateTotalCost([1, 2, 3], ["shirt", "pants", "shoes"], [20.0, -10.0, 30.0]); // Returns 0.0 (negative cost for pants)
//
//calculateTotalCost([1, 2, 3], ["shirt", "pants"], [20.0, 30.0, 40.0]); // Returns -1.0 (arrays of different sizes)
public static void main(String[] args) {
    int[] quantities1 = {2, 3, 4};
    String[] items1 = {"apple", "banana", "orange"};
    double[] costs1 = {0.5, 0.25, 0.75};

    int[] quantities2 = {1, 0, 2};
    String[] items2 = {"pizza", "spaghetti", "soda"};
    double[] costs2 = {10.0, 8.0, 2.0};

    int[] quantities3 = {1, 2, 3};
    String[] items3 = {"shirt", "pants", "shoes"};
    double[] costs3 = {20.0, -10.0, 30.0};

    int[] quantities4 = {1, 2, 3};
    String[] items4 = {"shirt", "pants"};
    double[] costs4 = {20.0, 30.0, 40.0};

    System.out.println(calculateTotalCost(quantities1, items1, costs1)); // Returns 4.75
    System.out.println(calculateTotalCost(quantities2, items2, costs2)); // Returns 14.0
    System.out.println(calculateTotalCost(quantities3, items3, costs3)); // Returns 0.0
    System.out.println(calculateTotalCost(quantities4, items4, costs4)); // Returns -1.0

}
public static double calculateTotalCost(int[] items, String[] names, double[] costs){
    if(items.length != names.length || items.length !=costs.length){
        return -1.0;
    }

    double totalCost=0;

    for (int i=0; i<items.length; i++){
        if (items[i] <0 || costs[i] <0){
            return 0.0;
        }
        totalCost += items[i]*costs[i];
    }
    return totalCost;
}
}
