// Assignment: 2
// Author: Liav Lugasi, ID: 213007271

package HW2;

/**
 * Represents a Book publication.
 */

class Book extends Publication {
    private Author author;
    private String editor;
    private int year;

    public Book(String title, String publication, int qty, Author author, String editor, int year) {
        super(title, publication, qty);
        this.author = author;
        this.editor = editor;
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + "Book '" + getTitle() + "' by " + author +
                "\npublished by " + getPublication() + " edited by " + editor + " (" + year + ")";
    }
}
