package w11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T14_P3_MapList {
    public static void main(String[] args) {
        // Example usage
        Map<String, List<Double>> gradeBook = new HashMap<>();
        gradeBook.put("Alice", Arrays.asList(90.0, 85.0, 92.0, 88.0, 76.0));
        gradeBook.put("Charlie", Arrays.asList(95.0, 89.0, 94.0, 88.0, 91.0));
        gradeBook.put("Bob", Arrays.asList(78.0, 88.0, 92.0, 70.0, 84.0));

        calculateAndDisplayAverageGrades(gradeBook);
    }
    public static void calculateAndDisplayAverageGrades(Map<String, List<Double>> gradeBook){
        for (Map.Entry<String,List<Double>> entry : gradeBook.entrySet()){
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            double sum=0;
            for (double grade : grades){
                sum+=grade;
            }
            double average = sum/ grades.size();
            System.out.println(studentName+ " " + average);
        }
    }
}
