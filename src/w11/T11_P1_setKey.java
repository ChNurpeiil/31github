package w11;

import java.util.HashMap;
import java.util.Map;

public class T11_P1_setKey {
    public static void displayScoreboard(Map<String, Integer> scoreboard){
        int num =0;
        for (String key : scoreboard.keySet()){
            num++;
            System.out.println( num + ". " + key);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> scoreboard = new HashMap<>();
        scoreboard.put("Bob", 1200);
        scoreboard.put("Alice", 950);
        scoreboard.put("Charlie", 800);
        scoreboard.put("David", 1050);

        displayScoreboard(scoreboard);
    }

}
