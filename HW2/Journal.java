// Assignment: 2
// Author: Liav Lugasi, ID: 213007271

package HW2;

/**
 * Represents a Journal publication.
 */
class Journal extends Publication {
    private int issue;
    private int year;

    public Journal(String title, String publication, int qty, int issueNumber, int year) {
        super(title, publication, qty);
        this.issue = issueNumber;
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + "Journal " + getTitle() + " (" + issue + ")" +
                "\npublished by " + getPublication() + " (" + year + ")";
    }
}
