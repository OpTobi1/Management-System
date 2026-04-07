// Assignment: 2
// Author: Liav Lugasi, ID: 213007271

package HW2;

/**
 * Represents a general publication in the library.
 * @author Israel Israeli
 */
public class Publication {
    private String title;
    private String publication;
    private int qty;
    private final int id;
    private static int counter = 10; // Starts from 10 as required

    /**
     * Constructs a Publication and assigns a unique ID.
     */
    public Publication(String title, String publication, int qty) {
        this.title = title;
        this.publication = publication;
        this.qty = qty;
        this.id = counter++;
    }


    // Standard getters used by subclasses for toString formatting
    protected String getTitle() {
        return title;
    }

    protected String getPublication() {
        return publication;
    }

    @Override
    public String toString() {
        return id + "-";
    }
}
