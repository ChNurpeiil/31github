package w10;

public class ToString_P3 {
//    You are developing a microservice that determines whether to approve a car rental request based on certain conditions. However, this microservice can only accept responses in the form of a string. You need to create a static method, decideRentalApproval(), that takes three parameters: age (an int), driving experience (an int), and income (a double). The method should return a String representation of a boolean value.
//
//The rental request should be approved if the following conditions are met:
//
//The age (1st parameter) is greater than or equal to 21.
//
//The driving experience (2nd parameter) is greater than or equal to 2 years.
//
//The income (3rd parameter) is greater than or equal to $40,000.00.
//
//If all these conditions are met, the method should return the string true. Otherwise, it should return the string false.
//
//Return Type: String
//
//Example #1:
//
//Parameters:
//
//int age = 25
//int drivingExperience = 3
//double income = 45000.00
//
//Return:
//
//true
//
//Example #2:
//
//Parameters:
//
//int age = 22
//int drivingExperience = 1
//double income = 40000.00
//
//Return:
//
//false
public static void main(String[] args) {
    int age = 25;
    int drivingExperience = 3;
    double income = 45000.00;
    System.out.println(decideRentalApproval(age, drivingExperience,income));

    int age1 = 22;
    int drivingExperience1 = 1;
    double income1 = 40000.00;
    System.out.println(decideRentalApproval(age1, drivingExperience1,income1));

}
public static String decideRentalApproval(int age, int drivingExperience, double income){
    boolean answer;
    if (age >=21 && drivingExperience >= 2 && income >= 40000.00){
        answer = true;
    } else {
        answer = false;
    }
    return Boolean.toString(answer);
}
}
