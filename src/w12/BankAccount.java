package w12;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Initial balance for "+ getAccountNumber()+ " is "+ getBalance());
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Top up "+ getAccountNumber() + " for "+ amount+". "+ getBalance()+ " available");
    }
    public void withdraw(double amount){

        if (balance< amount){
            balance-=amount;
            System.out.println("Insufficient funds");

        } else {
            System.out.println("Available balance for " + getAccountNumber() + " is " + getBalance());

        }
    }


    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
class SavingsAccount extends BankAccount{
    private double interestsRate;

    public SavingsAccount(String accountNumber, double balance, double interestsRate) {
        super(accountNumber, balance);
        this.interestsRate = interestsRate;
    }
    public void calculateInterest(){
        double interest = balance * interestsRate /100;
        deposit(interest);
    }
}
class CheckingAccount extends BankAccount{
    double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdrawWithOverdraft(double amount){
        if (amount <= balance+overdraftLimit){
            balance-=amount;
            System.out.println("Balance for "+ getAccountNumber() + " is "+ getBalance());
        }else{
            System.out.println("Insufficient funds");
        }
    }
}
