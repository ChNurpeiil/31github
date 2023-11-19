package w10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

//Create a Java program that manages a subscription service for users. Develop a method removeSubscriber() that takes two parameters: a Set of strings (LinkedHashSet<String>) representing the current subscribers and the user ID to be removed (String). The method should remove the user from the subscription list and return the updated set of subscribers (LinkedHashSet<String>).
//
//Return Type: LinkedHashSet<String>
//
//Example #1:
//
//Parameter:
//
//LinkedHashSet<String> usersWithSubscriptions = new HashSet<>(Arrays.asList("User1", "User2", "User3", "User4"))
//String userToRemoveSubscription = "User3"
//
//Return:
//
//{"User1", "User2", "User4"}
public class T21_P3_Set_removeMethod {
    public static LinkedHashSet<String> removeSubscriber(LinkedHashSet<String> currentSubscribers , String  removed){
        currentSubscribers.remove(removed);
        return currentSubscribers;
    }

    public static void main(String[] args) {
        LinkedHashSet<String> userWithSubscriptions = new LinkedHashSet<>(Arrays.asList("user1", "User2", "User3", "User4"));
        String userToRemoveSubscription = "User3";
        System.out.println(removeSubscriber(userWithSubscriptions, userToRemoveSubscription));
    }
}
