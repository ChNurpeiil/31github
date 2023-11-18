package w10;

import java.util.ArrayList;

//Create a static method named printPopulationData() that takes an ArrayList of Integer values (ArrayList<Integer>) as a parameter. This method should to print each population value along with its corresponding index in the ArrayList on a new line. For example: 0 - 1000, 1 - 1200, 2 - 1500.
//
//Use for-loop and print current loop's index to indicate the index in ArrayList.
//
//Return Type: void
//
//Example #1:
//
//Parameter:
//
//ArrayList<Integer> population = new ArrayList<>({100000, 120000, 150000})
//
//Output:
//
//0 - 100000
//1 - 120000
//2 - 150000
public class T16_P2_LoopsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> population = new ArrayList<>();
        population.add(100000);
        population.add(120000);
        population.add(150000);
        printPopulationData(population);
    }
    public static void printPopulationData(ArrayList<Integer> param){
        for (int i =0; i<param.size(); i++){
            System.out.println(i+" - "+param.get(i));
        }

        for (int num : param){
            System.out.println(num);
        }
    }
}
