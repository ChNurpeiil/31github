package week9;

public class W8P5 {
    public static void main(String[] args) {
        double[] income = {2500.0, 2400.0, 2200.0, 2100.0, 2300.0, 2400.0, 2500.0, 2600.0, 2700.0, 2800.0, 2500.0, 2400.0};
        double[] expenses = {2600.0, 2700.0, 2800.0, 2900.0, 2800.0, 2600.0, 2400.0, 2300.0, 2400.0, 2500.0, 2700.0, 2600.0};

        analyzeMonthlyBudget(income, expenses);
    }

    public static void analyzeMonthlyBudget(double[] income, double[] expenses) {
        if (income.length != expenses.length) {
            System.out.println("Arrays must be of the same length.");
        }

        double totalSumDeficitSurplus = 0.0;
        String deficitOrSurplus = "";
        for (int i = 0; i <income.length; i++){

            if(income[i] < expenses[i]){
                deficitOrSurplus = "Deficit";
                totalSumDeficitSurplus = expenses[i]-income[i];

            }else {
                deficitOrSurplus = "Surplus";
                totalSumDeficitSurplus = income[i] - expenses[i];

            }
            System.out.println("Month "+ (i+1) + ": " + deficitOrSurplus+" of $"+totalSumDeficitSurplus);
            totalSumDeficitSurplus= income[i]+expenses[i];
        }

        System.out.println("Total Surplus/Deficit for the Year: $-" +totalSumDeficitSurplus);
    }





//        if (income.length != expenses.length) {
//            System.out.println("Arrays must be of the same length.");
//            return;
//        }
//
//        double totalSurplusDeficit = 0.0;
//
//        for (int i = 0; i < income.length; i++) {
//            double surplusDeficit = income[i] - expenses[i];
//            totalSurplusDeficit += surplusDeficit;
//
//            if (surplusDeficit >= 0) {
//                System.out.println("Month " + (i + 1) + ": Surplus of $" + surplusDeficit);
//            } else {
//                System.out.println("Month " + (i + 1) + ": Deficit of $" + Math.abs(surplusDeficit));
//            }
//        }
//
//        System.out.println("Total Surplus/Deficit for the Year: $" + totalSurplusDeficit);










}
