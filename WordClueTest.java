import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author firef
 *
 */
class WordClueTest {
    String testWord;
    String testClue;
    WordClue wordClue;
    Slice testSlice[];

    /**
     * 
     */
    @Test
    final void testWordClue() {
        testWord = "chair";
        testClue = "sit on it to eat dinner";
        wordClue = new WordClue(testWord, testClue);
        Assert.assertEquals(testWord, wordClue.getWord());
        Assert.assertEquals(testClue, wordClue.getClue());

        testWord = "b";
        testClue = "";
        wordClue = new WordClue(testWord, testClue);
        Assert.assertEquals("DEFAULT", wordClue.getWord());
        Assert.assertEquals("DEFAULT CLUE", wordClue.getClue());

        testWord = "gibberish";
        testClue = "fkdjagoeiefkdjagoeiefkdjagoeiefkdjagoeief";
        wordClue = new WordClue(testWord, testClue);
        Assert.assertEquals(testWord, wordClue.getWord());
        Assert.assertEquals("DEFAULT CLUE", wordClue.getClue());
    }

    @Test
    final void testGetClue() {
        testWord = "tst";
        testClue = "testing";
        wordClue = new WordClue(testWord, testClue);
        wordClue.getClue();
        Assert.assertEquals(testClue, wordClue.getClue());
    }

    @Test
    final void testGetWord() {

        testWord = "chair";
        testClue = "";
        wordClue = new WordClue(testWord, testClue);
        wordClue.getWord();
        Assert.assertEquals(testWord, wordClue.getWord());
    }

    @Test
    final void testEquals() {
        //
        // testWord = "testing";
        // String testOther = "testing";
        //
        // wordClue = new WordClue(testOther.equals(testWord));
        fail("Not yet implemented");

    }

    @Test
    final void testGetFirstLetterHint() {
        testWord = "Hint";
        testClue = "";
        wordClue = new WordClue(testWord, testClue);
        wordClue.getFirstLetterHint();
        Assert.assertEquals("H", wordClue.getFirstLetterHint());
    }

    @Test
    final void testGetWholeWordHint() {
        testWord = "Hint";
        testClue = "";
        wordClue = new WordClue(testWord, testClue);
        wordClue.getWholeWordHint();
        Assert.assertEquals(testWord.toUpperCase(),
                wordClue.getWholeWordHint());
    }

    @Test
    final void testGetFirstSliceHint() {
        testWord = "Slice";
        testClue = "";
        testSlice = new Slice[1];
        testSlice[0] = new Slice("SLI");

        wordClue = new WordClue(testWord, testClue);
        wordClue.getFirstSliceHint();
        // System.out.println(testWord + " " + wordClue.getFirstSliceHint()); //
        // TODO Remove
        Assert.assertEquals(testSlice[0].toString(),
                wordClue.getFirstSliceHint().toString());
    }

    @Test
    final void testGetSlices() {
        testWord = "Slice";
        testClue = "";
        testSlice = new Slice[2];
        testSlice[0] = new Slice("SLI");
        testSlice[1] = new Slice("CE");
        wordClue = new WordClue(testWord, testClue);
        wordClue.getSlices();
        Assert.assertArrayEquals(testSlice, wordClue.getSlices());
    }

    @Test
    final void testToString() {
        testWord = "string";
        testClue = "Java word";
        boolean testVerbose = false;
        wordClue = new WordClue(testWord, testClue);
        wordClue.getSlices();
        System.out.println(wordClue.toString(testVerbose));
        wordClue.toString();

        testWord = "house";
        testClue = "Structure you live in";
        testVerbose = true;
        wordClue = new WordClue(testWord, testClue);
        wordClue.getSlices();
        System.out.println(wordClue.toString(testVerbose));
        wordClue.toString();

    }

}
