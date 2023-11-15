package week9;

public class W10P3 {
    public static void main(String[] args) {
        String[] sentences = {"Hello World", "Java Code", "Test Results"};
        String replacement = "WEDEVX";

        String[] modifiedSentences = replaceLastWord(sentences, replacement);

        // Printing the modified sentences
        for (String modifiedSentence : modifiedSentences) {
            System.out.println(modifiedSentence);
        }

    }
    public static String[] replaceLastWord(String[] sentences, String replacement) {
        if (sentences == null || sentences.length == 0) {
            return new String[0]; // Return an empty array if no sentences are provided
        }

        String[] modifiedSentences = new String[sentences.length];

        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];

            if (sentence == null || sentence.isEmpty()) {
                modifiedSentences[i] = sentence; // Preserve empty or null strings
                continue;
            }

            // Split the sentence by spaces into an array of words
            String[] words = sentence.split(" ");

            // If there is only one word or no words, keep the sentence unchanged
            if (words.length <= 1) {
                modifiedSentences[i] = sentence;
                continue;
            }

            // Replace the last word with the specified replacement
            StringBuilder modifiedSentence = new StringBuilder();
            for (int j = 0; j < words.length - 1; j++) {
                modifiedSentence.append(words[j]).append(" ");
            }
            modifiedSentence.append(replacement);

            modifiedSentences[i] = modifiedSentence.toString();
        }

        return modifiedSentences;
    }
}
