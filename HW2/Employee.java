// Assignment: 2
// Author: Liav Lugasi, ID: 213007271

package HW2;

/**
 * Represents an employee in the system.
 */

public class Employee {
    private final int id;
    private String name;
    private double salary;
    private static int employeeCount= 0;

    public Employee(String name, double salary) {
        this.id = employeeCount++; // IDs start from 0
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", Name=" + name + ", Salary=" + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id; // Equality based on ID
    }
}