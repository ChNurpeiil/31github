package w14;
//Exercise Title: Testing Weather Procrastinator
//
//Description:
//
//In this exercise, you will work with the WeatherProcrastinator class, which simulates weather changes with random data generation for different weather states. The WeatherProcrastinator class provides methods to set various weather conditions, including sunny, cloudy, and foggy. Your task is to write comprehensive test cases to validate the behavior of these methods.
//
//Instructions:
//
//1. Test Sunny Weather:
//
//Call the setSunny method of the WeatherProcrastinator class.
//
//Check the following variables:
//
//Check windSpeed (expected to be null).
//
//Check precipitation (expected to be null).
//
//Check visibility (expected to be null).
//
//Check temperature (expected to be within the range of 5 to 30 degrees).
//
//Check airQuality (expected to be within the range of 10 to 80).
//
//2. Test Cloudy Weather:
//
//Call the setCloudy method of the WeatherProcrastinator class.
//
//Check the following variables:
//
//Check cloudiness (expected to be within the range of 40 to 60).
//
//Check precipitation (expected to be within the range of 10 to 30).
//
//Check visibility (expected to be within the range of 5 to 45).
//
//Check temperature (expected to be within the range of 0 to 15 degrees).
//
//Check windSpeed (expected to be within the range of 0.5 to 2 km per hour).
//
//Check airQuality (expected to be null).
//
//3. Test Foggy Weather:
//
//Call the setFoggy method of the WeatherProcrastinator class.
//
//Check the following variables:
//
//Check cloudiness (expected to be within the range of 60 to 78).
//
//Check precipitation (expected to be null).
//
//Check visibility (expected to be 0).
//
//Check temperature (expected to be within the range of 2 to 5 degrees).
//
//Check windSpeed (expected to be null).
//
//Check airQuality (expected to be 10).
//
//4. Validate Weather Changes:
//
//Combine the setSunny, setCloudy, and setFoggy methods to simulate weather transitions.
//
//After each transition, check the variables to ensure they are correctly set or unset based on the weather conditions.
//
//Ensure that your test cases provide good coverage for each method of the WeatherProcrastinator class and handle different weather scenarios without specifying the assertion methods explicitly.
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.AssertJUnit.*;

public class WeatherProcrastinator {
    private Double windSpeed;
    private Integer visibility;
    private Integer temperature;
    private Integer airQuality;
    private Integer precipitation;
    private Integer cloudiness;

    public WeatherProcrastinator() {
        // Initialize all weather-related variables to null initially
        windSpeed = null;
        visibility = null;
        temperature = null;
        airQuality = null;
        precipitation = null;
        cloudiness = null;
    }

    // Method to set weather variables for a sunny day
    public void setSunny() {
        System.out.println("setSunny is triggered.");
        windSpeed = null;
        visibility = null;
        temperature = generateRandomValue(5, 30);
        airQuality = generateRandomValue(10, 80);
        precipitation = null;
    }

    // Method to set weather variables for a rainy day
    public void setRainy() {
        System.out.println("setRainy is triggered.");
        airQuality = null;
        visibility = generateRandomValue(15, 40);
        cloudiness = generateRandomValue(80, 100);
        precipitation = generateRandomValue(35, 67);
        temperature = generateRandomValue(-5, 10);
        windSpeed = generateRandomDouble(1.0, 2.0);
    }

    // Method to set weather variables for a cloudy day
    public void setCloudy() {
        System.out.println("setCloudy is triggered.");
        cloudiness = generateRandomValue(40, 60);
        precipitation = generateRandomValue(10, 30);
        visibility = generateRandomValue(5, 45);
        temperature = generateRandomValue(0, 15);
        windSpeed = generateRandomDouble(0.5, 2.0);
        airQuality = null;
    }

    // Method to set weather variables for a snowy day
    public void setSnowy() {
        System.out.println("setSnowy is triggered.");
        cloudiness = 100;
        precipitation = generateRandomValue(90, 100);
        visibility = null;
        temperature = generateRandomValue(-15, 0);
        windSpeed = generateRandomDouble(3.0, 4.0);
        airQuality = null;
    }

    // Method to set weather variables for a windy day
    public void setWindy() {
        System.out.println("setWindy is triggered.");
        cloudiness = null;
        precipitation = generateRandomValue(5, 10);
        visibility = null;
        temperature = generateRandomValue(5, 8);
        windSpeed = generateRandomDouble(8.0, 12.0);
        airQuality = generateRandomValue(2, 5);
    }

    // Method to set weather variables for a foggy day
    public void setFoggy() {
        System.out.println("setFoggy is triggered.");
        cloudiness = generateRandomValue(60, 78);
        precipitation = null;
        visibility = 0;
        temperature = generateRandomValue(2, 5);
        windSpeed = null;
        airQuality = 10;
    }

    // Helper method to generate a random integer value within a specified range
    private Integer generateRandomValue(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    // Helper method to generate a random double value within a specified range
    private Double generateRandomDouble(double min, double max) {
        Random rand = new Random();
        return min + (max - min) * rand.nextDouble();
    }

    // Getters for weather variables
    public Double getWindSpeed() {
        return windSpeed;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getAirQuality() {
        return airQuality;
    }

    public Integer getPrecipitation() {
        return precipitation;
    }

    public Integer getCloudiness() {
        return cloudiness;
    }
}

class MainTest3 {
    //write your tests here
    @Test
    public void testSunny(){
        WeatherProcrastinator weather = new WeatherProcrastinator();
        weather.setSunny();

        assertNull(weather.getWindSpeed());
        assertNull(weather.getPrecipitation());
        assertNull(weather.getVisibility());

        int temperature =weather.getTemperature();
        assertTrue(temperature >=5 && temperature <=30);

        int airQuality = weather.getAirQuality();
        assertTrue(airQuality >= 10 && airQuality <=80);

    }
    @Test
    public void testCloudy(){
        WeatherProcrastinator weather = new WeatherProcrastinator();
        weather.setCloudy();

        int cloudiness = weather.getCloudiness();
        assertTrue(cloudiness >=40 && cloudiness <= 80);

        int precipitation = weather.getPrecipitation();
        assertTrue(precipitation >=10 && precipitation <= 30);

        int visibility = weather.getVisibility();
        assertTrue(visibility >=5 && visibility <= 45);

        int temperature = weather.getTemperature();
        assertTrue(temperature >=0 && temperature <= 15);

        double windSpeed = weather.getWindSpeed();
        assertTrue(windSpeed >= 0.5 && windSpeed <= 2);

        assertNull(weather.getAirQuality());

    }
    @Test
    public void testFoggy(){
        WeatherProcrastinator weather = new WeatherProcrastinator();
        weather.setFoggy();
        int cloudiness = weather.getCloudiness();
        assertTrue(cloudiness >=60 && cloudiness <=78);
        assertNull(weather.getPrecipitation());
        assertEquals(0, (int) weather.getVisibility());
        int temperature = weather.getTemperature();
        assertTrue(temperature >= 2 && temperature <=5);
        assertNull(weather.getWindSpeed());
        assertEquals(10,(int) weather.getAirQuality());
    }
    @Test
    public void testWeatherTransition(){
        WeatherProcrastinator weather = new WeatherProcrastinator();

        weather.setSunny();

        weather.setCloudy();
        weather.setFoggy();
    }
}



