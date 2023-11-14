package week9;
//Create a static method displayGrades() that takes two arrays of the same length as parameters: an array of student names (String values) and an array of their corresponding grades (double values). The program should associate and print all the grades in the ordered list format "#. Name - grade".
//
//Example:
//
//Parameters:
//
//String[] names = {"John", "Alice", "Bob"}
//double[] grades = {85.5, 92.0, 78.5}
//
//Return: void
//
//Output:
//
//1. John - 85.5
//2. Alice - 92.0
//3. Bob - 78.5
public class W6P3 {
    public static void main(String[] args) {
        String[] names ={"John", "Alice", "Bob"};
        double[] grades = {85.5, 92.0, 78.5};
        displayGrades(names, grades);
    }
    public static void displayGrades(String[] names, double[] grades){

        for (int i =0; i<names.length; i++){
                System.out.println((i + 1) + ". "+names[i]+" - "+grades[i]);
            }
        }
    }

