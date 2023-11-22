package w11;

import java.util.HashMap;
import java.util.Map;

public class T7_P1_replaceMethod {
    public static void main(String[] args) {
        Map<Integer, String> result = new HashMap<>();

        String names = "Chris Brad; Tom Misch; Kate Stewart";
        System.out.println(manageMap(names));
    }
    public static Map<Integer, String> manageMap(String names){
        Map<Integer, String> result = new HashMap<>();

        if (!names.isEmpty() || names == null){


            String[] words = names.split("; ");
            int index = 1;
            for (String word : words){
                result.put(index++,word);
            }
        }
        return result;
    }
}
