import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityAccountManager {
    private PriorityQueue<Account> accounts;

    public PriorityAccountManager() {
        accounts = new PriorityQueue<>(Comparator.comparingDouble(Account::getBalance).reversed());
    }

    public void addAccount(Account account) {
        accounts.offer(account);
    }

    public Account getHighestBalanceAccount() {
        return accounts.peek(); // Retrieves the account with the highest balance
    }

    public void showTopNAccounts(int n) {
        System.out.println("Top " + n + " Accounts by Balance:");
        int count = 0;
        for (Account account : accounts) {
            if (count++ >= n) break;
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: $" + account.getBalance());
        }
    }
}
