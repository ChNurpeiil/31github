package w11;

import java.util.Map;
import java.util.TreeMap;

public class T9_P2_clearMethod {
    public static Map<Integer, Boolean> binarySwitching(String input) {
        Map<Integer, Boolean> result = new TreeMap<>();
        boolean isZeroSequence = input.charAt(0) == '0';
        int startIndex = 0;

        for (int i = 1; i < input.length(); i++) {
            if ((isZeroSequence && input.charAt(i) == '0') || (!isZeroSequence && input.charAt(i) == '1')) {
                result.put(i - 1, isZeroSequence);
                startIndex = i;
            } else if ((isZeroSequence && input.charAt(i) == '1') || (!isZeroSequence && input.charAt(i) == '0')) {
                result.clear();
                result.put(i, !isZeroSequence);
                isZeroSequence = !isZeroSequence;
                startIndex = i;
            }
        }

        if (result.isEmpty()) {
            result.put(startIndex, isZeroSequence);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result 1: " + binarySwitching("0000"));
        System.out.println("Result 2: " + binarySwitching("1100101"));
        System.out.println("Result 3: " + binarySwitching("010100"));
    }
}
