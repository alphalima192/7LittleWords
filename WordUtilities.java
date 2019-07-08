/**
 * Creates slices of the word to be guessed.
 * 
 * @author Andrea Sawyer
 * @version Summer 2019
 * 
 *          References and Acknowledgments: I have received no outside help on
 *          this programming assignment.
 */
public class WordUtilities {
    /**
     * Actively slices the word and places into an array of slices.
     * 
     * @param word to be sliced
     * @return Array of slices
     * 
     */
    public static Slice[] slice(String word) {
        String wholeWord = word; // word to be sliced
        int length = wholeWord.length(); // number of characters in the word
        int numSlices; // size of array
        int firstSlice; // ending index of slices
        int secondSlice;
        int index = 0;
        Slice[] slices; // array for the slices

        wholeWord = wholeWord.toUpperCase(); // converts to all upper-case

        // determines correct number of slices for the word
        if ((length % 3) == 0) {
            // slices must contain 3 letters each
            numSlices = length / 3; // determines number of slices
            firstSlice = 3;
            secondSlice = 3;
        } else if ((length % 2) == 0) {
            // slices must contain 2 letters each
            numSlices = length / 2; // determines number of slices
            firstSlice = 2;
            secondSlice = 2;
        } else {
            // slice 0 must contain 3 letters, rest 2 letters
            numSlices = ((length - 3) / 2) + 1;
            firstSlice = 3;
            secondSlice = 2;
        }

        slices = new Slice[numSlices]; // gives a size to the array

        for (int i = 0; i < numSlices; i++) {
            if (slices[0] == null) { // puts first slice into array
                slices[i] = new Slice(
                        wholeWord.substring(index, index + firstSlice));
                wholeWord = wholeWord.substring(firstSlice, length);
            }
            if (slices[i] == null) {
                slices[i] = new Slice(
                        wholeWord.substring(index, index + secondSlice));
                wholeWord = wholeWord.substring(secondSlice,
                        wholeWord.length());
            }
        }
        return slices;
    }
}
