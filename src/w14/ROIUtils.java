package w14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ROIUtils {
    public static double calculateROI(double initialInvestment, double finalValue) {
        if (initialInvestment < 0 ) {
            System.out.println("Error: initialInvestment value cannot be negative.");
            return 0.0;
        } else if(finalValue < 0) {
            System.out.println("Error: finalValue cannot be negative.");
            return 0.0;
        }

        if (initialInvestment > 10000) {
            System.out.println("Warning: Maximum initial investment allowed is $10,000.");
            return -1.0;
        }

        double netProfit = finalValue - initialInvestment;
        double roi = (netProfit / initialInvestment) * 100;
        System.out.println("Calculation successful");
        return roi;
    }
}


class MainTest {
    //write your tests here

    @Test
    public void positiveInvestmentTest(){
        double expectedROI = 20.0;
        double delta = 0.001;
        double actualROI = (ROIUtils.calculateROI(500,600));
        Assert.assertEquals(actualROI,expectedROI,delta);
    }
    @Test
    public void negativeInitialInvestmentTest(){
        double actualROI=(ROIUtils.calculateROI(-500,600));
        Assert.assertEquals(actualROI, 0.0);
    }
    @Test
    public void negativeFinalValueTest(){
        double actualROI=(ROIUtils.calculateROI(500,-600));
        Assert.assertEquals(actualROI,0.0);
    }
    @Test
    public void negativeInvestmentTest(){

        double actualROI = (ROIUtils.calculateROI(-500,-600));
        Assert.assertEquals(actualROI,00);
    }
    @Test
    public void maxInvestmentLimitExceededTest(){
        double actualROI = (ROIUtils.calculateROI(12000,10000));
        Assert.assertEquals(actualROI, -1.0);
    }
    @Test
    public void zeoFinalValueTest(){
        double expectedROI =-100.0;
        double delta = 0.001;
        double actualROI=(ROIUtils.calculateROI(1000,0));
        Assert.assertEquals(actualROI,expectedROI,delta);
    }

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();

        mainTest.positiveInvestmentTest();
        mainTest.negativeInvestmentTest();
        mainTest.negativeFinalValueTest();
        mainTest.negativeInvestmentTest();
        mainTest.maxInvestmentLimitExceededTest();
        mainTest.zeoFinalValueTest();
    }
}

