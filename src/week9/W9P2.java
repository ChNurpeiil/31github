package week9;

public class W9P2 {
    public static void main(String[] args) {
        int[] temperature = {105, 82, 79, 88, 92, 86, 78};
        findMaxTemperature(temperature);
    }

    public static void findMaxTemperature(int[] temperature) {
        int maxTemp = temperature[0];
        int day = 1;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > maxTemp) {
                maxTemp = temperature[i];
                day = i + 1;
            }
        }
        System.out.println("The highest temperature was " + maxTemp + " on day" + day);
    }
}

