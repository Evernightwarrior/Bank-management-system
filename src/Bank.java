import java.util.HashMap;

public class Bank {
    private HashMap<String, Customer> customers; // Key: Customer ID, Value: Customer Object

    public Bank() {
        this.customers = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public Customer getCustomer(String customerId) {
        return customers.get(customerId); // O(1) lookup
    }

    public void showAllCustomers() {
        for (String customerId : customers.keySet()) {
            System.out.println("Customer ID: " + customerId + ", Name: " + customers.get(customerId).getName());
        }
    }
}
