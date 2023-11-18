package w10;

import java.util.ArrayList;
import java.util.List;

public class T14_P2_ArrayListSetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(66);
        numbers.add(80);
        numbers.add(45);
        numbers.add(-90);
        numbers.add(42);
        numbers.add(0);
        numbers.add(8);

        ArrayList<Integer> manipulated = (ArrayList<Integer>) manipulateIntegers(numbers);
        System.out.println(manipulated);


    }
    public static List<Integer> manipulateIntegers(ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);

            if (num % 5 == 0) {
                numbers.remove(i);
                i--; // Decrement index since we removed an element
            } else {
                if (num % 2 == 0) { // If the number is even
                    numbers.set(i, num * 2); // Double the value of even numbers
                } else { // If the number is odd
                    numbers.set(i, num / 2); // Halve the value of odd numbers
                }
            }
        }

        return numbers;

    }
}
