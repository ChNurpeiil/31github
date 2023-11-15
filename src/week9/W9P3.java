package week9;

public class W9P3 {
    public static void main(String[] args) {
        double[] expenses = {50.0, 75.5, 120.75, 90.25, 150.0, 85.5, 200.0};
        findMostExpensiveDay(expenses);
    }
    public static void findMostExpensiveDay(double[] expenses){
        double mostExpensesDay = 0.0;
        int dayExpensive = 1;

        for (int i=0; i <expenses.length; i++){
            if (expenses[i] > mostExpensesDay){
                mostExpensesDay = expenses[i];
                dayExpensive = i+1;
            }
        }
        System.out.println("The highest expenses were $"+ mostExpensesDay+" on day "+dayExpensive);
    }
}
