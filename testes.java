import static org.junit.Assert.*;
import org.junit.Test;

class tests{
  @teste
    public void testMultiplication() {
      dollar five = new dollar(5);
      assertEquals(new dollar(10), five.times(2));
      assertEquals(new dollar(15), five.times(3));
    }
    @teste
    public void testEquality() {
      assertTrue(new dollar(5).equals(new dollar(5)));
      assertFalse(new dollar(5).equals(new dollar(6)));
      assertTrue(new franc(5).equals(new franc(5)));
      assertFalse(new franc(5).equals(new franc(6)));
    }
    @teste
    public void testFrancMultiplication() {
      franc five = new franc(5);
      assertEquals(new franc(10), five.times(2));
      assertEquals(new franc(15), five.times(3));
    }
  }
