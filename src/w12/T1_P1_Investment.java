package w12;

public class T1_P1_Investment {
   public String investmentId;
   public String investmentName;
   public double initialInvestment;
   public double currentValue;
   public boolean isProfitable;

    public T1_P1_Investment(){
        investmentId = "";
        investmentName = "";
        initialInvestment = 0.0;
        currentValue = 0.0;
        isProfitable = false;
    }

    public T1_P1_Investment(String id, String name, double initial, double current, boolean isProfitableParam){
        investmentId =id;
        investmentName= name;
        initialInvestment = initial;
        currentValue= current;
        isProfitable = isProfitableParam;
    }
        public  void  displayInvestment(){
            System.out.println("Investment ID: " + investmentId);
            System.out.println("Investment Name: " + investmentName);
            System.out.println("Initial Investment: $" + initialInvestment);
            System.out.println("Current Value: $" + currentValue);
            System.out.println("Is Profitable: " + isProfitable);
        }
    public static void main(String[] args) {
        T1_P1_Investment defaultParam = new T1_P1_Investment();

        System.out.println("Default");
        defaultParam.displayInvestment();

        T1_P1_Investment customInvestment = new T1_P1_Investment("IN","Stive", 4.55, 3.55, true);

        System.out.println("Custom Investment" );
        customInvestment.displayInvestment();
    }

}

