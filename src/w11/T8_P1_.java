package w11;

import java.util.HashMap;
import java.util.Map;

public class T8_P1_ {
    public static Map<String, String> validatePhoneNumbers(String phoneNumbers){

       Map<String, String> validationResult = new HashMap<>();
        String[] numbers = phoneNumbers.split(",\\s*");

        int index =0;
        boolean foundValidNumber = false;

        for (String number : numbers){
            // Remove non-digit characters
            String cleanNumber = number.replaceAll("[^0-9]", "");

            // Check validity criteria
            if (cleanNumber.length() == 10 &&
                    cleanNumber.startsWith("0") &&
                    cleanNumber.charAt(9) != '9') {

                validationResult.put(cleanNumber, String.valueOf(index));
                foundValidNumber = true;
            }

            index++;
        }

        if (!foundValidNumber) {
            validationResult.put("0", "EMPTY");
        }

        return validationResult;
    }

    public static void main(String[] args) {
        String phoneNumbers1 = "023-456-7890, 555-5555, 0876543210, 0123456789";
        Map<String, String> result1 = validatePhoneNumbers(phoneNumbers1);
        System.out.println("Result 1: " + result1);

        String phoneNumbers2 = "123-456-7890, 555-5555, 9876543210, 0123456789";
        Map<String, String> result2 = validatePhoneNumbers(phoneNumbers2);
        System.out.println("Result 2: " + result2);
    }
}
