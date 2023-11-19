package w10;
//Description: Write a method called calculateStatistics() that takes an ArrayList of Integer objects as input. The method should calculate the average score, find the highest score, and find the lowest score from the list.
//
//Params: An ArrayList of Integer objects.
//
//Return: An array of three elements containing the average score (at index 0), highest score (at index 1), and lowest score (at index 2).
//
//Example:
//
//ArrayList<Integer> scores = [78, 92, 85, 64]
//
//calculateStatistics(scores) //Return [79, 92, 64]
//
//Note:
//
//If the input ArrayList is empty, return an array of three elements with all values set to 0.

import java.util.ArrayList;

public class T17_P1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(78);
        scores.add(92);
        scores.add(85);
        scores.add(64);
        int[] stats = calculateStatistics(scores);
        System.out.println("Average: " + stats[0]);
        System.out.println("Highest score: " + stats[1]);
        System.out.println("Lowest score: " + stats[2]);
    }
    public static int[] calculateStatistics(ArrayList<Integer> input){
        int[] result = new int[3];

        if (input.isEmpty()){
            return result;
        }

        int sum =0;
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int score : input){
            sum+=score;

            if (score> max){
                max = score;
            }
            if (score < min){
                min = score;
            }
            int average = sum /input.size();

            result[0]= average;
            result[1] = max;
            result[2] = min;

        } return  result;
    }

}
