package w10;

import java.util.ArrayList;
import java.util.List;

public class T12_P2_Array_List_Cet_Method {
    /*
    Create a Java static method named getMovieTitle() for managing a movie night queue. The method should take 2 parameters: a list of movies in the form of a List<String> and an index in range from 0 to last index of a list as an int. The program should display the movie title.

Example #1:

Parameters:

List<String> movieList = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"}
int movieIndex = 3

Return: String

Movie4

Example #2:

Parameters:

List<String> movieList = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"}
int movieIndex = 2

Return: String

Movie3
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(List.of("Movie1", "Movie2", "Movie3", "Movie4", "Movie5"));
        System.out.println(getMovieTitle(list1, 3));
        System.out.println(getMovieTitle(list1, 2));
        System.out.println(getMovieTitle(list1,0));

    }
    public static String  getMovieTitle(List<String>  input, int index){
        String str = input.get(index);
        return str;
    }
}
