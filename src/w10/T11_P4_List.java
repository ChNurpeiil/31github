package w10;

import java.util.ArrayList;
import java.util.List;

public class T11_P4_List {
    /*
    Create a static method named addEmployee() that takes two parameters: a list of existing employees (List<String>) and a new employee to add (String). The method should add the new employee to the list of existing employees and return the updated List<String>.

Example #1:

Parameters:

List<String> employees = {"John Smith", "Mary Johnson", "James Brown"}
String newEmployee = "Emily Davis"

Return: List<String>

{"John Smith", "Mary Johnson", "James Brown", "Emily Davis"}

     */
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Mary Johnson");
        employees.add("James Brown");

        String newEmployee = "Emily Davis";
        List<String> updated = addEmployee(employees, newEmployee);
        System.out.println(updated);
    }
    public static List<String> addEmployee(List<String> employees, String newEmployee){
        employees.add(newEmployee);
        return employees;
    }
}
