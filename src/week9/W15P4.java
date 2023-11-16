package week9;

public class W15P4 {
    //    Create a static method named calculateAverageGrade() that
//    takes a double[] array of student's grades as a parameter.
//    Calculate and return the average grade as double.
//Example:
//Parameters:
//double[] grades = {90.0, 85.5, 88.2, 92.7}
//Return: 89.1
    public static void main(String[] args) {
        double[] grades = {90.0, 85.5, 88.2, 92.7};
        calculateAverageGrade(grades);
    }

    public static void calculateAverageGrade(double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        System.out.println(sum / grades.length);
    }
}
