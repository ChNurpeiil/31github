package w10;

import java.util.ArrayList;
import java.util.List;

public class T10_P1 {
//    Description: Write a method called addToList() that takes a string as input. The method should return the List of type String with the input string added.
//
//Params: A string.
//
//Return: A List of Strings.
//
//Example:
//
//addToList("Hello 123 World!") // Returns List that contains "Hello 123 World!" in it.
//
//Note: If the input string is empty, the method should return an empty List. Also, no need to import anything.
public static void main(String[] args) {
    String input = "Hello 123 World!";
    List<String> resultList = addToList(input);

    // Printing the elements in the list
    for (String str : resultList) {
        System.out.println(str);
    }
}
public static List<String> addToList(String input){
    List<String> list = new ArrayList<>();
    if (!input.isEmpty()){
        list.add(input);
    }

    return list;
}
}
