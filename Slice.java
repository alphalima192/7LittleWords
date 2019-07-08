/**
 * Determines if a slice is used or not.
 * 
 * @author Andrea Sawyer
 * @version Summer 2019
 * 
 *          References and Acknowledgments: I have received no outside help on
 *          this programming assignment.
 */
public class Slice {
    private boolean used;

    private String text;

    /**
     * Sets the slice.
     * 
     * @param text slice of word
     */
    public Slice(String text) {
        this.text = text;
    }

    /**
     * Determines if the slice is used or unused.
     * 
     * @return true if slice is used, false otherwise
     */
    public boolean isUsed() {
        return text.compareToIgnoreCase(this.text) == 0;
    }

    /**
     * Resets the slice used value to false.
     */
    public void reset() {
        this.used = false;
    }

    /**
     * Returns empty string if slice is used, text otherwise.
     * 
     * @return tostring
     * 
     */
    public String toString() {
        if (used) {
            return "";
        } else {
            return text;
        }
    }

    /**
     * Sets the slice used value to true.
     */
    public void use() {
        this.used = true;
    }
}
