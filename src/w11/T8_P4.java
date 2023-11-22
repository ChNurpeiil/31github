package w11;

import java.util.HashMap;
import java.util.Map;

public class T8_P4 {

    public static String registerUser(Map<String, String> registration){
        if (registration.isEmpty()|| registration.containsValue("") || registration.containsKey("")){
            return "Username and password cannot be empty";
        }else if (registration.size() !=1){
            return "Invalid registration data";
        }else {
            return "Registration successful";
        }
    }

    public static void main(String[] args) {
        Map<String, String> registrationData = new HashMap<>();
        registrationData.put("JohnDoe", "NotGoodPassword123");

        String result = registerUser(registrationData);
        System.out.println(result);
    }
}
