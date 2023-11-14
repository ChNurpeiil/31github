package week9;

public class W6P4 {
    public static void main(String[] args) {
        double[] temperatures = {75.2, 82.5, 78.9, 85.1, 79.4};
        printWeatherData(temperatures);
    }
    public static void printWeatherData(double[] temperatures){
        if (temperatures.length < 1 && temperatures.length>12){
            System.out.println("Invalid number of temperature values");
        }
        for (int i=0; i< temperatures.length; i++){
            System.out.println((i+1)+ " - "+ temperatures[i]);
        }
    }
}
