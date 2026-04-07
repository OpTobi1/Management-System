// Assignment: 2
// Author: Liav Lugasi, ID: 213007271

package HW2;

/**
 * Represents a manager employee.
 */

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager [" + super.toString() + ", Department=" + department + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Manager manager = (Manager) obj;
        return department.equals(manager.department); // Check ID first, then department
    }
}
