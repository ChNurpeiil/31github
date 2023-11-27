package w12;

public class T5P {
    public static void main(String[] args) {
        ChaseCheckingAccount c1 = new ChaseCheckingAccount("Nur", "hkilk111",
                1345, 5678.098);
        System.out.println(c1.accountNum);

        c1.accountNum= "0000000000";
        System.out.println(c1.accountNum);






    }
}
class  ChaseCheckingAccount{
    public String name;
    public String accountNum;
    public int routingNum;
    public double balance;

    public ChaseCheckingAccount(String name, String accountNum, int routingNum, double balance) {
        this.name = name;
        this.accountNum = accountNum;
        this.routingNum = routingNum;
        this.balance = balance;
    }


}
