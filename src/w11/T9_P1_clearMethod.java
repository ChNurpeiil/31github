package w11;

import java.util.HashMap;
import java.util.Map;

public class T9_P1_clearMethod {
    public static Map<String, Integer> resetCart(Map<String, Integer> cart, boolean clear){
        if(clear){
             cart.clear();
             return cart;
        }else{
            return cart;
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> cart = new HashMap<>();
        cart.put("Apples", 3);
        cart.put("Bananas", 2);
        cart.put("Chocolates", 5);


        boolean clear = false;
        boolean clear1 = true;

        System.out.println(resetCart(cart, clear));
        System.out.println(resetCart(cart, clear1));
    }

}
