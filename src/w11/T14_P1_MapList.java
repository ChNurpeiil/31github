package w11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T14_P1_MapList {

    public static void main(String[] args) {
        // Example usage
        String input = "OpenAI is an artificial intelligence company";
        Map<Character, List<String>> result = separateWordsByStartingLetter(input);

        System.out.println("Output:");
        for (Map.Entry<Character, List<String>> entry : result.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
    public static Map<Character, List<String>> separateWordsByStartingLetter(String input){
        Map<Character, List<String>> resultMap = new HashMap<>();

        String[] words = input.split("\\s+");

        for (String  word : words){
            if (!word.isEmpty()){
                char startLetter = word.charAt(0);
                resultMap.put(startLetter, new ArrayList<>());
                resultMap.get(startLetter).add(word.replaceAll("[^a-zA-Z-]", ""));
            }
        }
        return resultMap;
    }
}
