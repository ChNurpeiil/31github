package w13;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner("Helllo World");

        for (int i = 1; i <=3; i++){
            String element = readNextElement(sc);
            if (!element.isEmpty()){
                System.out.println("Element "+ i+": "+ element);
            }else {
                System.out.println("Element "+ i+ ": ");
            }
        }
    }
    public static String readNextElement(Scanner sc){
        try{
            return sc.next();
        }catch (NoSuchElementException e ){
            System.out.println("Error: No more elements to read.");
            return "";
        }

    }
}
