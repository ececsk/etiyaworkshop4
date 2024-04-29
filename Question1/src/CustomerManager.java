import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CustomerManager {
    private List<Customer> customers;

    public CustomerManager() {
        this.customers = new ArrayList<>();
        Customer customer = new Customer(1,"Ali","Aydın","ali@customer.com","1234","5534789555","aydin");
        Customer customer2 = new Customer(2,"Aslı","Şimşek","asli@customer.com","9876","5423689585","istanbul");
        customers.add(customer);
        customers.add(customer2);
    }

   public void add(Customer customer) {
        customers.add(customer);
    }


    public void delete(int id) {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }

    public void update(Customer updatedCustomer) {
        for (Customer customer : customers) {
            if (customer.getId() == updatedCustomer.getId()) {
                customer.setFirstName(updatedCustomer.getFirstName());
                customer.setLastName(updatedCustomer.getLastName());
                customer.setEmail(updatedCustomer.getEmail());
                customer.setPassword(updatedCustomer.getPassword());
                customer.setPhoneNumber(updatedCustomer.getPhoneNumber());
                customer.setAddress(updatedCustomer.getAddress());
                return;
            }
        }
    }

    public List<Customer> getAll() {
        return customers;
    }

    public Customer getById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
