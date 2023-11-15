package week9;

public class W8P4 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        double[] grades = {92.5, 88.0, 95.5, 79.0};

        analyzeStudentGrades(names, grades);

    }

    public static void analyzeStudentGrades(String[] names, double[] grades) {
        if (names.length != grades.length) {
            System.out.println("Arrays must be of the same length.");
            return;
        }

        double average = 0.0;
        double highest = 0.0;
        double lowest = Double.MAX_VALUE;
        String topScorer = "";
        String lowestScorer = "";
        for (int i = 0; i < grades.length; i++) {
            average += grades[i] / grades.length;

            if (grades[i] > highest) {
                highest = grades[i];
                topScorer = names[i];

            }

            if (grades[i] < lowest) {
                lowest = grades[i];
                lowestScorer = names[i];
            }


        }


        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Top Scorer: " + topScorer);
        System.out.println("Lowest Scorer: " + lowestScorer);
    }
}
