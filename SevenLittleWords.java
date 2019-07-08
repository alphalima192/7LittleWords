/**
 * Uses words and their clues from a provided file to create a list of words cut
 * into slices, creates a GUI gameboard from this information so the user can
 * guess the word from the matching clue.
 * 
 * @author Andrea Sawyer
 * @version Summer 2019
 * 
 *          References and Acknowledgments: I have received no outside help on
 *          this programming assignment.
 */
public class SevenLittleWords {

    /**
     * Uses game info to create a GUI gameboard for the user to play.
     * 
     * @param args Uses command line containing the filename for the gameinfo
     */
    public static void main(String[] args) {

        GameInfo gameInfo;
        GameBoard gameBoard;

        // Check for empty command line argument, exit if nothing
        if ((args.length < 1) || args[0] == null) {
            System.out.print("No file name given.");
            System.exit(0);
        }

        // Create game info object
        gameInfo = new GameInfo(args[0]);

        // Check for correct format of GameInfo object, exit if incorrect
        if (!gameInfo.isComplete()) {
            System.out.println("Incomplete game info. Try again.");
            System.exit(0);
        }

        // Create game board, make it visible
        gameBoard = new GameBoard(gameInfo);
        gameBoard.setVisible(true);
    }

}
