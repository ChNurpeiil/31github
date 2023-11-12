package week7;

public class W2Practice2 {
    public static void main(String[] args) {
//        Create a program that uses a while loop to print out the strings
//        I have a dream... and to become a tech lead at Apple in separate lines five times each,
//        and each loop output should be separated with an empty line. Each time the
//        strings are printed, they should be on separate lines.
//
//Here's an example of what the output should look like:
//
//I have a dream...
//to become a tech lead at Apple
//
//I have a dream...
//to become a tech lead at Apple
//
//I have a dream...
//to become a tech lead at Apple
//
//I have a dream...
//to become a tech lead at Apple
//
//I have a dream...
//to become a tech lead at Apple

        int num = 1;
        while (num <= 5){
            System.out.println("I have a dream...");
            System.out.println("to become a tech lead at Apple");
            System.out.println("                 ");

            num++;
        }
    }
}
