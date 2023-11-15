package week9;

public class W10P1 {
    public static void main(String[] args) {
        String sentence = "Today is a good day";
        String lastWord = findLastWord(sentence);
        System.out.println("Last word: " + lastWord);
    }
    public static String findLastWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "No words found.";
        }

        // Split the sentence by spaces into an array of words
        String[] words = sentence.split(" ");

        // If there are no words after splitting, return "No words found."
        if (words.length == 0) {
            return "No words found.";
        }

        // Return the last word in the array
        return words[words.length - 1];
    }
}
