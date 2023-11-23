package w11;

import java.util.HashMap;
import java.util.Map;

public class T12_P4_ValuesMethod {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rainbow sunset )");
        map.put(2, "This is a test.");
        map.put(3, "Java Programming");

        int unevenCount = countUnevenValues(map);
        System.out.println("Count of values with uneven characters: " + unevenCount);

    }
    public static int countUnevenValues(Map<Integer, String> map){
        int count =0;
        for (String value: map.values()){
            String cleanedValue = value.replaceAll("[\\s,.]","");

            if (cleanedValue.length()%2 !=0){
                count++;
            }
        }
        return count;
    }
}
