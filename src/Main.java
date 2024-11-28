import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        PriorityAccountManager priorityAccountManager = new PriorityAccountManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBank Management System");
            System.out.println("1. Add Customer");
            System.out.println("2. Create Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Show Account Details");
            System.out.println("6. Show Transaction History");
            System.out.println("7. Show Highest Balance Account");
            System.out.println("8. Show Top N Accounts by Balance");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter Customer Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.next();
                    bank.addCustomer(new Customer(name, customerId));
                    System.out.println("Customer added successfully!");
                    break;
                }
                case 2: {
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.next();
                    Customer customer = bank.getCustomer(customerId);
                    if (customer != null) {
                        System.out.print("Enter Account Number: ");
                        String accountNumber = scanner.next();
                        System.out.print("Enter Initial Deposit: ");
                        double initialDeposit = scanner.nextDouble();
                        Account account = new Account(accountNumber, initialDeposit);
                        customer.addAccount(account);
                        priorityAccountManager.addAccount(account); // Add to priority manager
                        System.out.println("Account created successfully!");
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.next();
                    Customer customer = bank.getCustomer(customerId);
                    if (customer != null) {
                        System.out.print("Enter Account Number: ");
                        String accountNumber = scanner.next();
                        Account account = customer.getAccount(accountNumber);
                        if (account != null) {
                            System.out.print("Enter Deposit Amount: ");
                            double amount = scanner.nextDouble();
                            account.deposit(amount);
                            System.out.println("Amount deposited successfully!");
                        } else {
                            System.out.println("Account not found.");
                        }
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.next();
                    Customer customer = bank.getCustomer(customerId);
                    if (customer != null) {
                        System.out.print("Enter Account Number: ");
                        String accountNumber = scanner.next();
                        Account account = customer.getAccount(accountNumber);
                        if (account != null) {
                            System.out.print("Enter Withdrawal Amount: ");
                            double amount = scanner.nextDouble();
                            if (account.withdraw(amount)) {
                                System.out.println("Amount withdrawn successfully!");
                            } else {
                                System.out.println("Insufficient balance.");
                            }
                        } else {
                            System.out.println("Account not found.");
                        }
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                }
                case 5: {
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.next();
                    Customer customer = bank.getCustomer(customerId);
                    if (customer != null) {
                        customer.showAccounts();
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                }
                case 6: {
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.next();
                    Customer customer = bank.getCustomer(customerId);
                    if (customer != null) {
                        System.out.print("Enter Account Number: ");
                        String accountNumber = scanner.next();
                        Account account = customer.getAccount(accountNumber);
                        if (account != null) {
                            account.showTransactionHistory();
                        } else {
                            System.out.println("Account not found.");
                        }
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                }
                case 7: {
                    Account topAccount = priorityAccountManager.getHighestBalanceAccount();
                    if (topAccount != null) {
                        System.out.println("Highest Balance Account: ");
                        System.out.println("Account Number: " + topAccount.getAccountNumber() + ", Balance: $" + topAccount.getBalance());
                    } else {
                        System.out.println("No accounts available.");
                    }
                    break;
                }
                case 8: {
                    System.out.print("Enter the number of top accounts to display: ");
                    int n = scanner.nextInt();
                    priorityAccountManager.showTopNAccounts(n);
                    break;
                }
                case 9:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
