package w11;

import java.util.HashMap;
import java.util.Map;

public class T10_P3_PutAll {
    public static void main(String[] args) {
        Map<String, Double> currentGrades = new HashMap<>();
        currentGrades.put("Math", 85.0);
        currentGrades.put("Science", 90.5);

        Map<String, Double> newGrades = new HashMap<>();
        newGrades.put("Math", 92.5);
        newGrades.put("History", 88.0);

        Map<String, Double> result = uploadGrades(currentGrades, newGrades);
        System.out.println("Result: " + result);
    }
    public static Map<String, Double> uploadGrades(Map<String, Double> currentGrades, Map<String, Double> newGrades){
        currentGrades.putAll(newGrades);
        return currentGrades;
    }
}
