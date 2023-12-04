package w13;

public class Employee6 {
    String name;
    double salary;

    public Employee6(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double calculateSalary(){
        return salary;
    }
    public double calculateSalary(double bonus){
        return salary+=bonus;

    }
}
class Manager6 extends Employee6{
    public Manager6(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double calculateSalary(){
        return salary + (salary*0.1);
    }
}
class Salesperson extends Employee6{
    double salesAmount;

    public Salesperson(String name, double salary, double salesAmount) {
        super(name, salary);
        this.salesAmount = salesAmount;
    }

    @Override
    public double calculateSalary() {
        return salary+(salesAmount*0.05);
    }

    public static void main(String[] args) {
        Manager6 manager = new Manager6("Manager", 5500.0);
        Salesperson salesperson = new Salesperson("Saleperson", 5500,50);
        System.out.println("Manager's salary: $"+ manager.calculateSalary());
        System.out.println("Salesperson's salary: $"+ salesperson.calculateSalary());

    }
}
