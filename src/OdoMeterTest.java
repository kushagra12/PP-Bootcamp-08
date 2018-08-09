import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class OdoMeterTest {

	private OdoMeter odoMeter;
	
	@Test
	public void testOneDigit() {
		odoMeter = new OdoMeter(1);
		List<Integer> odoSeq = odoMeter.getOdoSeq();
		assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), odoSeq);
	}
	
	@Test
	public void testHasZero() {
		assertTrue(NumberUtils.hasZero(0));
		assertFalse(NumberUtils.hasZero(1));
		assertTrue(NumberUtils.hasZero(10));
		assertTrue(NumberUtils.hasZero(101));
	}	
	
	@Test
	public void testAscOrder() {
		assertTrue(NumberUtils.isAscOrder(1));
		assertFalse(NumberUtils.isAscOrder(21));
		assertTrue(NumberUtils.isAscOrder(12));
		assertFalse(NumberUtils.isAscOrder(2134));
		assertTrue(NumberUtils.isAscOrder(5678));
	}
	
}
