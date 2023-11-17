package w10;

import java.util.ArrayList;
import java.util.List;

public class T11_P2_List {
/*
A tourist operator needs to collect the names of all participants for a trip. To do this, you are required to create a Java program that includes a static method registerParticipants(). This method takes two parameters: a list of already registered people (List<String>) and the name of the new participant (String). The method should add the new participant's name to the list and return the updated List<String> containing all the registered participants.

Example:

Parameters:

List<String> touristsList = {"Anna Smith", "John Johnson", "Maria Garcia", "Michael Brown"}
String newTourist = "Sarah Martinez"

Return: List<String>

{"Anna Smith", "John Johnson", "Maria Garcia", "Michael Brown", "Sarah Martinez"}
 */
public static void main(String[] args) {

    List<String> touristList = new ArrayList<>();
    touristList.add("Anna Smith");
    touristList.add("John Johnson");
    touristList.add("Maria Garcia");
    touristList.add("Michael Brown");

    String newTourist = "Sarah Martinez";
    List<String> updatedList =registerParticipants(touristList, newTourist);
    System.out.println(updatedList);

} public static List<String> registerParticipants(List<String> touristsList, String newTourist){
        touristsList.add(newTourist);
        return touristsList;
    }

}
