package w11;

import java.util.*;

public class T14_P4_MapList {

    static String  recordOrder(Map<String, List<String>> orders, String username, List<String> newOrder){
        List<String> userOrders = new ArrayList<>();
        if (orders.containsKey(username)){
            userOrders.addAll(orders.get(username));
        }
        userOrders.addAll(newOrder);
        return "Customer " +username + " has placed order for " + userOrders;
    }
    public static void main(String[] args) {
        // Example usage
        Map<String, List<String>> orders = new HashMap<>();
        orders.put("Alice", Arrays.asList("Item A", "Item B"));
        orders.put("Bob", Collections.singletonList("Item X"));

        String username1 = "Alice";
        List<String> orderToChange = Arrays.asList("Item C", "Item D");

        String result1 = recordOrder(orders, username1, orderToChange);
        System.out.println("Result 1: " + result1);

        String username2 = "Bob";
        List<String> newOrder = Collections.singletonList("Item Y");

        String result2 = recordOrder(orders, username2, newOrder);
        System.out.println("Result 2: " + result2);
    }
}
