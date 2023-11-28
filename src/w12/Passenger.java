package w12;

public class Passenger {
    static final int MAX_CAPACITY = 200;
    static final String PASSENGER_TYPE = "Regular";

    int passengerId;
    String passengerName;
    int age;
    boolean osFrequentFlyer;

    static int totalPassengers = 0;
    static String airlineName = "";

    static int getTotalPassengers(){
        return totalPassengers;
    }
    static String getAirlineName(){
        return airlineName;
    }
    static void setAirlineName(String name){
        Passenger.airlineName= name;
    }

    public Passenger(int passengerId, String passengerName, int age, boolean osFrequentFlyer) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.age = age;
        this.osFrequentFlyer = osFrequentFlyer;
        totalPassengers++;
    }
    public void displayPassengerDetails(){
        System.out.println("Passenger Details:");
        System.out.println("Passenger ID : "+ passengerId);
        System.out.println("Name: " + passengerName);
        System.out.println("Age:" + age);
        System.out.println("Frequent Flyer: " +osFrequentFlyer);

    }
    public void printPassengerType(){
        System.out.println("Passenger Type: " + PASSENGER_TYPE);
    }
    public void changePassengerName(String newName){
        this.passengerName = newName;
    }

    public static void main(String[] args) {
        Passenger.setAirlineName("XYZ Airlines");

        Passenger passenger = new Passenger(1, "John Doe", 30,true);
        passenger.displayPassengerDetails();

        Passenger passenger1 = new Passenger(2, "Daniel", 15, false);
        passenger1.displayPassengerDetails();

        System.out.println("Total Passengers: " + Passenger.getTotalPassengers());
        System.out.println("Airline Name: " + Passenger.getAirlineName());


    }
}
