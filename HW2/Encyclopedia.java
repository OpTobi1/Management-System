// Assignment: 2
// Author: Liav Lugasi, ID: 213007271

package HW2;

/**
 * Represents an Encyclopedia publication.
 */
class Encyclopedia extends Publication {
    private String editor;
    private int volume;

    public Encyclopedia(String title, String publication, int qty, String editor, int volume) {
        super(title, publication, qty);
        this.editor = editor;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + "Encyclopedia " + getTitle() + " vol. " + volume +
                "\npublished by " + getPublication() + " edited by " + editor;
    }
}
