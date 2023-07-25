import static org.junit.Assert.*;
import org.junit.Test;

class tests{
    public void testMultiplication() {
      dollar five = new dollar(5);
      five.times(2);
      assertEquals(10, five.amount);
    }
  }
