import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Utility class for Seven Little Words.
 * 
 * @author CS149 Profesors, James Madison University
 * @version Fall 2018
 */
public class FileUtilities {

    /**
     * Read and return the given number of lines from the given file.
     * 
     * @param filename
     *            The name of the file to read from
     * @param numebrOfLines
     *            The number of lines to read
     * @return The array of lines (or null if there was a problem)
     */
    public static String[] readLinesFromFile(String filename,
            int numberOfLines) {

        String[] result;

        try {
            File file = new File(filename);
            Scanner in = new Scanner(file);
            result = new String[numberOfLines];

            for (int i = 0; in.hasNextLine() && i < numberOfLines; i++) {

                result[i] = in.nextLine();
            }
            in.close();
        } catch (FileNotFoundException ioe) {
            result = null;
        }
        return result;
    }
}
