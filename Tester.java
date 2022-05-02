import static org.junit.Assert.*;
import org.junit.*;
public class Tester{
  @Test
  public void testAdd()
  {
    assertEquals(2,Random.add(1, 1));
  }
}