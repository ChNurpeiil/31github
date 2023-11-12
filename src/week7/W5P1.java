package week7;

public class W5P1 {
    //    Write a Java program that prints out each character of
//    8 planets Mercury, Venus, Earth, Mars, Jupiter, Saturn,
//    Uranus, and Neptune in separate lines using 8 while loops.
//    After printing all the characters of each planet,
//    print out "=========" to separate each planet.
//
//Input: There is no input required for this program.
//
//Output: The program should output each character of the 8
// planets, with each character printed on a separate line.
// After each planet's characters have been printed, the program
// should print out "=========" to separate each planet.
    public static void main(String[] args) {
        String result = repeatString("Hello", 4, 3);
        System.out.println(result);
    }

    public static String repeatString(String str, int columns, int rows) {
        int currentRow = 1;
        String result = "";

        while (currentRow <= rows) {
            int currentColumn = 1;
            while (currentColumn <= columns) {
                result += str;
                if (currentColumn < columns) {
                    result += str; // Add a horizontal repetition
                }
                currentColumn++;
            }

            if (currentRow < rows) {
                result += "\n"; // Add a new line for vertical repetition
            }
            currentRow++;
        }

        return result;
    }
}




