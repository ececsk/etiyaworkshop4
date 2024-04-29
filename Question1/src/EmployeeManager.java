import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class EmployeeManager {
    private List<Employee> employees;


    public EmployeeManager() {
        this.employees = new ArrayList<>();
        Employee employee = new Employee(1,"Aylin","Gök","aylin@employee.com","12345","Software");
        Employee employee2 = new Employee(2,"Burak","Ak","burak@employee.com","98765","Sale");
        employees.add(employee);
        employees.add(employee2);
    }


    public void add(Employee employee) {
        employees.add(employee);
    }


    public void delete(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }


    public void update(Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getId() == updatedEmployee.getId()) {
                employee.setFirstName(updatedEmployee.getFirstName());
                employee.setLastName(updatedEmployee.getLastName());
                employee.setEmail(updatedEmployee.getEmail());
                employee.setPassword(updatedEmployee.getPassword());
                employee.setDepartment(updatedEmployee.getDepartment());
                return;
            }
        }
    }

    public List<Employee> getAll() {
        return employees;
    }

    public Employee getById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}