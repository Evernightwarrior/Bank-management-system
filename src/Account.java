import java.util.TreeMap;
import java.time.LocalDateTime;

public class Account {
    private String accountNumber;
    private double balance;
    private TreeMap<LocalDateTime, Transaction> transactions; // Key: Timestamp, Value: Transaction Object

    public Account(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.transactions = new TreeMap<>();
        addTransaction("Deposit", initialDeposit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        addTransaction("Deposit", amount);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        addTransaction("Withdrawal", amount);
        return true;
    }

    private void addTransaction(String type, double amount) {
        transactions.put(LocalDateTime.now(), new Transaction(type, amount));
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History for Account: " + accountNumber);
        for (LocalDateTime timestamp : transactions.keySet()) {
            System.out.println(timestamp + " - " + transactions.get(timestamp));
        }
    }
}
