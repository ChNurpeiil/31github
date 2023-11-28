package w12;

import java.util.ArrayList;
import java.util.List;

public class Account_Collections_Instance {
    static final String bankName= "XYZ Bank";
    static int totalAccounts = 0;

    String accountNumber;
    List<String> accountHolders;
    List<Double> transactions;

    public Account_Collections_Instance(String accountNumber, List<String> accountHolders) {
        this.accountNumber = accountNumber;
        this.accountHolders = accountHolders;
        this.transactions = new ArrayList<>();
        totalAccounts++;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public List<String> getAccountHolders(){
        return accountHolders;
    }
    public List<Double> getTransactions(){
        return transactions;
    }
    public void addTransaction(double amount){
        transactions.add(amount);
    }

    public double getBalance(){
        double balance =0;
        for (double transaction : transactions){
            balance+=transaction;
        }
        return balance;
    }
    public boolean hasAccountHolder(String accountNumber){
        return accountNumber.contains(accountNumber);
    }

    public static void main(String[] args) {
        List<String> accountHolders = new ArrayList<>();
        accountHolders.add("Daniel");
        accountHolders.add("Ulukbek");
        Account_Collections_Instance account = new Account_Collections_Instance("1234567890", accountHolders);

        account.addTransaction(1000);
        account.addTransaction(-500);
        account.addTransaction(200);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holders: " + account.getAccountHolders());
        System.out.println("Transactions: " + account.getTransactions());
        System.out.println("Balance: " + account.getBalance());

        System.out.println("Has Account Holder 'Daniel': "+ account.hasAccountHolder("Daniel"));
        System.out.println("Has Account Holder 'Атакем & апакем: " + account.hasAccountHolder("Атакеь & апакем"));
    }
}
