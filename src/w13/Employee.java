package w13;

public class Employee {
    protected int id;
    protected String name;
    protected double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary(){
        return salary;
    }
    public void displayDetails(){
        System.out.println("Employee ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
    }
}
class Manager extends Employee{
    private double bonus;

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary(){
        return salary+=bonus;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Bonus: "+ bonus);
    }

}
class Developer extends Employee{
    private int hoursWorked;

    public Developer(int id, String name, double salary, int hoursWorked) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary(){
        double hourlyRate = salary/160;
        return hourlyRate* hoursWorked;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Hours Worked: "+ hoursWorked);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Daniel",500000.0);
        employee.displayDetails();
        System.out.println("Calculated Salary: "+ employee.calculateSalary());
        System.out.println();

        Manager manager = new Manager(2, "Daniel", 800000.0, 150);
        manager.displayDetails();
        System.out.println("Calculate salary: "+ manager.calculateSalary());
        System.out.println();

        Developer developer = new Developer(3, "Daniel Ashibaev",4000.0, 100 );
        developer.displayDetails();
        System.out.println("Calculate Salary: "+ developer.calculateSalary());

    }
}
