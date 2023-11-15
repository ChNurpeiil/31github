package week9;

public class W9P4 {
    public static void main(String[] args) {
        double[] dailyStock= {110.5, 112.0, 109.75, 115.25, 118.0, 117.5, 119.75};
        findMaxStockPrice(dailyStock);
    }
    public static void findMaxStockPrice(double[] stock){
        double maxDailyStock= 0.0;
        int day = 0;
        for (int i=0; i< stock.length; i++){
            if (stock[i]>maxDailyStock){
                maxDailyStock = stock[i];
                day= i+1;
            }
        }
        System.out.println("The highest stock price was $"+ maxDailyStock+" on day " + day);
    }
}
