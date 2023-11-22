package w11;

import java.util.HashMap;
import java.util.Map;

public class T7_P2_replaceMethod {
    public static Map<String, Double> adjustProductPrices(Map<String, Double> products, String productName, Double newPrice){
        Map<String, Double> result = new HashMap<>();
        products.replace(productName,newPrice);
        return products;
    }

    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Laptop", 899.99);
        products.put("Phone", 599.99);

        String productName = "Laptop";
        Double newPrice = 799.99;

        System.out.println(adjustProductPrices(products, productName, newPrice));
    }
}
