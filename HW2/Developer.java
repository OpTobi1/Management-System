// Assignment: 2
// Author: Liav Lugasi, ID: 213007271

package HW2;

/**
 * Represents a developer employee.
 */

public class Developer extends Employee {
    private String language;

    public Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public String toString() {
        return "Developer [" + super.toString() + ", Language=" + language + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Developer developer = (Developer) obj;
        return language.equals(developer.language); // Check ID first, then language
    }
}
