import static org.junit.Assert.*;
import org.junit.Test;

class tests{
  @teste
    public void testMultiplication() {
       money five = money.dollars(5);
        assertEquals(money.dollars(10), five.times(2));
        assertEquals(money.dollars(15), five.times(3));
    }
    @teste
    public void testEquality() {
      assertTrue(money.dollars(5).equals(money.dollars(5)));
        assertFalse(money.dollars(5).equals(money.dollars(6)));
        assertTrue(money.francs(5).equals(money.francs(5)));
        assertFalse(money.francs(5).equals(money.francs(6)));
        assertFalse(money.francs(5).equals(money.dollars(5)));
    }
    @teste
    public void testFrancMultiplication() {
       money five = money.francs(5);
        assertEquals(money.francs(10), five.times(2));
        assertEquals(money.francs(15), five.times(3));
    }
  }
