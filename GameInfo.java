/**
 * All the information needed for the game. Takes information from game author
 * provided in a given file and uses it to create WordClue objects and Slices.
 * 
 * @author Andrea Sawyer
 * @version Summer 2019
 * 
 *          References and Acknowledgments: I have received no outside help on
 *          this programming assignment.
 */
public class GameInfo {
    private static final int NUMBER_OF_WORDS = 7;

    private boolean complete;

    private Slice[] slices;

    private WordClue[] cluelist;

    /**
     * Checks file provided for proper information and if correct will create
     * the cluelist and slices.
     * 
     * @param filename Name of file with the word and clue list.
     */
    public GameInfo(String filename) {
        Slice[] tempSlice; // for slices
        String[] lines; // String array to hold lines
        String word; // word to be guessed and sliced
        String clue; // clue to the word
        int index; // index used to split word and clue
        int numSlices; // count number of slices
        int sliceIndex; // index of slices

        lines = new String[NUMBER_OF_WORDS]; // Sets size of line array

        // Check for file to determine null
        if (filename == null) {
            this.complete = false;
            return;
        } else {
            // Obtains lines from file, creates cluelist and slices
            if (FileUtilities.readLinesFromFile(filename,
                    NUMBER_OF_WORDS) != null) {
                System.arraycopy(FileUtilities.readLinesFromFile(filename,
                        NUMBER_OF_WORDS), 0, lines, 0, NUMBER_OF_WORDS);

                // create cluelist
                this.cluelist = new WordClue[lines.length];
                this.complete = true;
            } else {
                this.complete = false;
            }

            // create cluelist and count slices
            numSlices = 0;
            for (int i = 0; i < lines.length; i++) {
                index = lines[i].indexOf('-');
                word = lines[i].substring(0, index);
                clue = lines[i].substring(index + 1);

                cluelist[i] = new WordClue(word, clue);
                tempSlice = cluelist[i].getSlices();
                numSlices += tempSlice.length;
            }

            slices = new Slice[numSlices];
            sliceIndex = 0;
            for (int i = 0; i < cluelist.length; i++) {
                tempSlice = cluelist[i].getSlices();

                for (int j = 0; j < tempSlice.length; j++) {
                    slices[sliceIndex] = new Slice(tempSlice[j].toString());
                    sliceIndex++;
                }
            }
        }
    }

    /**
     * Gets word slices.
     * 
     * @return slices of given word
     */
    public Slice[] getSlices() {
        return this.slices;
    }

    /**
     * Gets the word clues.
     * 
     * @return clues to the word
     */
    public WordClue[] getWordClues() {
        return this.cluelist;
    }

    /**
     * String representation of word and clue list along with slices of the
     * word.
     * 
     * @return formatted string representation of the word/clue/slice list
     */
    public String toString() {
        StringBuilder list = new StringBuilder();

        // formatting the cluelist
        list.append("Cluelist\n");
        for (int i = 0; i < cluelist.length; i++) {
            list.append(cluelist[i].toString(false));
        }
        list.append("\n");

        // formatting the slice list
        list.append("Slices\n");
        for (int i = 0; i < slices.length; i++) {
            list.append(slices[i].toString() + "\n");
        }
        list.append("\n");

        return list.toString();
    }

    /**
     * True if appropriate number of words/clues are read, false otherwise.
     * 
     * @return true for correct number, false otherwise
     */
    public boolean isComplete() {
        return complete;
    }
}
