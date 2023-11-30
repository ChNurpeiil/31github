package w12;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    private Employee employee;
    private String name;
    private Map<String, String> openHours;
    private Set<Floor> floors;

    public Library(String name, Map<String, String> openHours) {
        this.name = name;
        this.openHours = openHours;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getOpenHours() {
        return openHours;
    }

    public void setOpenHours(Map<String, String> openHours) {
        this.openHours = openHours;
    }

    public Set<Floor> getFloors() {
        return floors;
    }

    public void setFloors(Set<Floor> floors) {
        this.floors = floors;
    }


}
class Employee{
    private String title;
    private int age;
    private double salary;
    private Floor floor;

    public Employee(String title, int age, double salary, Floor floor) {
        this.title = title;
        this.age = age;
        this.salary = salary;
        this.floor = floor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
class Floor{
    private int numberOfRooms;
    private String floorName;
    private boolean isBusy;

    public Floor(int numberOfRooms, String floorName, boolean isBusy) {
        this.numberOfRooms = numberOfRooms;
        this.floorName = floorName;
        this.isBusy = isBusy;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public static void main(String[] args) {
       Library library1 = new Library("Central Library", createOpenHours());
       Library library2 = new Library("Branch Library", createOpenHours());
       Employee employee1 = new Employee("Librarian", 30, 25000.0, createFloor("Floor 1"));
       Employee employee2 = new Employee("Assistant", 25, 20000.0, createFloor("Floor 2"));

       employee2.setAge(16);
       employee2.setSalary(60000.0);

       Floor floor1 = createFloor("Floor 3");

       floor1.setNumberOfRooms(30);

        System.out.println("Library Details:");
        System.out.println("Library 1 Name: " + library1.getName());
        System.out.println("Library 2 Name: " + library2.getName());
        System.out.println();

        System.out.println("Floor Details:");
        System.out.println("Floor 1 Name: " + floor1.getFloorName());
        System.out.println("Floor 1 Number of Rooms: " + floor1.getNumberOfRooms());
        System.out.println();

        System.out.println("Employee Details:");
        System.out.println("Employee 1 Title: "+employee1.getTitle());
        System.out.println("Employee 1 Age: "+ employee1.getAge());
        System.out.println("Employee 1 Salary: "+ employee1.getSalary());
        System.out.println("Employee 1 Floor Name: "+ employee1.getFloor().getFloorName());
        System.out.println("Employee 2 Title: "+employee2.getTitle());
        System.out.println("Employee 2 Age: "+ employee2.getAge());
        System.out.println("Employee 2 Salary: "+ employee2.getSalary());
        System.out.println("Employee 2 Floor Name: "+ employee2.getFloor().getFloorName());

    }
    private  static Map<String, String > createOpenHours(){
        Map<String, String> openHours = new HashMap<>();
        openHours.put("Monday", "7am-9pm");
        openHours.put("Tuesday", "7am-9pm");
        openHours.put("Wednesday", "7am-9pm");
        openHours.put("Thursday", "7am-9pm");
        openHours.put("Friday", "7am-9pm");
        openHours.put("Saturday", "9am-5pm");
        openHours.put("Sunday", "Closed");
        return openHours;
    }
    private static Set<Floor> createFloors(){
        Set<Floor> floors = new HashSet<>();
        floors.add(createFloor("Floor 1"));
        floors.add(createFloor("Floor 1"));
        return floors;
    }
    private static Floor createFloor(String floorName){
        return new Floor(10,floorName,false);
    }
}

