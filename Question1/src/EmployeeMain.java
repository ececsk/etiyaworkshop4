import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        // Employee operations
        EmployeeManager employeeManager = new EmployeeManager();

        List<Employee> employees = employeeManager.getAll();

        System.out.println("All Employees:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getFirstName() + " " + employee.getLastName() + ", Department: " + employee.getDepartment());
        }

        System.out.println("--------------------------------------");

        // Add a new employee
        Employee newEmployee = new Employee(4, "Gökçe", "Sarı", "gokce@example.com", "password", "IT");
        employeeManager.add(newEmployee);
        System.out.println("\nNew Employee Added:");
        System.out.println("ID: " + newEmployee.getId() + ", Name: " + newEmployee.getFirstName() + " " + newEmployee.getLastName()+ ", Department: " + newEmployee.getDepartment() );

        // Update an employee
        Employee updatedEmployee = new Employee(1, "Deniz", "Çelik", "deniz@example.com", "password", "HR");
        employeeManager.update(updatedEmployee);
        System.out.println("\nEmployee Updated:");

        // Delete an employee
        employeeManager.delete(3);
        System.out.println("\nEmployee Deleted:");

        System.out.println("--------------------------------------");
        System.out.println("All Employees:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getFirstName() + " " + employee.getLastName()+ ", Department: " + employee.getDepartment());
        }
    }
}