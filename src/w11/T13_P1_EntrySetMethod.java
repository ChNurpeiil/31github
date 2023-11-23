package w11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T13_P1_EntrySetMethod {
    public static void main(String[] args) {

         }

    public static String[] getKeysGreaterThanDivision(Map<String, Integer> map, Double divisor) {
        if (divisor == 0.0) {
            return map.keySet().toArray(new String[0]);
        }
        double sum = map.values().stream().mapToInt(Integer::intValue).sum();
        double divisionResult = sum / divisor;
        List<String> keysGreaterThanDivision = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > divisionResult) {
                keysGreaterThanDivision.add(entry.getKey());
            }
        }

        return keysGreaterThanDivision.toArray(new String[0]);
    }
}