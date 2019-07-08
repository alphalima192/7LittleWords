import org.junit.jupiter.api.Test;

class GameInfoTest {
    private String filename;
    private GameInfo gameInfo;

    @Test
    final void testGameInfo() {
        filename = "cs.txt";
        gameInfo = new GameInfo(filename);

        // fail("Not yet implemented");
    }

    @Test
    final void testGetSlices() {
        filename = "cs.txt";
        gameInfo = new GameInfo(filename);
        gameInfo.getSlices();

        // fail("Not yet implemented");
    }

    @Test
    final void testGetWordClues() {
        filename = "cs.txt";
        gameInfo = new GameInfo(filename);
        gameInfo.getWordClues();
        // fail("Not yet implemented");
    }

    @Test
    final void testToString() {
        filename = "cs.txt";
        gameInfo = new GameInfo(filename);
        gameInfo.getSlices();
        gameInfo.getWordClues();
        gameInfo.toString();

        // fail("Not yet implemented");
    }

    @Test
    final void testIsComplete() {
        filename = "cs.txt";
        gameInfo = new GameInfo(filename);
        gameInfo.isComplete();
        // fail("Not yet implemented");
    }

}
