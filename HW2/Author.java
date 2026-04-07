// Assignment: 2
// Author: Liav Lugasi, ID: 213007271

package HW2;

/**
 * Represents an author of a book.
 * @author Israel Israeli
 */

public class Author {
    private String name;
    private String email;

    /**
     * Constructs a new Author with the specified name and email.
     * @param name The name of the author.
     * @param email The email address of the author.
     */

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " at " + email;
    }
}
