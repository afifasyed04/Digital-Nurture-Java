package EmployeeSystem;

public class EmployeeManager {
    private Employee[] employees;
    private int count;
    private static final int DEFAULT_CAPACITY = 10;
    
    public EmployeeManager() {
        this(DEFAULT_CAPACITY);
    }
    
    public EmployeeManager(int initialCapacity) {
        employees = new Employee[initialCapacity];
        count = 0;
    }
    
    // Add new employee
    public void addEmployee(Employee employee) {
        if (count == employees.length) {
            resizeArray();
        }
        employees[count++] = employee;
    }
    
    // Search employee by ID (linear search)
    public Employee searchById(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }
    
    // Search employees by name (returns array of matches)
    public Employee[] searchByName(String name) {
        Employee[] temp = new Employee[count];
        int matches = 0;
        
        for (int i = 0; i < count; i++) {
            if (employees[i].getName().equalsIgnoreCase(name)) {
                temp[matches++] = employees[i];
            }
        }
        
        Employee[] result = new Employee[matches];
        System.arraycopy(temp, 0, result, 0, matches);
        return result;
    }
    
    // Traverse all employees
    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
    
    // Delete employee by ID
    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                // Shift remaining elements
                System.arraycopy(employees, i + 1, employees, i, count - i - 1);
                employees[--count] = null; // Clear last reference
                return true;
            }
        }
        return false;
    }
    
    // Update employee position
    public boolean updatePosition(int employeeId, String newPosition) {
        Employee emp = searchById(employeeId);
        if (emp != null) {
            emp.setPosition(newPosition);
            return true;
        }
        return false;
    }
    
    // Update employee salary
    public boolean updateSalary(int employeeId, double newSalary) {
        Employee emp = searchById(employeeId);
        if (emp != null) {
            emp.setSalary(newSalary);
            return true;
        }
        return false;
    }
    
    // Helper method to resize array when full
    private void resizeArray() {
        Employee[] newArray = new Employee[employees.length * 2];
        System.arraycopy(employees, 0, newArray, 0, count);
        employees = newArray;
    }
    
    // Get current employee count
    public int getEmployeeCount() {
        return count;
    }
}
