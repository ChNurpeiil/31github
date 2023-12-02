package w12;

public class Person {
    public String name;
    public int age;
    public double height;
    public double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

}
class Student extends Person{
    public String studentId;
    public int gradeLevel;
    public double GPA;
    public String major;

    public Student(String name, int age, double height, double weight, String studentId, int gradeLevel, double GPA, String major) {
        super(name, age, height, weight);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
        this.major = major;
    }
    public Student(String name, int age, double height, double weight) {
        super(name, age, height, weight);
        this.studentId = "N/A";
        this.gradeLevel = 0;
        this.GPA = 0;
        this.major = "N/A";
    }

    public Student(String name, int age, String studentId, int gradeLevel) {
        super(name, age, 0, 0);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = 0;
        this.major = "N/A";
    }

    public Student(String name, int age) {
        super(name, age, 0, 0);
        this.studentId = "N/A";
        this.gradeLevel = 0;
        this.GPA = 0;
        this.major = "N/A";
    }

    public Student() {
        super("N/A", 0, 0, 0);
        this.studentId = "N/A";
        this.gradeLevel = 0;
        this.GPA = 0;
        this.major = "N/A";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, 165, 55, "ID123", 3, 3.5, "Computer Science");
        Student student2 = new Student("Bob", 21, 175, 70);
        Student student3 = new Student("Carol", 19, "ID456", 2);
        Student student4 = new Student("David", 18);
        Student student5 = new Student(); // Using the default constructor

        // Accessing information about the students
        System.out.println("Student 1: " + student1.name + ", " + student1.age + ", " + student1.studentId + ", " + student1.major);
        System.out.println("Student 2: " + student2.name + ", " + student2.age + ", " + student2.studentId + ", " + student2.major);
        System.out.println("Student 3: " + student3.name + ", " + student3.age + ", " + student3.studentId + ", " + student3.major);
        System.out.println("Student 4: " + student4.name + ", " + student4.age + ", " + student4.studentId + ", " + student4.major);
        System.out.println("Student 5: " + student5.name + ", " + student5.age + ", " + student5.studentId + ", " + student5.major);

    }
}
