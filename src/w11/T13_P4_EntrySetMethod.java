package w11;

import java.util.HashMap;
import java.util.Map;

public class T13_P4_EntrySetMethod {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Dialogue", "Education"};
        countAndPrintVowels(words);
    }
    public static void countAndPrintVowels(String[] words){
        Map<String, Integer> map = new HashMap<>();

        for (String word : words){
            int vowelCount =0;
            String lowercaseWord = word.toLowerCase();

            for (int i =0; i < lowercaseWord.length();i++){
                char ch= lowercaseWord.charAt(i);
                if (ch == 'a' || ch == 'o' || ch == 'u' || ch == 'e' || ch == 'i'){
                    vowelCount++;
                }
            }
            map.put(word, vowelCount);
        }

        int maxCount = Integer.MIN_VALUE;
        String wordWithMaxCount = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue()> maxCount){
                maxCount = entry.getValue();
                wordWithMaxCount= entry.getKey();
            }
        }
        if (wordWithMaxCount != null){
            System.out.println(wordWithMaxCount + " - " + maxCount);
        }
    }
}
