package week9;

public class W14P1 {
    public static void main(String[] args) {
        String[] array = {"Red", "Green", "Blue", "Yellow"};

        forEachPrinter(array);
    }
    static void forEachPrinter(String[] inputArray) {
        for (String element : inputArray) {
            System.out.println(element);
        }
    }
}
