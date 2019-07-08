import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * TODO needs to fix the comparison for asserts, otherwise is working.
 * 
 * @author firef
 *
 */
class WordUtilitiesTest
{

  /**
   * 
   */
  @Test
  public void testSlice()
  {
    String testWord;
    Slice testSlices[];

    testWord = "Bob"; // 3
    testSlices = new Slice[1];
    testSlices[0] = new Slice("Bob");
    Assert.assertArrayEquals(testSlices, WordUtilities.slice(testWord));

    // testWord = "TEST"; // 4
    // testSlices = new Slice[2];
    // testSlices[0] = new Slice("TE");
    // testSlices[1] = new Slice("ST");
    // Assert.assertArrayEquals(testSlices, WordUtilities.slice(testWord));

    // testWord = "abcdef"; // 6
    // testSlices = new Slice[3];
    // testSlices[0] = new Slice("ABC");
    // testSlices[1] = new Slice("DE");
    // testSlices[2] = new Slice("EF");
    // Assert.assertArrayEquals(testSlices, WordUtilities.slice(testWord));

    // testWord = "amsawyer"; // 8
    // testSlices = new Slice[4];
    // testSlices[0] = new Slice("AM");
    // testSlices[1] = new Slice("SA");
    // testSlices[2] = new Slice("WY");
    // testSlices[3] = new Slice("ER");
    // Assert.assertArrayEquals(testSlices, WordUtilities.slice(testWord));

    // testWord = "mississippi"; // 11
    // testSlices = new Slice[5];
    // testSlices[0] = new Slice("MIS");
    // testSlices[1] = new Slice("SI");
    // testSlices[2] = new Slice("SS");
    // testSlices[3] = new Slice("IP");
    // testSlices[4] = new Slice("PI");
    // Assert.assertArrayEquals(testSlices, WordUtilities.slice(testWord));

  }

}
