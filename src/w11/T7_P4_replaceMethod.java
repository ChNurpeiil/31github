package w11;

import java.util.HashMap;
import java.util.Map;

public class T7_P4_replaceMethod {
    public static Map<String, Double> addOrUpdateGrade(Map<String, Double> gradeBook, String studentName, Double newGrade){
        if (gradeBook.containsKey(studentName)){
            gradeBook.put(studentName, newGrade);
        }else {
            gradeBook.replace(studentName, newGrade);

        }
        return gradeBook;
    }

    public static void main(String[] args) {
        Map<String, Double> gradeBook = new HashMap<>();
        gradeBook.put("Alice", 92.5);
        gradeBook.put("Bob" , 88.0);
        gradeBook.put("Carol",  95.75);

        String studentName = "Bob";
        Double newGrade = 90.5;

        System.out.println(addOrUpdateGrade(gradeBook,studentName, newGrade));
    }
}
