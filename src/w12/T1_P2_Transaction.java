package w12;

import javax.swing.plaf.PanelUI;

public class T1_P2_Transaction {
    public String transactionId;
    public String senderAccount;
    public String receiverAccount;
    public double amount;

    public T1_P2_Transaction(String id, String sender, String receiver, double amountParam){
        transactionId = id;
        senderAccount = sender;
        receiverAccount= receiver;
        amount = amountParam;

    }

    public T1_P2_Transaction(String id){
        transactionId = id;
    }
    public void displayTransaction(){
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Sender Account: " + senderAccount);
        System.out.println("Receiver Account: " + receiverAccount);
        System.out.println("Amount: $" + amount);
    }

    public static void main(String[] args) {
        T1_P2_Transaction transaction = new T1_P2_Transaction("NJO", "26.11.23", "12.12.23", 300.00);
        transaction.displayTransaction();

        T1_P2_Transaction transaction1 = new T1_P2_Transaction("FGHKJB");
        transaction1.displayTransaction();
    }
}
