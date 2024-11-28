import java.util.HashMap;

public class Customer {
    private String name;
    private String customerId;
    private HashMap<String, Account> accounts; // Key: Account Number, Value: Account Object

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber); // O(1) lookup
    }

    public void showAccounts() {
        System.out.println("Accounts for Customer: " + name);
        for (String accountNumber : accounts.keySet()) {
            Account account = accounts.get(accountNumber);
            System.out.println("Account Number: " + accountNumber + ", Balance: $" + account.getBalance());
        }
    }
}
