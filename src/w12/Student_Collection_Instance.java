package w12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student_Collection_Instance {
    private static List<String> studentList = new ArrayList<>();
    private Map<String, Integer> marks = new HashMap<>();
    private final String yearOfBirth;

    public Student_Collection_Instance(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public static List<String> getStudentList() {
        return studentList;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }
    public void addStudent(String name){
        studentList.add(name);
    }
    public void addMarks(String subject, int marks){
        if (marks >= 0 || marks <= 100){
            this.marks.put(subject, marks);
        }else {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        Student_Collection_Instance students = new Student_Collection_Instance("2000");

// Adding students

        students.addStudent("Alice");

        students.addStudent("Bob");

// Adding marks for subjects

        students.addMarks("Math", 90);

        students.addMarks("Science", 85);

        students.addMarks("English", 92);

// Retrieving student list

        List<String> studentList = Student_Collection_Instance.getStudentList();

        System.out.println("Student List: " + studentList);

// Retrieving marks

        Map<String, Integer> marks = students.getMarks();

        System.out.println("Marks: " + marks);

// Retrieving year of birth

        String yearOfBirth = students.getYearOfBirth();

        System.out.println("Year of Birth: " + yearOfBirth);
    }
}
