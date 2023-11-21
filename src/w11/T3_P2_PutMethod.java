package w11;

import java.util.HashMap;
import java.util.Map;

public class T3_P2_PutMethod {
    public static void main(String[] args) {
        String sentence = "I have an apple and a banana";
        Map<String, Boolean> result = checkWordLength(sentence);
        System.out.println(result);
    }
    public static Map<String, Boolean> checkWordLength(String input){
        Map<String , Boolean> checkWordMap = new HashMap<>();
        if (input != null && !input.isEmpty()){
            String[] words = input.split("\\s");

            for (String word : words){
                boolean isEven= word.length() %2 ==0;
                checkWordMap.put(word,isEven);
            }
        }
        return checkWordMap;
    }
}
