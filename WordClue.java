/**
 * Sets the word and clue pair's values including slices and hints.
 * 
 * @author Andrea Sawyer
 * @version Summer 2019
 * 
 *          References and Acknowledgments: I have received no outside help on
 *          this programming assignment.
 */
public class WordClue {
    private static final int MIN_WORD_LENGTH = 4;

    private static final int MAX_CLUE_LENGTH = 40;

    private String word;

    private String clue;

    private Slice[] slices;

    /**
     * Sets the value of the word and clue. If the word is null, sets it to a
     * default. If the clue is null, empty or longer than max, sets it to a
     * default.
     * 
     * @param word The word to be guessed
     * @param clue The clue for the word
     */
    public WordClue(String word, String clue) {
        // Sets DEFAULT as the word if null or too short
        if (word == null | word.length() < MIN_WORD_LENGTH) {
            this.word = "DEFAULT";
        } else {
            this.word = word;
        }

        // Sets DEFAULT CLUE as clue if null or empty clue
        if ((clue == null) | (clue.length() == 0)
                | (clue.length() > MAX_CLUE_LENGTH)) {
            this.clue = "DEFAULT CLUE";
        } else {
            this.clue = clue;
        }
    }

    /**
     * Returns true if word matches another from other object.
     * 
     * @param other WordClue object
     * @return true if it matches, false otherwise
     */
    public boolean equals(WordClue other) {
        return word.equalsIgnoreCase(other.word);
    }

    /**
     * Obtains the clue for the word to be guessed.
     * 
     * @return clue for the word
     */
    public String getClue() {
        return this.clue;
    }

    /**
     * Obtains the first letter of the word as a hint.
     * 
     * @return the first letter of the word to be guessed
     */
    public String getFirstLetterHint() {
        return word.substring(0, 1).toUpperCase();
    }

    /**
     * Obtains the first slice as a hint.
     * 
     * @return the first slice of the word
     */
    public Slice getFirstSliceHint() {
        slices = WordUtilities.slice(word);

        return slices[0];
    }

    /**
     * Obtains all slices of the word.
     * 
     * @return all slices of the word
     */
    public Slice[] getSlices() {
        slices = WordUtilities.slice(word);
        return slices;
    }

    /**
     * Obtains the whole word to be guessed.
     * 
     * @return the whole word to be guessed
     */
    public String getWholeWordHint() {
        return word.toUpperCase();
    }

    /**
     * Obtains the word to be guessed.
     * 
     * @return the word to be guessed.
     */
    public String getWord() {
        return this.word;
    }

    /**
     * Formats the word, clue and slices.
     * 
     * @param verbose true or false depending on the format needed of the word,
     *        clue and/or slices
     * @return String representation of word and clue
     */
    public String toString(boolean verbose) {
        StringBuilder wordClue = new StringBuilder();

        wordClue.append(word + '-' + clue + "\n");

        if (verbose) {
            for (int i = 0; i < slices.length; i++) {
                wordClue.append(slices[i] + " ");
            }
            wordClue.append("\n");
        }
        return wordClue.toString();
    }

    /**
     * Returns a string of word and clue.
     * 
     * @return String representation of word and clue depending on verbose
     */
    @Override
    public String toString() {
        StringBuilder wordClue = new StringBuilder();

        wordClue.append(word + '-' + clue + "\n");

        for (int i = 0; i < slices.length; i++) {
            wordClue.append(slices[i] + " ");
        }
        wordClue.append("\n");

        return wordClue.toString();
    }
}
