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

	@Test
	public void testOdometerNext(){
		odoMeter = new OdoMeter(3);
		assertEquals(124, odoMeter.next(123));
		assertEquals(123, odoMeter.next(789));
		assertEquals(478,odoMeter.next(469));
	}

	@Test
	public void testOdometerNextN(){
		odoMeter = new OdoMeter(3);
		assertEquals(124, odoMeter.nextN(123,1));
		assertEquals(127, odoMeter.nextN(789,5));
		assertEquals(489,odoMeter.nextN(469,3));
	}

	@Test
	public void testOdometerPrevious(){
		odoMeter = new OdoMeter(4);
		assertEquals(1234, odoMeter.next(1235));
		assertEquals(3679, odoMeter.next(3689));
		assertEquals(2456,odoMeter.next(2457));
	}

	@Test
	public void testOdometerPreviousN(){
		odoMeter = new OdoMeter(3);
		assertEquals(789, odoMeter.nextN(123,1));
		assertEquals(349, odoMeter.nextN(359,4));
		assertEquals(478,odoMeter.nextN(489,2));
	}
}
