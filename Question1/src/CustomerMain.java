import java.util.List;
public class CustomerMain {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        List<Customer> customers = customerManager.getAll();

        System.out.println("All Customers:");
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getFirstName() + " " + customer.getLastName());
        }

        System.out.println("--------------------------------------");

        // Add a new customer
        Customer newCustomer = new Customer(4, "Can", "Aydoğan", "can@example.com", "password3", "5564689977", "İstanbul");
        customerManager.add(newCustomer);
        System.out.println("\nNew Customer Added:");
        System.out.println("ID: " + newCustomer.getId() + ", Name: " + newCustomer.getFirstName() + " " + newCustomer.getLastName());

        // Update a customer
        Customer updatedCustomer = new Customer(1, "Mert", "Tan", "mert@example.com", "password5", "534563553", "İzmir");
        customerManager.update(updatedCustomer);
        System.out.println("\nCustomer Updated:");

        // Delete a customer
        customerManager.delete(3);
        System.out.println("\nCustomer Deleted:");

        System.out.println("--------------------------------------");
        System.out.println("All Customers:");
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getFirstName() + " " + customer.getLastName());
        }
    }
}