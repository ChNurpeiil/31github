package w12;

public class Employee11 {
    protected String name;
    protected String employeeId;
    protected double salary;

    public Employee11(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee ID: "+ employeeId);
        System.out.println("Name: "+ name);
        System.out.println("Salary: $"+salary);
    }
}
class Manager extends Employee11{
    private String department;

    public Manager(String name, String employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }
    public void manageTeam(){
        System.out.println(name+" is managing the "+ department+" team");
    }
}
class Developer extends Employee11{
    private String programmingLanguage;

    public Developer(String name, String employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void writeCode(){
        System.out.println(name+" is writing code in "+ programmingLanguage);
    }
}
class Main17{
    public static void main(String[] args) {
        Employee11 employee = new Employee11("John Doe", "E123",50000);
        Manager manager = new Manager("John Doe", "M456", 80000,"IT");
        Developer developer = new Developer("Jane Smith", "D789", 115000, "Java");

        employee.displayDetails();

        manager.displayDetails();
        manager.manageTeam();

        developer.displayDetails();
        developer.writeCode();
    }
}
