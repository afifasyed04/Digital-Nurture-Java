package EmployeeSystem;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);
        
        // Add employees
        manager.addEmployee(new Employee(101, "John Doe", "Developer", 75000));
        manager.addEmployee(new Employee(102, "Jane Smith", "Manager", 90000));
        manager.addEmployee(new Employee(103, "Alice Johnson", "Designer", 65000));
        manager.addEmployee(new Employee(104, "Bob Williams", "Developer", 78000));
        manager.addEmployee(new Employee(105, "Carol Brown", "HR Specialist", 60000));
        
        // Display all employees
        System.out.println("All Employees:");
        manager.traverseEmployees();
        System.out.println();
        
        // Search operations
        System.out.println("Search for ID 103:");
        Employee emp103 = manager.searchById(103);
        System.out.println(emp103 != null ? emp103 : "Not found");
        
        System.out.println("\nSearch for name 'John Doe':");
        Employee[] johns = manager.searchByName("John Doe");
        for (Employee e : johns) {
            System.out.println(e);
        }
        System.out.println();
        
        // Update operations
        System.out.println("Updating position for ID 101:");
        manager.updatePosition(101, "Senior Developer");
        System.out.println(manager.searchById(101));
        
        System.out.println("\nUpdating salary for ID 102:");
        manager.updateSalary(102, 95000);
        System.out.println(manager.searchById(102));
        System.out.println();
        
        // Delete operation
        System.out.println("Deleting employee with ID 104:");
        boolean deleted = manager.deleteEmployee(104);
        System.out.println(deleted ? "Successfully deleted" : "Employee not found");
        
        System.out.println("\nRemaining Employees:");
        manager.traverseEmployees();
    }
}
