import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author firef
 *
 */
public class SliceTest
{

  /**
   * 
   */
  @Test
  public void testSlice()
  {
    // String expected;
    // String actual;
    //
    // expected = "test";
    // actual = Slice.Slice("test");
    // Assert.assertEquals(expected, actual);
    fail("Not yet implemented");

  }

  /**
   * 
   */
  @Test
  public void testIsUsed()
  {
    boolean actual;
    boolean expected;
    Slice s = new Slice("test");
    // Slice t = new Slice("wrong");

    expected = true;
    actual = s.isUsed();
    Assert.assertTrue(actual == expected);
    // Assert.assertSame(expected, actual);

    // expected = true;
    // actual = s.isUsed();
    // Assert.assertEquals(s, t);
  }

  /**
   * 
   */
  @Test
  void testReset() // FIXME not working
  {
    boolean actual;
    boolean expected;
    Slice s = new Slice("test");

    expected = false;
    s.reset();
    actual = s.isUsed();
    Assert.assertTrue(actual == expected);
    // Assert.fail("Not yet implemented");

  }

  /**
   * 
   */
  @Test
  void testToString()
  {
    Slice s = new Slice("test");

    Assert.assertNotNull(s.toString());

    // fail("Not yet implemented");
  }

  /**
   * 
   */
  @Test
  void testUse()
  {

    boolean actual;
    boolean expected;
    Slice s = new Slice("test");

    expected = true;
    s.use();
    actual = s.isUsed();
    Assert.assertTrue(actual == expected);

    // fail("Not yet implemented");
  }

}
