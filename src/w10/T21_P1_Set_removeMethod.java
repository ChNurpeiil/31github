package w10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Create a static method named updateUserList() that takes the following parameters:
//
//Set<String> userList: A set containing usernames.
//
//String oldUsername: The username to be replaced.
//
//String newUsername: The username to replace oldUsername.
//
//The method should perform the following actions:
//
//Check if oldUsername exists in the userList set.
//
//If oldUsername is found in the set:
//
//Remove it from the set;
//
//Add newUsername to the set;
//
//Return the updated userList set.
//
//If oldUsername is not found in the set, return the original userList without any modifications.
//
//Example:
//
//Parameters:
//
//Set<String> userList = {"alice", "bob", "carol"}
//String oldUsername = "bob"
//String newUsername = "dave"
//
//Return: Set<String>
//
//{"alice", "carol", "dave"}
public class T21_P1_Set_removeMethod {
    public static Set<String> updateUserList(Set<String> userList, String oldUserName, String newUserName){

            if (userList.contains(oldUserName)){
                userList.remove(oldUserName);
                userList.add(newUserName);
            }


        return userList;
    }

    public static void main(String[] args) {
        Set<String> userList = new HashSet<>();
        userList.add("alice");
        userList.add("bob");
        userList.add("carol");

        String  oldUserName = "bob";
        String newUserName = "dave";
        System.out.println(updateUserList(userList, oldUserName,newUserName));

    }

}
