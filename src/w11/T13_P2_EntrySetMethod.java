package w11;

import java.util.HashMap;
import java.util.Map;

public class T13_P2_EntrySetMethod {
    public static void findLargestCity(Map<String, Integer> input){
        Integer largestValue = Integer.MIN_VALUE;
        String keyLargest = null;
        for (Map.Entry<String, Integer> var : input.entrySet()){
            if (var.getValue() > largestValue ){
                largestValue= var.getValue();
                keyLargest = var.getKey();
            }
        }
        System.out.println("The city with the highest population is "+keyLargest+" with a population of " + largestValue);
    }

    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Chicago", 2697000);
        phoneBook.put("Los-Angeles", 3849000);
        phoneBook.put("Houston", 2288000);

        findLargestCity(phoneBook);
    }
}
