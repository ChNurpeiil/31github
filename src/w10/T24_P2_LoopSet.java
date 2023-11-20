package w10;

import java.util.Set;


public class T24_P2_LoopSet {
    public static void main(String[] args) {
        String message1 = "Get rich quick with our lottery deals!";
        Set<String> spamWordsList1 = Set.of("lottery", "rich", "gun", "drugs");

        String message2 = "This message contains no banned words";
        Set<String> spamWordsList2 = Set.of("lottery", "rich", "gun", "drugs");

        boolean isSpam1 = filterSpam(message1, spamWordsList1);
        boolean isSpam2 = filterSpam(message2, spamWordsList2);

        System.out.println("Message 1 is spam? " + isSpam1);
        System.out.println("Message 2 is spam? " + isSpam2);
    }
    public static boolean filterSpam(String message, Set<String> spamWordsList){
        for (String word : spamWordsList){
            if (message.toLowerCase().contains(word.toLowerCase())) {
                return true;
            }

            }
        return false;
        }
    }


