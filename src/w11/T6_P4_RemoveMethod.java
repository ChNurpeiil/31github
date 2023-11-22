package w11;

import java.util.HashMap;
import java.util.Map;

public class T6_P4_RemoveMethod {
    public static void main(String[] args) {
        Map<String, Integer> visitors1 = new HashMap<>();
        visitors1.put("Visitor1", 15);
        visitors1.put("Visitor2", 45);
        String removeVisit1 = "Visitor1";
        System.out.println(cleanupVisitorLog(visitors1, removeVisit1));

        // Example #2
        Map<String, Integer> visitors2 = new HashMap<>();
        visitors2.put("Visitor1", 15);
        visitors2.put("Visitor2", 45);
        String removeVisit2 = "Visitor2";
        System.out.println(cleanupVisitorLog(visitors2, removeVisit2));
    }
    public static Map<String, Integer> cleanupVisitorLog(Map<String, Integer> visitors, String removeVisit) {
    visitors.remove(removeVisit);

    visitors.entrySet().removeIf(entry -> entry.getValue() >30);
    return visitors;
    }
}
