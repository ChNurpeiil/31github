package w11;

import java.util.HashMap;
import java.util.Map;

public class T8_P3 {
    public static void main(String[] args) {
        Map<String, Integer> library = new HashMap<>();
        library.put("Item 1", 2);
        library.put("Item 2", 10);

        System.out.println(cleanShoppingCart(library));

    }
    public static String cleanShoppingCart(Map<String, Integer> cart ){
        if (cart.isEmpty()){
            return "The cart is empty";
        }else {
            return "Removed from the cart: "+cart;
        }
    }
}
